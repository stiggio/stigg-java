// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventEstimateCostParamsTest {

    @Test
    fun create() {
        EventEstimateCostParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .customerId("customerId")
            .eventName("x")
            .dimensions(
                EventEstimateCostParams.Dimensions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .resourceId("resourceId")
            .build()
    }

    @Test
    fun headers() {
        val params =
            EventEstimateCostParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .customerId("customerId")
                .eventName("x")
                .dimensions(
                    EventEstimateCostParams.Dimensions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .resourceId("resourceId")
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
            EventEstimateCostParams.builder().customerId("customerId").eventName("x").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            EventEstimateCostParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .customerId("customerId")
                .eventName("x")
                .dimensions(
                    EventEstimateCostParams.Dimensions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .resourceId("resourceId")
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("customerId")
        assertThat(body.eventName()).isEqualTo("x")
        assertThat(body.dimensions())
            .contains(
                EventEstimateCostParams.Dimensions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.resourceId()).contains("resourceId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventEstimateCostParams.builder().customerId("customerId").eventName("x").build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("customerId")
        assertThat(body.eventName()).isEqualTo("x")
    }
}
