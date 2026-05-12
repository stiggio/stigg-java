// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.credits

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.credits.autorecharge.AutoRechargeGetAutoRechargeParams
import io.stigg.models.v1.credits.autorecharge.AutoRechargeGetAutoRechargeResponse
import java.util.function.Consumer

interface AutoRechargeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoRechargeService

    /**
     * Retrieves the automatic recharge configuration for a customer and currency. Returns default
     * settings if no configuration exists.
     */
    fun getAutoRecharge(
        params: AutoRechargeGetAutoRechargeParams
    ): AutoRechargeGetAutoRechargeResponse = getAutoRecharge(params, RequestOptions.none())

    /** @see getAutoRecharge */
    fun getAutoRecharge(
        params: AutoRechargeGetAutoRechargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutoRechargeGetAutoRechargeResponse

    /**
     * A view of [AutoRechargeService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutoRechargeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/credits/auto-recharge`, but is otherwise the
         * same as [AutoRechargeService.getAutoRecharge].
         */
        @MustBeClosed
        fun getAutoRecharge(
            params: AutoRechargeGetAutoRechargeParams
        ): HttpResponseFor<AutoRechargeGetAutoRechargeResponse> =
            getAutoRecharge(params, RequestOptions.none())

        /** @see getAutoRecharge */
        @MustBeClosed
        fun getAutoRecharge(
            params: AutoRechargeGetAutoRechargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutoRechargeGetAutoRechargeResponse>
    }
}
