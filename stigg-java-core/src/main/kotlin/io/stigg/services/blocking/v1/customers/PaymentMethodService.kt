// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.customers

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.CustomerResponse
import io.stigg.models.v1.customers.paymentmethod.PaymentMethodAttachParams
import io.stigg.models.v1.customers.paymentmethod.PaymentMethodDetachParams
import java.util.function.Consumer

interface PaymentMethodService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentMethodService

    /** Attach payment method */
    fun attach(id: String, params: PaymentMethodAttachParams): CustomerResponse =
        attach(id, params, RequestOptions.none())

    /** @see attach */
    fun attach(
        id: String,
        params: PaymentMethodAttachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerResponse = attach(params.toBuilder().id(id).build(), requestOptions)

    /** @see attach */
    fun attach(params: PaymentMethodAttachParams): CustomerResponse =
        attach(params, RequestOptions.none())

    /** @see attach */
    fun attach(
        params: PaymentMethodAttachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerResponse

    /** Detach payment method */
    fun detach(id: String): CustomerResponse = detach(id, PaymentMethodDetachParams.none())

    /** @see detach */
    fun detach(
        id: String,
        params: PaymentMethodDetachParams = PaymentMethodDetachParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerResponse = detach(params.toBuilder().id(id).build(), requestOptions)

    /** @see detach */
    fun detach(
        id: String,
        params: PaymentMethodDetachParams = PaymentMethodDetachParams.none(),
    ): CustomerResponse = detach(id, params, RequestOptions.none())

    /** @see detach */
    fun detach(
        params: PaymentMethodDetachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerResponse

    /** @see detach */
    fun detach(params: PaymentMethodDetachParams): CustomerResponse =
        detach(params, RequestOptions.none())

    /** @see detach */
    fun detach(id: String, requestOptions: RequestOptions): CustomerResponse =
        detach(id, PaymentMethodDetachParams.none(), requestOptions)

    /**
     * A view of [PaymentMethodService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaymentMethodService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/{id}/payment-method`, but is
         * otherwise the same as [PaymentMethodService.attach].
         */
        @MustBeClosed
        fun attach(
            id: String,
            params: PaymentMethodAttachParams,
        ): HttpResponseFor<CustomerResponse> = attach(id, params, RequestOptions.none())

        /** @see attach */
        @MustBeClosed
        fun attach(
            id: String,
            params: PaymentMethodAttachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerResponse> =
            attach(params.toBuilder().id(id).build(), requestOptions)

        /** @see attach */
        @MustBeClosed
        fun attach(params: PaymentMethodAttachParams): HttpResponseFor<CustomerResponse> =
            attach(params, RequestOptions.none())

        /** @see attach */
        @MustBeClosed
        fun attach(
            params: PaymentMethodAttachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerResponse>

        /**
         * Returns a raw HTTP response for `delete /api/v1/customers/{id}/payment-method`, but is
         * otherwise the same as [PaymentMethodService.detach].
         */
        @MustBeClosed
        fun detach(id: String): HttpResponseFor<CustomerResponse> =
            detach(id, PaymentMethodDetachParams.none())

        /** @see detach */
        @MustBeClosed
        fun detach(
            id: String,
            params: PaymentMethodDetachParams = PaymentMethodDetachParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerResponse> =
            detach(params.toBuilder().id(id).build(), requestOptions)

        /** @see detach */
        @MustBeClosed
        fun detach(
            id: String,
            params: PaymentMethodDetachParams = PaymentMethodDetachParams.none(),
        ): HttpResponseFor<CustomerResponse> = detach(id, params, RequestOptions.none())

        /** @see detach */
        @MustBeClosed
        fun detach(
            params: PaymentMethodDetachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerResponse>

        /** @see detach */
        @MustBeClosed
        fun detach(params: PaymentMethodDetachParams): HttpResponseFor<CustomerResponse> =
            detach(params, RequestOptions.none())

        /** @see detach */
        @MustBeClosed
        fun detach(id: String, requestOptions: RequestOptions): HttpResponseFor<CustomerResponse> =
            detach(id, PaymentMethodDetachParams.none(), requestOptions)
    }
}
