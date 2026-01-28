// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.CustomerResponse
import io.stigg.models.v1.customers.paymentmethod.PaymentMethodAttachParams
import io.stigg.models.v1.customers.paymentmethod.PaymentMethodDetachParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PaymentMethodServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentMethodServiceAsync

    /** Attach payment method */
    fun attach(id: String, params: PaymentMethodAttachParams): CompletableFuture<CustomerResponse> =
        attach(id, params, RequestOptions.none())

    /** @see attach */
    fun attach(
        id: String,
        params: PaymentMethodAttachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse> =
        attach(params.toBuilder().id(id).build(), requestOptions)

    /** @see attach */
    fun attach(params: PaymentMethodAttachParams): CompletableFuture<CustomerResponse> =
        attach(params, RequestOptions.none())

    /** @see attach */
    fun attach(
        params: PaymentMethodAttachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse>

    /** Detach payment method */
    fun detach(id: String): CompletableFuture<CustomerResponse> =
        detach(id, PaymentMethodDetachParams.none())

    /** @see detach */
    fun detach(
        id: String,
        params: PaymentMethodDetachParams = PaymentMethodDetachParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse> =
        detach(params.toBuilder().id(id).build(), requestOptions)

    /** @see detach */
    fun detach(
        id: String,
        params: PaymentMethodDetachParams = PaymentMethodDetachParams.none(),
    ): CompletableFuture<CustomerResponse> = detach(id, params, RequestOptions.none())

    /** @see detach */
    fun detach(
        params: PaymentMethodDetachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerResponse>

    /** @see detach */
    fun detach(params: PaymentMethodDetachParams): CompletableFuture<CustomerResponse> =
        detach(params, RequestOptions.none())

    /** @see detach */
    fun detach(id: String, requestOptions: RequestOptions): CompletableFuture<CustomerResponse> =
        detach(id, PaymentMethodDetachParams.none(), requestOptions)

    /**
     * A view of [PaymentMethodServiceAsync] that provides access to raw HTTP responses for each
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
        ): PaymentMethodServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/{id}/payment-method`, but is
         * otherwise the same as [PaymentMethodServiceAsync.attach].
         */
        fun attach(
            id: String,
            params: PaymentMethodAttachParams,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            attach(id, params, RequestOptions.none())

        /** @see attach */
        fun attach(
            id: String,
            params: PaymentMethodAttachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            attach(params.toBuilder().id(id).build(), requestOptions)

        /** @see attach */
        fun attach(
            params: PaymentMethodAttachParams
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            attach(params, RequestOptions.none())

        /** @see attach */
        fun attach(
            params: PaymentMethodAttachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/customers/{id}/payment-method`, but is
         * otherwise the same as [PaymentMethodServiceAsync.detach].
         */
        fun detach(id: String): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            detach(id, PaymentMethodDetachParams.none())

        /** @see detach */
        fun detach(
            id: String,
            params: PaymentMethodDetachParams = PaymentMethodDetachParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            detach(params.toBuilder().id(id).build(), requestOptions)

        /** @see detach */
        fun detach(
            id: String,
            params: PaymentMethodDetachParams = PaymentMethodDetachParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            detach(id, params, RequestOptions.none())

        /** @see detach */
        fun detach(
            params: PaymentMethodDetachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerResponse>>

        /** @see detach */
        fun detach(
            params: PaymentMethodDetachParams
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            detach(params, RequestOptions.none())

        /** @see detach */
        fun detach(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> =
            detach(id, PaymentMethodDetachParams.none(), requestOptions)
    }
}
