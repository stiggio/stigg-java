// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1beta

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1beta.customers.CustomerRetrieveGovernanceParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveGovernance() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customerService = client.v1Beta().customers()

        val response =
            customerService.retrieveGovernance(
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

        response.validate()
    }
}
