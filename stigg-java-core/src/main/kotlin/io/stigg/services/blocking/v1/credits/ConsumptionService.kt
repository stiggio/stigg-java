// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.credits

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.credits.consumption.ConsumptionConsumeAsyncParams
import io.stigg.models.v1.credits.consumption.ConsumptionConsumeAsyncResponse
import io.stigg.models.v1.credits.consumption.ConsumptionConsumeParams
import io.stigg.models.v1.credits.consumption.ConsumptionConsumeResponse
import java.util.function.Consumer

interface ConsumptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConsumptionService

    /**
     * Consumes a specified amount of credits directly from a customer wallet, with no feature
     * mapping. Returns the optimistic balance.
     */
    fun consume(params: ConsumptionConsumeParams): ConsumptionConsumeResponse =
        consume(params, RequestOptions.none())

    /** @see consume */
    fun consume(
        params: ConsumptionConsumeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConsumptionConsumeResponse

    /**
     * Consumes credits directly from customer wallets asynchronously. Consumptions are reconciled
     * asynchronously into the credit balances.
     */
    fun consumeAsync(params: ConsumptionConsumeAsyncParams): ConsumptionConsumeAsyncResponse =
        consumeAsync(params, RequestOptions.none())

    /** @see consumeAsync */
    fun consumeAsync(
        params: ConsumptionConsumeAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConsumptionConsumeAsyncResponse

    /**
     * A view of [ConsumptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConsumptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/credits/consumption`, but is otherwise the
         * same as [ConsumptionService.consume].
         */
        @MustBeClosed
        fun consume(params: ConsumptionConsumeParams): HttpResponseFor<ConsumptionConsumeResponse> =
            consume(params, RequestOptions.none())

        /** @see consume */
        @MustBeClosed
        fun consume(
            params: ConsumptionConsumeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConsumptionConsumeResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/credits/consumption/async`, but is
         * otherwise the same as [ConsumptionService.consumeAsync].
         */
        @MustBeClosed
        fun consumeAsync(
            params: ConsumptionConsumeAsyncParams
        ): HttpResponseFor<ConsumptionConsumeAsyncResponse> =
            consumeAsync(params, RequestOptions.none())

        /** @see consumeAsync */
        @MustBeClosed
        fun consumeAsync(
            params: ConsumptionConsumeAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConsumptionConsumeAsyncResponse>
    }
}
