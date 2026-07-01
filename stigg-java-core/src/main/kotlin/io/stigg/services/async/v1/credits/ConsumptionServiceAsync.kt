// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.credits

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.credits.consumption.ConsumptionConsumeAsyncParams
import io.stigg.models.v1.credits.consumption.ConsumptionConsumeAsyncResponse
import io.stigg.models.v1.credits.consumption.ConsumptionConsumeParams
import io.stigg.models.v1.credits.consumption.ConsumptionConsumeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConsumptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConsumptionServiceAsync

    /**
     * Consumes a specified amount of credits directly from a customer wallet, with no feature
     * mapping. Returns the optimistic balance.
     */
    fun consume(params: ConsumptionConsumeParams): CompletableFuture<ConsumptionConsumeResponse> =
        consume(params, RequestOptions.none())

    /** @see consume */
    fun consume(
        params: ConsumptionConsumeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConsumptionConsumeResponse>

    /**
     * Consumes credits directly from customer wallets asynchronously. Consumptions are reconciled
     * asynchronously into the credit balances.
     */
    fun consumeAsync(
        params: ConsumptionConsumeAsyncParams
    ): CompletableFuture<ConsumptionConsumeAsyncResponse> =
        consumeAsync(params, RequestOptions.none())

    /** @see consumeAsync */
    fun consumeAsync(
        params: ConsumptionConsumeAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConsumptionConsumeAsyncResponse>

    /**
     * A view of [ConsumptionServiceAsync] that provides access to raw HTTP responses for each
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
        ): ConsumptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/credits/consumption`, but is otherwise the
         * same as [ConsumptionServiceAsync.consume].
         */
        fun consume(
            params: ConsumptionConsumeParams
        ): CompletableFuture<HttpResponseFor<ConsumptionConsumeResponse>> =
            consume(params, RequestOptions.none())

        /** @see consume */
        fun consume(
            params: ConsumptionConsumeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConsumptionConsumeResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/credits/consumption/async`, but is
         * otherwise the same as [ConsumptionServiceAsync.consumeAsync].
         */
        fun consumeAsync(
            params: ConsumptionConsumeAsyncParams
        ): CompletableFuture<HttpResponseFor<ConsumptionConsumeAsyncResponse>> =
            consumeAsync(params, RequestOptions.none())

        /** @see consumeAsync */
        fun consumeAsync(
            params: ConsumptionConsumeAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConsumptionConsumeAsyncResponse>>
    }
}
