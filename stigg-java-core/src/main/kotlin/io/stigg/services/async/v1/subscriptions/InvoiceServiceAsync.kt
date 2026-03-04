// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.subscriptions

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.subscriptions.invoice.InvoiceMarkAsPaidParams
import io.stigg.models.v1.subscriptions.invoice.InvoiceMarkAsPaidResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Operations related to subscriptions */
interface InvoiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceServiceAsync

    /**
     * Marks the latest invoice of a subscription as paid in the billing provider. The invoice must
     * exist and have an OPEN status.
     */
    fun markAsPaid(id: String): CompletableFuture<InvoiceMarkAsPaidResponse> =
        markAsPaid(id, InvoiceMarkAsPaidParams.none())

    /** @see markAsPaid */
    fun markAsPaid(
        id: String,
        params: InvoiceMarkAsPaidParams = InvoiceMarkAsPaidParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceMarkAsPaidResponse> =
        markAsPaid(params.toBuilder().id(id).build(), requestOptions)

    /** @see markAsPaid */
    fun markAsPaid(
        id: String,
        params: InvoiceMarkAsPaidParams = InvoiceMarkAsPaidParams.none(),
    ): CompletableFuture<InvoiceMarkAsPaidResponse> = markAsPaid(id, params, RequestOptions.none())

    /** @see markAsPaid */
    fun markAsPaid(
        params: InvoiceMarkAsPaidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceMarkAsPaidResponse>

    /** @see markAsPaid */
    fun markAsPaid(params: InvoiceMarkAsPaidParams): CompletableFuture<InvoiceMarkAsPaidResponse> =
        markAsPaid(params, RequestOptions.none())

    /** @see markAsPaid */
    fun markAsPaid(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceMarkAsPaidResponse> =
        markAsPaid(id, InvoiceMarkAsPaidParams.none(), requestOptions)

    /**
     * A view of [InvoiceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvoiceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/invoice/paid`, but is
         * otherwise the same as [InvoiceServiceAsync.markAsPaid].
         */
        fun markAsPaid(id: String): CompletableFuture<HttpResponseFor<InvoiceMarkAsPaidResponse>> =
            markAsPaid(id, InvoiceMarkAsPaidParams.none())

        /** @see markAsPaid */
        fun markAsPaid(
            id: String,
            params: InvoiceMarkAsPaidParams = InvoiceMarkAsPaidParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceMarkAsPaidResponse>> =
            markAsPaid(params.toBuilder().id(id).build(), requestOptions)

        /** @see markAsPaid */
        fun markAsPaid(
            id: String,
            params: InvoiceMarkAsPaidParams = InvoiceMarkAsPaidParams.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceMarkAsPaidResponse>> =
            markAsPaid(id, params, RequestOptions.none())

        /** @see markAsPaid */
        fun markAsPaid(
            params: InvoiceMarkAsPaidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceMarkAsPaidResponse>>

        /** @see markAsPaid */
        fun markAsPaid(
            params: InvoiceMarkAsPaidParams
        ): CompletableFuture<HttpResponseFor<InvoiceMarkAsPaidResponse>> =
            markAsPaid(params, RequestOptions.none())

        /** @see markAsPaid */
        fun markAsPaid(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceMarkAsPaidResponse>> =
            markAsPaid(id, InvoiceMarkAsPaidParams.none(), requestOptions)
    }
}
