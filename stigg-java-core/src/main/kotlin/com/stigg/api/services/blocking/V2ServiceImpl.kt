// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking

import com.stigg.api.core.ClientOptions
import com.stigg.api.services.blocking.v2.CustomerService
import com.stigg.api.services.blocking.v2.CustomerServiceImpl
import com.stigg.api.services.blocking.v2.PermissionService
import com.stigg.api.services.blocking.v2.PermissionServiceImpl
import java.util.function.Consumer

class V2ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V2Service {

    private val withRawResponse: V2Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customers: CustomerService by lazy { CustomerServiceImpl(clientOptions) }

    private val permissions: PermissionService by lazy { PermissionServiceImpl(clientOptions) }

    override fun withRawResponse(): V2Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service =
        V2ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerService = customers

    override fun permissions(): PermissionService = permissions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2Service.WithRawResponse {

        private val customers: CustomerService.WithRawResponse by lazy {
            CustomerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val permissions: PermissionService.WithRawResponse by lazy {
            PermissionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V2Service.WithRawResponse =
            V2ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun customers(): CustomerService.WithRawResponse = customers

        override fun permissions(): PermissionService.WithRawResponse = permissions
    }
}
