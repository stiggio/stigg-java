// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async

import com.stigg.api.core.ClientOptions
import com.stigg.api.services.async.v2.CustomerServiceAsync
import com.stigg.api.services.async.v2.CustomerServiceAsyncImpl
import com.stigg.api.services.async.v2.PermissionServiceAsync
import com.stigg.api.services.async.v2.PermissionServiceAsyncImpl
import java.util.function.Consumer

class V2ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V2ServiceAsync {

    private val withRawResponse: V2ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customers: CustomerServiceAsync by lazy { CustomerServiceAsyncImpl(clientOptions) }

    private val permissions: PermissionServiceAsync by lazy {
        PermissionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): V2ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync =
        V2ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerServiceAsync = customers

    override fun permissions(): PermissionServiceAsync = permissions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2ServiceAsync.WithRawResponse {

        private val customers: CustomerServiceAsync.WithRawResponse by lazy {
            CustomerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val permissions: PermissionServiceAsync.WithRawResponse by lazy {
            PermissionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V2ServiceAsync.WithRawResponse =
            V2ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun customers(): CustomerServiceAsync.WithRawResponse = customers

        override fun permissions(): PermissionServiceAsync.WithRawResponse = permissions
    }
}
