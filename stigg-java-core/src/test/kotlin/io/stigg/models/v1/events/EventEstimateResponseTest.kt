// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventEstimateResponseTest {

    @Test
    fun create() {
        val eventEstimateResponse =
            EventEstimateResponse.builder()
                .data(
                    EventEstimateResponse.Data.builder()
                        .addEstimate(
                            EventEstimateResponse.Data.Estimate.builder()
                                .balanceAfterEstimate(0.0)
                                .addBreakdown(
                                    EventEstimateResponse.Data.Estimate.Breakdown.builder()
                                        .cost(0.0)
                                        .featureId("featureId")
                                        .warningCode(
                                            EventEstimateResponse.Data.Estimate.Breakdown
                                                .WarningCode
                                                .UNSUPPORTED_AGGREGATION
                                        )
                                        .build()
                                )
                                .currencyId("currencyId")
                                .currentBalance(0.0)
                                .estimatedCost(0.0)
                                .wouldOverdraft(true)
                                .build()
                        )
                        .addWarning(
                            EventEstimateResponse.Data.Warning.RESOURCE_SCOPED_SUBSCRIPTION_EXISTS
                        )
                        .build()
                )
                .build()

        assertThat(eventEstimateResponse.data())
            .isEqualTo(
                EventEstimateResponse.Data.builder()
                    .addEstimate(
                        EventEstimateResponse.Data.Estimate.builder()
                            .balanceAfterEstimate(0.0)
                            .addBreakdown(
                                EventEstimateResponse.Data.Estimate.Breakdown.builder()
                                    .cost(0.0)
                                    .featureId("featureId")
                                    .warningCode(
                                        EventEstimateResponse.Data.Estimate.Breakdown.WarningCode
                                            .UNSUPPORTED_AGGREGATION
                                    )
                                    .build()
                            )
                            .currencyId("currencyId")
                            .currentBalance(0.0)
                            .estimatedCost(0.0)
                            .wouldOverdraft(true)
                            .build()
                    )
                    .addWarning(
                        EventEstimateResponse.Data.Warning.RESOURCE_SCOPED_SUBSCRIPTION_EXISTS
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventEstimateResponse =
            EventEstimateResponse.builder()
                .data(
                    EventEstimateResponse.Data.builder()
                        .addEstimate(
                            EventEstimateResponse.Data.Estimate.builder()
                                .balanceAfterEstimate(0.0)
                                .addBreakdown(
                                    EventEstimateResponse.Data.Estimate.Breakdown.builder()
                                        .cost(0.0)
                                        .featureId("featureId")
                                        .warningCode(
                                            EventEstimateResponse.Data.Estimate.Breakdown
                                                .WarningCode
                                                .UNSUPPORTED_AGGREGATION
                                        )
                                        .build()
                                )
                                .currencyId("currencyId")
                                .currentBalance(0.0)
                                .estimatedCost(0.0)
                                .wouldOverdraft(true)
                                .build()
                        )
                        .addWarning(
                            EventEstimateResponse.Data.Warning.RESOURCE_SCOPED_SUBSCRIPTION_EXISTS
                        )
                        .build()
                )
                .build()

        val roundtrippedEventEstimateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventEstimateResponse),
                jacksonTypeRef<EventEstimateResponse>(),
            )

        assertThat(roundtrippedEventEstimateResponse).isEqualTo(eventEstimateResponse)
    }
}
