// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.contracts.ContractCreateParams
import io.stigg.models.v1.contracts.ContractCreateResponse
import io.stigg.models.v1.contracts.ContractDeleteParams
import io.stigg.models.v1.contracts.ContractDeleteResponse
import io.stigg.models.v1.contracts.ContractListPageAsync
import io.stigg.models.v1.contracts.ContractListParams
import io.stigg.models.v1.contracts.ContractRetrieveParams
import io.stigg.models.v1.contracts.ContractRetrieveResponse
import io.stigg.models.v1.contracts.ContractUpdateParams
import io.stigg.models.v1.contracts.ContractUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ContractServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractServiceAsync

    /**
     * Creates a contract for a customer together with all of its (custom) subscriptions in a single
     * atomic operation. Every new subscription is created inside one transaction — any validation
     * or creation failure rolls the whole contract back. Each subscription entry is either a new
     * subscription to create or a reference to an existing custom subscription. Returns the created
     * contract.
     */
    fun create(params: ContractCreateParams): CompletableFuture<ContractCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContractCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractCreateResponse>

    /**
     * Retrieves a single contract by its ID, enriched with a preview of its upcoming (next) invoice
     * when one is available. Returns 404 when no contract with that ID exists in the environment.
     */
    fun retrieve(id: String): CompletableFuture<ContractRetrieveResponse> =
        retrieve(id, ContractRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ContractRetrieveParams = ContractRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ContractRetrieveParams = ContractRetrieveParams.none(),
    ): CompletableFuture<ContractRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ContractRetrieveParams): CompletableFuture<ContractRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContractRetrieveResponse> =
        retrieve(id, ContractRetrieveParams.none(), requestOptions)

    /**
     * Updates a contract's metadata (name, PO number, activation dates) and optionally re-links its
     * subscriptions. Best-effort re-syncs the change to the connected billing provider.
     */
    fun update(id: String): CompletableFuture<ContractUpdateResponse> =
        update(id, ContractUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: ContractUpdateParams = ContractUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: ContractUpdateParams = ContractUpdateParams.none(),
    ): CompletableFuture<ContractUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ContractUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractUpdateResponse>

    /** @see update */
    fun update(params: ContractUpdateParams): CompletableFuture<ContractUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContractUpdateResponse> =
        update(id, ContractUpdateParams.none(), requestOptions)

    /**
     * Retrieves a cursor-paginated list of contracts in the environment, fetched live from the
     * connected billing provider. Each contract is enriched with a preview of its upcoming (next)
     * invoice when one is available. Returns an empty list when no billing provider is connected.
     * Supports filtering by customer external ID, state, and name.
     */
    fun list(): CompletableFuture<ContractListPageAsync> = list(ContractListParams.none())

    /** @see list */
    fun list(
        params: ContractListParams = ContractListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractListPageAsync>

    /** @see list */
    fun list(
        params: ContractListParams = ContractListParams.none()
    ): CompletableFuture<ContractListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ContractListPageAsync> =
        list(ContractListParams.none(), requestOptions)

    /**
     * Deletes a contract: cancels the contract in the connected billing provider and cancels every
     * subscription linked to it.
     */
    fun delete(id: String): CompletableFuture<ContractDeleteResponse> =
        delete(id, ContractDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ContractDeleteParams = ContractDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ContractDeleteParams = ContractDeleteParams.none(),
    ): CompletableFuture<ContractDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ContractDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractDeleteResponse>

    /** @see delete */
    fun delete(params: ContractDeleteParams): CompletableFuture<ContractDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContractDeleteResponse> =
        delete(id, ContractDeleteParams.none(), requestOptions)

    /**
     * A view of [ContractServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContractServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/contracts`, but is otherwise the same as
         * [ContractServiceAsync.create].
         */
        fun create(
            params: ContractCreateParams
        ): CompletableFuture<HttpResponseFor<ContractCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ContractCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/contracts/{id}`, but is otherwise the same
         * as [ContractServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ContractRetrieveResponse>> =
            retrieve(id, ContractRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ContractRetrieveParams = ContractRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ContractRetrieveParams = ContractRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ContractRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ContractRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ContractRetrieveParams
        ): CompletableFuture<HttpResponseFor<ContractRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContractRetrieveResponse>> =
            retrieve(id, ContractRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/contracts/{id}`, but is otherwise the same
         * as [ContractServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<ContractUpdateResponse>> =
            update(id, ContractUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: ContractUpdateParams = ContractUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: ContractUpdateParams = ContractUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ContractUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ContractUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractUpdateResponse>>

        /** @see update */
        fun update(
            params: ContractUpdateParams
        ): CompletableFuture<HttpResponseFor<ContractUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContractUpdateResponse>> =
            update(id, ContractUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/contracts`, but is otherwise the same as
         * [ContractServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ContractListPageAsync>> =
            list(ContractListParams.none())

        /** @see list */
        fun list(
            params: ContractListParams = ContractListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractListPageAsync>>

        /** @see list */
        fun list(
            params: ContractListParams = ContractListParams.none()
        ): CompletableFuture<HttpResponseFor<ContractListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ContractListPageAsync>> =
            list(ContractListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/contracts/{id}/archive`, but is otherwise
         * the same as [ContractServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<ContractDeleteResponse>> =
            delete(id, ContractDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: ContractDeleteParams = ContractDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: ContractDeleteParams = ContractDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ContractDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ContractDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ContractDeleteParams
        ): CompletableFuture<HttpResponseFor<ContractDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContractDeleteResponse>> =
            delete(id, ContractDeleteParams.none(), requestOptions)
    }
}
