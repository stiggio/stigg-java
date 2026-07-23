// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.usage

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageEstimateParamsTest {

    @Test
    fun create() {
        UsageEstimateParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .customerId("customerId")
            .featureId("featureId")
            .value(-9007199254740991L)
            .dimensions(
                UsageEstimateParams.Dimensions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .resourceId("resourceId")
            .updateBehavior(UsageEstimateParams.UpdateBehavior.DELTA)
            .build()
    }

    @Test
    fun headers() {
        val params =
            UsageEstimateParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .customerId("customerId")
                .featureId("featureId")
                .value(-9007199254740991L)
                .dimensions(
                    UsageEstimateParams.Dimensions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .resourceId("resourceId")
                .updateBehavior(UsageEstimateParams.UpdateBehavior.DELTA)
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
        val params =
            UsageEstimateParams.builder()
                .customerId("customerId")
                .featureId("featureId")
                .value(-9007199254740991L)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            UsageEstimateParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .customerId("customerId")
                .featureId("featureId")
                .value(-9007199254740991L)
                .dimensions(
                    UsageEstimateParams.Dimensions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .resourceId("resourceId")
                .updateBehavior(UsageEstimateParams.UpdateBehavior.DELTA)
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("customerId")
        assertThat(body.featureId()).isEqualTo("featureId")
        assertThat(body.value()).isEqualTo(-9007199254740991L)
        assertThat(body.dimensions())
            .contains(
                UsageEstimateParams.Dimensions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.resourceId()).contains("resourceId")
        assertThat(body.updateBehavior()).contains(UsageEstimateParams.UpdateBehavior.DELTA)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UsageEstimateParams.builder()
                .customerId("customerId")
                .featureId("featureId")
                .value(-9007199254740991L)
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("customerId")
        assertThat(body.featureId()).isEqualTo("featureId")
        assertThat(body.value()).isEqualTo(-9007199254740991L)
    }
}
