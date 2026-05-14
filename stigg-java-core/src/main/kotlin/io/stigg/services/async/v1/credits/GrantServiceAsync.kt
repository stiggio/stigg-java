// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.credits

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.credits.grants.CreditGrantResponse
import io.stigg.models.v1.credits.grants.GrantCreateParams
import io.stigg.models.v1.credits.grants.GrantListPageAsync
import io.stigg.models.v1.credits.grants.GrantListParams
import io.stigg.models.v1.credits.grants.GrantVoidParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Operations related to credit grants */
interface GrantServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GrantServiceAsync

    /**
     * Creates a new credit grant for a customer with specified amount, type, and optional billing
     * configuration.
     */
    fun create(params: GrantCreateParams): CompletableFuture<CreditGrantResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GrantCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGrantResponse>

    /** Retrieves a paginated list of credit grants for a customer. */
    fun list(params: GrantListParams): CompletableFuture<GrantListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GrantListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GrantListPageAsync>

    /** Voids an existing credit grant, preventing further consumption of the remaining credits. */
    fun void_(id: String): CompletableFuture<CreditGrantResponse> =
        void_(id, GrantVoidParams.none())

    /** @see void_ */
    fun void_(
        id: String,
        params: GrantVoidParams = GrantVoidParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGrantResponse> =
        void_(params.toBuilder().id(id).build(), requestOptions)

    /** @see void_ */
    fun void_(
        id: String,
        params: GrantVoidParams = GrantVoidParams.none(),
    ): CompletableFuture<CreditGrantResponse> = void_(id, params, RequestOptions.none())

    /** @see void_ */
    fun void_(
        params: GrantVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGrantResponse>

    /** @see void_ */
    fun void_(params: GrantVoidParams): CompletableFuture<CreditGrantResponse> =
        void_(params, RequestOptions.none())

    /** @see void_ */
    fun void_(id: String, requestOptions: RequestOptions): CompletableFuture<CreditGrantResponse> =
        void_(id, GrantVoidParams.none(), requestOptions)

    /** A view of [GrantServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GrantServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/credits/grants`, but is otherwise the same
         * as [GrantServiceAsync.create].
         */
        fun create(
            params: GrantCreateParams
        ): CompletableFuture<HttpResponseFor<CreditGrantResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: GrantCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditGrantResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/credits/grants`, but is otherwise the same
         * as [GrantServiceAsync.list].
         */
        fun list(params: GrantListParams): CompletableFuture<HttpResponseFor<GrantListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: GrantListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GrantListPageAsync>>

        /**
         * Returns a raw HTTP response for `post /api/v1/credits/grants/{id}/void`, but is otherwise
         * the same as [GrantServiceAsync.void_].
         */
        fun void_(id: String): CompletableFuture<HttpResponseFor<CreditGrantResponse>> =
            void_(id, GrantVoidParams.none())

        /** @see void_ */
        fun void_(
            id: String,
            params: GrantVoidParams = GrantVoidParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditGrantResponse>> =
            void_(params.toBuilder().id(id).build(), requestOptions)

        /** @see void_ */
        fun void_(
            id: String,
            params: GrantVoidParams = GrantVoidParams.none(),
        ): CompletableFuture<HttpResponseFor<CreditGrantResponse>> =
            void_(id, params, RequestOptions.none())

        /** @see void_ */
        fun void_(
            params: GrantVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditGrantResponse>>

        /** @see void_ */
        fun void_(
            params: GrantVoidParams
        ): CompletableFuture<HttpResponseFor<CreditGrantResponse>> =
            void_(params, RequestOptions.none())

        /** @see void_ */
        fun void_(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditGrantResponse>> =
            void_(id, GrantVoidParams.none(), requestOptions)
    }
}
