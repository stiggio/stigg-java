// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.consumption

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConsumptionConsumeParamsTest {

    @Test
    fun create() {
        ConsumptionConsumeParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .amount(1.0)
            .currencyId("currencyId")
            .customerId("customerId")
            .idempotencyKey("x")
            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dimensions(
                ConsumptionConsumeParams.Dimensions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .resourceId("resourceId")
            .build()
    }

    @Test
    fun headers() {
        val params =
            ConsumptionConsumeParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .amount(1.0)
                .currencyId("currencyId")
                .customerId("customerId")
                .idempotencyKey("x")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dimensions(
                    ConsumptionConsumeParams.Dimensions.builder()
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
            ConsumptionConsumeParams.builder()
                .amount(1.0)
                .currencyId("currencyId")
                .customerId("customerId")
                .idempotencyKey("x")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ConsumptionConsumeParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .amount(1.0)
                .currencyId("currencyId")
                .customerId("customerId")
                .idempotencyKey("x")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dimensions(
                    ConsumptionConsumeParams.Dimensions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .resourceId("resourceId")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1.0)
        assertThat(body.currencyId()).isEqualTo("currencyId")
        assertThat(body.customerId()).isEqualTo("customerId")
        assertThat(body.idempotencyKey()).isEqualTo("x")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.dimensions())
            .contains(
                ConsumptionConsumeParams.Dimensions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.resourceId()).contains("resourceId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConsumptionConsumeParams.builder()
                .amount(1.0)
                .currencyId("currencyId")
                .customerId("customerId")
                .idempotencyKey("x")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1.0)
        assertThat(body.currencyId()).isEqualTo("currencyId")
        assertThat(body.customerId()).isEqualTo("customerId")
        assertThat(body.idempotencyKey()).isEqualTo("x")
    }
}
