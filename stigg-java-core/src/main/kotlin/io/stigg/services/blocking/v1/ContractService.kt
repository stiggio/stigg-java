// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.contracts.ContractCreateParams
import io.stigg.models.v1.contracts.ContractCreateResponse
import io.stigg.models.v1.contracts.ContractDeleteParams
import io.stigg.models.v1.contracts.ContractDeleteResponse
import io.stigg.models.v1.contracts.ContractListPage
import io.stigg.models.v1.contracts.ContractListParams
import io.stigg.models.v1.contracts.ContractRetrieveParams
import io.stigg.models.v1.contracts.ContractRetrieveResponse
import io.stigg.models.v1.contracts.ContractUpdateParams
import io.stigg.models.v1.contracts.ContractUpdateResponse
import java.util.function.Consumer

interface ContractService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractService

    /**
     * Creates a contract for a customer together with all of its (custom) subscriptions in a single
     * atomic operation. Every new subscription is created inside one transaction — any validation
     * or creation failure rolls the whole contract back. Each subscription entry is either a new
     * subscription to create or a reference to an existing custom subscription. Returns the created
     * contract.
     */
    fun create(params: ContractCreateParams): ContractCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContractCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractCreateResponse

    /**
     * Retrieves a single contract by its ID, enriched with a preview of its upcoming (next) invoice
     * when one is available. Returns 404 when no contract with that ID exists in the environment.
     */
    fun retrieve(id: String): ContractRetrieveResponse = retrieve(id, ContractRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ContractRetrieveParams = ContractRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ContractRetrieveParams = ContractRetrieveParams.none(),
    ): ContractRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ContractRetrieveParams): ContractRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ContractRetrieveResponse =
        retrieve(id, ContractRetrieveParams.none(), requestOptions)

    /**
     * Updates a contract's metadata (name, PO number, activation dates) and optionally re-links its
     * subscriptions. Best-effort re-syncs the change to the connected billing provider.
     */
    fun update(id: String): ContractUpdateResponse = update(id, ContractUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: ContractUpdateParams = ContractUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: ContractUpdateParams = ContractUpdateParams.none(),
    ): ContractUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ContractUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractUpdateResponse

    /** @see update */
    fun update(params: ContractUpdateParams): ContractUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): ContractUpdateResponse =
        update(id, ContractUpdateParams.none(), requestOptions)

    /**
     * Retrieves a cursor-paginated list of contracts in the environment, fetched live from the
     * connected billing provider. Each contract is enriched with a preview of its upcoming (next)
     * invoice when one is available. Returns an empty list when no billing provider is connected.
     * Supports filtering by customer external ID, state, and name.
     */
    fun list(): ContractListPage = list(ContractListParams.none())

    /** @see list */
    fun list(
        params: ContractListParams = ContractListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractListPage

    /** @see list */
    fun list(params: ContractListParams = ContractListParams.none()): ContractListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ContractListPage =
        list(ContractListParams.none(), requestOptions)

    /**
     * Deletes a contract: cancels the contract in the connected billing provider and cancels every
     * subscription linked to it.
     */
    fun delete(id: String): ContractDeleteResponse = delete(id, ContractDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ContractDeleteParams = ContractDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ContractDeleteParams = ContractDeleteParams.none(),
    ): ContractDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ContractDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractDeleteResponse

    /** @see delete */
    fun delete(params: ContractDeleteParams): ContractDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): ContractDeleteResponse =
        delete(id, ContractDeleteParams.none(), requestOptions)

    /** A view of [ContractService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/contracts`, but is otherwise the same as
         * [ContractService.create].
         */
        @MustBeClosed
        fun create(params: ContractCreateParams): HttpResponseFor<ContractCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ContractCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/contracts/{id}`, but is otherwise the same
         * as [ContractService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ContractRetrieveResponse> =
            retrieve(id, ContractRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ContractRetrieveParams = ContractRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ContractRetrieveParams = ContractRetrieveParams.none(),
        ): HttpResponseFor<ContractRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ContractRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ContractRetrieveParams): HttpResponseFor<ContractRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractRetrieveResponse> =
            retrieve(id, ContractRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/contracts/{id}`, but is otherwise the same
         * as [ContractService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<ContractUpdateResponse> =
            update(id, ContractUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: ContractUpdateParams = ContractUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: ContractUpdateParams = ContractUpdateParams.none(),
        ): HttpResponseFor<ContractUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ContractUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: ContractUpdateParams): HttpResponseFor<ContractUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractUpdateResponse> =
            update(id, ContractUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/contracts`, but is otherwise the same as
         * [ContractService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ContractListPage> = list(ContractListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ContractListParams = ContractListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ContractListParams = ContractListParams.none()
        ): HttpResponseFor<ContractListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ContractListPage> =
            list(ContractListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/contracts/{id}/archive`, but is otherwise
         * the same as [ContractService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<ContractDeleteResponse> =
            delete(id, ContractDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ContractDeleteParams = ContractDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ContractDeleteParams = ContractDeleteParams.none(),
        ): HttpResponseFor<ContractDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ContractDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ContractDeleteParams): HttpResponseFor<ContractDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractDeleteResponse> =
            delete(id, ContractDeleteParams.none(), requestOptions)
    }
}
