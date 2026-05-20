// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.credits

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.credits.grants.CreditGrantResponse
import io.stigg.models.v1.events.credits.grants.GrantCreateParams
import io.stigg.models.v1.events.credits.grants.GrantListPage
import io.stigg.models.v1.events.credits.grants.GrantListParams
import io.stigg.models.v1.events.credits.grants.GrantVoidParams
import java.util.function.Consumer

/** Operations related to credit grants */
interface GrantService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GrantService

    /**
     * Creates a new credit grant for a customer with specified amount, type, and optional billing
     * configuration.
     */
    fun create(params: GrantCreateParams): CreditGrantResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GrantCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditGrantResponse

    /** Retrieves a paginated list of credit grants for a customer. */
    fun list(params: GrantListParams): GrantListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GrantListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GrantListPage

    /** Voids an existing credit grant, preventing further consumption of the remaining credits. */
    fun void_(id: String): CreditGrantResponse = void_(id, GrantVoidParams.none())

    /** @see void_ */
    fun void_(
        id: String,
        params: GrantVoidParams = GrantVoidParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditGrantResponse = void_(params.toBuilder().id(id).build(), requestOptions)

    /** @see void_ */
    fun void_(id: String, params: GrantVoidParams = GrantVoidParams.none()): CreditGrantResponse =
        void_(id, params, RequestOptions.none())

    /** @see void_ */
    fun void_(
        params: GrantVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditGrantResponse

    /** @see void_ */
    fun void_(params: GrantVoidParams): CreditGrantResponse = void_(params, RequestOptions.none())

    /** @see void_ */
    fun void_(id: String, requestOptions: RequestOptions): CreditGrantResponse =
        void_(id, GrantVoidParams.none(), requestOptions)

    /** A view of [GrantService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GrantService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/credits/grants`, but is otherwise the same
         * as [GrantService.create].
         */
        @MustBeClosed
        fun create(params: GrantCreateParams): HttpResponseFor<CreditGrantResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GrantCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditGrantResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/credits/grants`, but is otherwise the same
         * as [GrantService.list].
         */
        @MustBeClosed
        fun list(params: GrantListParams): HttpResponseFor<GrantListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GrantListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GrantListPage>

        /**
         * Returns a raw HTTP response for `post /api/v1/credits/grants/{id}/void`, but is otherwise
         * the same as [GrantService.void_].
         */
        @MustBeClosed
        fun void_(id: String): HttpResponseFor<CreditGrantResponse> =
            void_(id, GrantVoidParams.none())

        /** @see void_ */
        @MustBeClosed
        fun void_(
            id: String,
            params: GrantVoidParams = GrantVoidParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditGrantResponse> =
            void_(params.toBuilder().id(id).build(), requestOptions)

        /** @see void_ */
        @MustBeClosed
        fun void_(
            id: String,
            params: GrantVoidParams = GrantVoidParams.none(),
        ): HttpResponseFor<CreditGrantResponse> = void_(id, params, RequestOptions.none())

        /** @see void_ */
        @MustBeClosed
        fun void_(
            params: GrantVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditGrantResponse>

        /** @see void_ */
        @MustBeClosed
        fun void_(params: GrantVoidParams): HttpResponseFor<CreditGrantResponse> =
            void_(params, RequestOptions.none())

        /** @see void_ */
        @MustBeClosed
        fun void_(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditGrantResponse> = void_(id, GrantVoidParams.none(), requestOptions)
    }
}
