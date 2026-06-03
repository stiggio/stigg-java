// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.entitlements

import io.stigg.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementCheckParamsTest {

    @Test
    fun create() {
        EntitlementCheckParams.builder()
            .id("x")
            .currencyId("x")
            .dimensions(
                EntitlementCheckParams.Dimensions.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .featureId("x")
            .requestedUsage(0L)
            .addRequestedValue("string")
            .resourceId("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params = EntitlementCheckParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            EntitlementCheckParams.builder()
                .id("x")
                .currencyId("x")
                .dimensions(
                    EntitlementCheckParams.Dimensions.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .featureId("x")
                .requestedUsage(0L)
                .addRequestedValue("string")
                .resourceId("x")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("currencyId", "x")
                    .put("dimensions[foo]", "string")
                    .put("featureId", "x")
                    .put("requestedUsage", "0")
                    .put("requestedValues", listOf("string").joinToString(","))
                    .put("resourceId", "x")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EntitlementCheckParams.builder().id("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
