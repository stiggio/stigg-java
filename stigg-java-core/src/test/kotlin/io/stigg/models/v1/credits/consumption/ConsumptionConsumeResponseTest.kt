// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.consumption

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConsumptionConsumeResponseTest {

    @Test
    fun create() {
        val consumptionConsumeResponse =
            ConsumptionConsumeResponse.builder()
                .data(
                    ConsumptionConsumeResponse.Data.builder()
                        .amount(0.0)
                        .currencyId("currencyId")
                        .customerId("customerId")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .credit(
                            ConsumptionConsumeResponse.Data.Credit.builder()
                                .currencyId("currencyId")
                                .currentUsage(0.0)
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usageLimit(0.0)
                                .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .resourceId("resourceId")
                        .build()
                )
                .build()

        assertThat(consumptionConsumeResponse.data())
            .isEqualTo(
                ConsumptionConsumeResponse.Data.builder()
                    .amount(0.0)
                    .currencyId("currencyId")
                    .customerId("customerId")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .credit(
                        ConsumptionConsumeResponse.Data.Credit.builder()
                            .currencyId("currencyId")
                            .currentUsage(0.0)
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .usageLimit(0.0)
                            .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .resourceId("resourceId")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val consumptionConsumeResponse =
            ConsumptionConsumeResponse.builder()
                .data(
                    ConsumptionConsumeResponse.Data.builder()
                        .amount(0.0)
                        .currencyId("currencyId")
                        .customerId("customerId")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .credit(
                            ConsumptionConsumeResponse.Data.Credit.builder()
                                .currencyId("currencyId")
                                .currentUsage(0.0)
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usageLimit(0.0)
                                .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .resourceId("resourceId")
                        .build()
                )
                .build()

        val roundtrippedConsumptionConsumeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(consumptionConsumeResponse),
                jacksonTypeRef<ConsumptionConsumeResponse>(),
            )

        assertThat(roundtrippedConsumptionConsumeResponse).isEqualTo(consumptionConsumeResponse)
    }
}
