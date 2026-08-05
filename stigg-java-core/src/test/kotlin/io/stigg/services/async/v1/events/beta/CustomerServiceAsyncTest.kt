// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.beta

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.events.beta.customers.CustomerRetrieveGovernanceParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveGovernance() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customerServiceAsync = client.v1().events().beta().customers()

        val responseFuture =
            customerServiceAsync.retrieveGovernance(
                CustomerRetrieveGovernanceParams.builder()
                    .id("id")
                    .after("after")
                    .addCurrencyId("string")
                    .entityIdSearch("x")
                    .addEntityTypeId("string")
                    .addFeatureId("string")
                    .limit(1L)
                    .minUtilization(0.0)
                    .order(CustomerRetrieveGovernanceParams.Order.ASC)
                    .scope(CustomerRetrieveGovernanceParams.Scope.ALL)
                    .sortBy(CustomerRetrieveGovernanceParams.SortBy.UTILIZATION)
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
