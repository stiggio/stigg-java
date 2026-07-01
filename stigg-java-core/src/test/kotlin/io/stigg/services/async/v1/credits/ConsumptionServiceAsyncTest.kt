// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.credits

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.credits.consumption.ConsumptionConsumeAsyncParams
import io.stigg.models.v1.credits.consumption.ConsumptionConsumeParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConsumptionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun consume() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val consumptionServiceAsync = client.v1().credits().consumption()

        val responseFuture =
            consumptionServiceAsync.consume(
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
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun consumeAsync() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val consumptionServiceAsync = client.v1().credits().consumption()

        val responseFuture =
            consumptionServiceAsync.consumeAsync(
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}
