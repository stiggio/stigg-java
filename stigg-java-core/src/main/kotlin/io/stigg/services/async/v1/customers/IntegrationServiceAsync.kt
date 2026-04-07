// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.CustomerIntegrationResponse
import io.stigg.models.v1.customers.integrations.IntegrationLinkParams
import io.stigg.models.v1.customers.integrations.IntegrationListPageAsync
import io.stigg.models.v1.customers.integrations.IntegrationListParams
import io.stigg.models.v1.customers.integrations.IntegrationRetrieveParams
import io.stigg.models.v1.customers.integrations.IntegrationUnlinkParams
import io.stigg.models.v1.customers.integrations.IntegrationUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IntegrationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegrationServiceAsync

    /** Retrieves a specific integration for a customer by integration ID. */
    fun retrieve(
        integrationId: String,
        params: IntegrationRetrieveParams,
    ): CompletableFuture<CustomerIntegrationResponse> =
        retrieve(integrationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        integrationId: String,
        params: IntegrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerIntegrationResponse> =
        retrieve(params.toBuilder().integrationId(integrationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: IntegrationRetrieveParams
    ): CompletableFuture<CustomerIntegrationResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IntegrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerIntegrationResponse>

    /** Updates a customer's integration link, such as changing the synced external entity ID. */
    fun update(
        integrationId: String,
        params: IntegrationUpdateParams,
    ): CompletableFuture<CustomerIntegrationResponse> =
        update(integrationId, params, RequestOptions.none())

    /** @see update */
    fun update(
        integrationId: String,
        params: IntegrationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerIntegrationResponse> =
        update(params.toBuilder().integrationId(integrationId).build(), requestOptions)

    /** @see update */
    fun update(params: IntegrationUpdateParams): CompletableFuture<CustomerIntegrationResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: IntegrationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerIntegrationResponse>

    /** Retrieves a paginated list of a customer's external integrations (billing, CRM, etc.). */
    fun list(id: String): CompletableFuture<IntegrationListPageAsync> =
        list(id, IntegrationListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: IntegrationListParams = IntegrationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationListPageAsync> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: IntegrationListParams = IntegrationListParams.none(),
    ): CompletableFuture<IntegrationListPageAsync> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: IntegrationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationListPageAsync>

    /** @see list */
    fun list(params: IntegrationListParams): CompletableFuture<IntegrationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationListPageAsync> =
        list(id, IntegrationListParams.none(), requestOptions)

    /**
     * Links a customer to an external integration by specifying the vendor and external entity ID.
     */
    fun link(
        pathId: String,
        params: IntegrationLinkParams,
    ): CompletableFuture<CustomerIntegrationResponse> = link(pathId, params, RequestOptions.none())

    /** @see link */
    fun link(
        pathId: String,
        params: IntegrationLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerIntegrationResponse> =
        link(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see link */
    fun link(params: IntegrationLinkParams): CompletableFuture<CustomerIntegrationResponse> =
        link(params, RequestOptions.none())

    /** @see link */
    fun link(
        params: IntegrationLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerIntegrationResponse>

    /** Removes the link between a customer and an external integration. */
    fun unlink(
        integrationId: String,
        params: IntegrationUnlinkParams,
    ): CompletableFuture<CustomerIntegrationResponse> =
        unlink(integrationId, params, RequestOptions.none())

    /** @see unlink */
    fun unlink(
        integrationId: String,
        params: IntegrationUnlinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerIntegrationResponse> =
        unlink(params.toBuilder().integrationId(integrationId).build(), requestOptions)

    /** @see unlink */
    fun unlink(params: IntegrationUnlinkParams): CompletableFuture<CustomerIntegrationResponse> =
        unlink(params, RequestOptions.none())

    /** @see unlink */
    fun unlink(
        params: IntegrationUnlinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerIntegrationResponse>

    /**
     * A view of [IntegrationServiceAsync] that provides access to raw HTTP responses for each
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
        ): IntegrationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/customers/{id}/integrations/{integrationId}`, but is otherwise the same as
         * [IntegrationServiceAsync.retrieve].
         */
        fun retrieve(
            integrationId: String,
            params: IntegrationRetrieveParams,
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>> =
            retrieve(integrationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            integrationId: String,
            params: IntegrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>> =
            retrieve(params.toBuilder().integrationId(integrationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: IntegrationRetrieveParams
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: IntegrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/customers/{id}/integrations/{integrationId}`, but is otherwise the same as
         * [IntegrationServiceAsync.update].
         */
        fun update(
            integrationId: String,
            params: IntegrationUpdateParams,
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>> =
            update(integrationId, params, RequestOptions.none())

        /** @see update */
        fun update(
            integrationId: String,
            params: IntegrationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>> =
            update(params.toBuilder().integrationId(integrationId).build(), requestOptions)

        /** @see update */
        fun update(
            params: IntegrationUpdateParams
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: IntegrationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{id}/integrations`, but is
         * otherwise the same as [IntegrationServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<IntegrationListPageAsync>> =
            list(id, IntegrationListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: IntegrationListParams = IntegrationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationListPageAsync>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: IntegrationListParams = IntegrationListParams.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationListPageAsync>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: IntegrationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationListPageAsync>>

        /** @see list */
        fun list(
            params: IntegrationListParams
        ): CompletableFuture<HttpResponseFor<IntegrationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationListPageAsync>> =
            list(id, IntegrationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/{id}/integrations`, but is
         * otherwise the same as [IntegrationServiceAsync.link].
         */
        fun link(
            pathId: String,
            params: IntegrationLinkParams,
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>> =
            link(pathId, params, RequestOptions.none())

        /** @see link */
        fun link(
            pathId: String,
            params: IntegrationLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>> =
            link(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see link */
        fun link(
            params: IntegrationLinkParams
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>> =
            link(params, RequestOptions.none())

        /** @see link */
        fun link(
            params: IntegrationLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/customers/{id}/integrations/{integrationId}`, but is otherwise the same as
         * [IntegrationServiceAsync.unlink].
         */
        fun unlink(
            integrationId: String,
            params: IntegrationUnlinkParams,
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>> =
            unlink(integrationId, params, RequestOptions.none())

        /** @see unlink */
        fun unlink(
            integrationId: String,
            params: IntegrationUnlinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>> =
            unlink(params.toBuilder().integrationId(integrationId).build(), requestOptions)

        /** @see unlink */
        fun unlink(
            params: IntegrationUnlinkParams
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>> =
            unlink(params, RequestOptions.none())

        /** @see unlink */
        fun unlink(
            params: IntegrationUnlinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerIntegrationResponse>>
    }
}
