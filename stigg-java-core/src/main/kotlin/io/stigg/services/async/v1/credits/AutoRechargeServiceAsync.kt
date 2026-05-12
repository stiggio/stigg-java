// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.credits

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.credits.autorecharge.AutoRechargeGetAutoRechargeParams
import io.stigg.models.v1.credits.autorecharge.AutoRechargeGetAutoRechargeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AutoRechargeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoRechargeServiceAsync

    /**
     * Retrieves the automatic recharge configuration for a customer and currency. Returns default
     * settings if no configuration exists.
     */
    fun getAutoRecharge(
        params: AutoRechargeGetAutoRechargeParams
    ): CompletableFuture<AutoRechargeGetAutoRechargeResponse> =
        getAutoRecharge(params, RequestOptions.none())

    /** @see getAutoRecharge */
    fun getAutoRecharge(
        params: AutoRechargeGetAutoRechargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutoRechargeGetAutoRechargeResponse>

    /**
     * A view of [AutoRechargeServiceAsync] that provides access to raw HTTP responses for each
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
        ): AutoRechargeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/credits/auto-recharge`, but is otherwise the
         * same as [AutoRechargeServiceAsync.getAutoRecharge].
         */
        fun getAutoRecharge(
            params: AutoRechargeGetAutoRechargeParams
        ): CompletableFuture<HttpResponseFor<AutoRechargeGetAutoRechargeResponse>> =
            getAutoRecharge(params, RequestOptions.none())

        /** @see getAutoRecharge */
        fun getAutoRecharge(
            params: AutoRechargeGetAutoRechargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutoRechargeGetAutoRechargeResponse>>
    }
}
