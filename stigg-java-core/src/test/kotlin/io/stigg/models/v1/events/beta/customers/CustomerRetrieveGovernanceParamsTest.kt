// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.beta.customers

import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerRetrieveGovernanceParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params = CustomerRetrieveGovernanceParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-ACCOUNT-ID", "X-ACCOUNT-ID")
                    .put("X-ENVIRONMENT-ID", "X-ENVIRONMENT-ID")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = CustomerRetrieveGovernanceParams.builder().id("id").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("currencyIds", listOf("string").joinToString(","))
                    .put("entityIdSearch", "x")
                    .put("entityTypeIds", listOf("string").joinToString(","))
                    .put("featureIds", listOf("string").joinToString(","))
                    .put("limit", "1")
                    .put("minUtilization", "0.0")
                    .put("order", "asc")
                    .put("scope", "all")
                    .put("sortBy", "utilization")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerRetrieveGovernanceParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
