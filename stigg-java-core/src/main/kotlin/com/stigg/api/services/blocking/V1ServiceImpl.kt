// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking

import com.stigg.api.core.ClientOptions
import com.stigg.api.services.blocking.v1.CustomerService
import com.stigg.api.services.blocking.v1.CustomerServiceImpl
import com.stigg.api.services.blocking.v1.PermissionService
import com.stigg.api.services.blocking.v1.PermissionServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customers: CustomerService by lazy { CustomerServiceImpl(clientOptions) }

    private val permissions: PermissionService by lazy { PermissionServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerService = customers

    override fun permissions(): PermissionService = permissions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val customers: CustomerService.WithRawResponse by lazy {
            CustomerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val permissions: PermissionService.WithRawResponse by lazy {
            PermissionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun customers(): CustomerService.WithRawResponse = customers

        override fun permissions(): PermissionService.WithRawResponse = permissions
    }
}
