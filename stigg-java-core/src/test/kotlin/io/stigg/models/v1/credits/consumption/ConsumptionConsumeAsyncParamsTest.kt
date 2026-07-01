// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.consumption

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConsumptionConsumeAsyncParamsTest {

    @Test
    fun create() {
        ConsumptionConsumeAsyncParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .addConsumption(
                ConsumptionConsumeAsyncParams.Consumption.builder()
                    .amount(1.0)
                    .currencyId("currencyId")
                    .customerId("customerId")
                    .idempotencyKey("x")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dimensions(
                        ConsumptionConsumeAsyncParams.Consumption.Dimensions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .resourceId("resourceId")
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            ConsumptionConsumeAsyncParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addConsumption(
                    ConsumptionConsumeAsyncParams.Consumption.builder()
                        .amount(1.0)
                        .currencyId("currencyId")
                        .customerId("customerId")
                        .idempotencyKey("x")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dimensions(
                            ConsumptionConsumeAsyncParams.Consumption.Dimensions.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .resourceId("resourceId")
                        .build()
                )
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
            ConsumptionConsumeAsyncParams.builder()
                .addConsumption(
                    ConsumptionConsumeAsyncParams.Consumption.builder()
                        .amount(1.0)
                        .currencyId("currencyId")
                        .customerId("customerId")
                        .idempotencyKey("x")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ConsumptionConsumeAsyncParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addConsumption(
                    ConsumptionConsumeAsyncParams.Consumption.builder()
                        .amount(1.0)
                        .currencyId("currencyId")
                        .customerId("customerId")
                        .idempotencyKey("x")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dimensions(
                            ConsumptionConsumeAsyncParams.Consumption.Dimensions.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .resourceId("resourceId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.consumptions())
            .containsExactly(
                ConsumptionConsumeAsyncParams.Consumption.builder()
                    .amount(1.0)
                    .currencyId("currencyId")
                    .customerId("customerId")
                    .idempotencyKey("x")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dimensions(
                        ConsumptionConsumeAsyncParams.Consumption.Dimensions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .resourceId("resourceId")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConsumptionConsumeAsyncParams.builder()
                .addConsumption(
                    ConsumptionConsumeAsyncParams.Consumption.builder()
                        .amount(1.0)
                        .currencyId("currencyId")
                        .customerId("customerId")
                        .idempotencyKey("x")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.consumptions())
            .containsExactly(
                ConsumptionConsumeAsyncParams.Consumption.builder()
                    .amount(1.0)
                    .currencyId("currencyId")
                    .customerId("customerId")
                    .idempotencyKey("x")
                    .build()
            )
    }
}
