// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventEstimateCostResponseTest {

    @Test
    fun create() {
        val eventEstimateCostResponse =
            EventEstimateCostResponse.builder()
                .data(
                    EventEstimateCostResponse.Data.builder()
                        .addEstimate(
                            EventEstimateCostResponse.Data.Estimate.builder()
                                .balanceAfterEstimate(0.0)
                                .addBreakdown(
                                    EventEstimateCostResponse.Data.Estimate.Breakdown.builder()
                                        .cost(0.0)
                                        .featureId("featureId")
                                        .warningCode(
                                            EventEstimateCostResponse.Data.Estimate.Breakdown
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
                            EventEstimateCostResponse.Data.Warning
                                .RESOURCE_SCOPED_SUBSCRIPTION_EXISTS
                        )
                        .build()
                )
                .build()

        assertThat(eventEstimateCostResponse.data())
            .isEqualTo(
                EventEstimateCostResponse.Data.builder()
                    .addEstimate(
                        EventEstimateCostResponse.Data.Estimate.builder()
                            .balanceAfterEstimate(0.0)
                            .addBreakdown(
                                EventEstimateCostResponse.Data.Estimate.Breakdown.builder()
                                    .cost(0.0)
                                    .featureId("featureId")
                                    .warningCode(
                                        EventEstimateCostResponse.Data.Estimate.Breakdown
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
                        EventEstimateCostResponse.Data.Warning.RESOURCE_SCOPED_SUBSCRIPTION_EXISTS
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventEstimateCostResponse =
            EventEstimateCostResponse.builder()
                .data(
                    EventEstimateCostResponse.Data.builder()
                        .addEstimate(
                            EventEstimateCostResponse.Data.Estimate.builder()
                                .balanceAfterEstimate(0.0)
                                .addBreakdown(
                                    EventEstimateCostResponse.Data.Estimate.Breakdown.builder()
                                        .cost(0.0)
                                        .featureId("featureId")
                                        .warningCode(
                                            EventEstimateCostResponse.Data.Estimate.Breakdown
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
                            EventEstimateCostResponse.Data.Warning
                                .RESOURCE_SCOPED_SUBSCRIPTION_EXISTS
                        )
                        .build()
                )
                .build()

        val roundtrippedEventEstimateCostResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventEstimateCostResponse),
                jacksonTypeRef<EventEstimateCostResponse>(),
            )

        assertThat(roundtrippedEventEstimateCostResponse).isEqualTo(eventEstimateCostResponse)
    }
}
