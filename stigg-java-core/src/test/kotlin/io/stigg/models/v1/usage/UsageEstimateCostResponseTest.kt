// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageEstimateCostResponseTest {

    @Test
    fun create() {
        val usageEstimateCostResponse =
            UsageEstimateCostResponse.builder()
                .data(
                    UsageEstimateCostResponse.Data.builder()
                        .addEstimate(
                            UsageEstimateCostResponse.Data.Estimate.builder()
                                .balanceAfterEstimate(0.0)
                                .addBreakdown(
                                    UsageEstimateCostResponse.Data.Estimate.Breakdown.builder()
                                        .cost(0.0)
                                        .featureId("featureId")
                                        .warningCode(
                                            UsageEstimateCostResponse.Data.Estimate.Breakdown
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
                            UsageEstimateCostResponse.Data.Warning
                                .RESOURCE_SCOPED_SUBSCRIPTION_EXISTS
                        )
                        .build()
                )
                .build()

        assertThat(usageEstimateCostResponse.data())
            .isEqualTo(
                UsageEstimateCostResponse.Data.builder()
                    .addEstimate(
                        UsageEstimateCostResponse.Data.Estimate.builder()
                            .balanceAfterEstimate(0.0)
                            .addBreakdown(
                                UsageEstimateCostResponse.Data.Estimate.Breakdown.builder()
                                    .cost(0.0)
                                    .featureId("featureId")
                                    .warningCode(
                                        UsageEstimateCostResponse.Data.Estimate.Breakdown
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
                        UsageEstimateCostResponse.Data.Warning.RESOURCE_SCOPED_SUBSCRIPTION_EXISTS
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageEstimateCostResponse =
            UsageEstimateCostResponse.builder()
                .data(
                    UsageEstimateCostResponse.Data.builder()
                        .addEstimate(
                            UsageEstimateCostResponse.Data.Estimate.builder()
                                .balanceAfterEstimate(0.0)
                                .addBreakdown(
                                    UsageEstimateCostResponse.Data.Estimate.Breakdown.builder()
                                        .cost(0.0)
                                        .featureId("featureId")
                                        .warningCode(
                                            UsageEstimateCostResponse.Data.Estimate.Breakdown
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
                            UsageEstimateCostResponse.Data.Warning
                                .RESOURCE_SCOPED_SUBSCRIPTION_EXISTS
                        )
                        .build()
                )
                .build()

        val roundtrippedUsageEstimateCostResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageEstimateCostResponse),
                jacksonTypeRef<UsageEstimateCostResponse>(),
            )

        assertThat(roundtrippedUsageEstimateCostResponse).isEqualTo(usageEstimateCostResponse)
    }
}
