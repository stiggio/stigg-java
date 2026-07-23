// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageEstimateResponseTest {

    @Test
    fun create() {
        val usageEstimateResponse =
            UsageEstimateResponse.builder()
                .data(
                    UsageEstimateResponse.Data.builder()
                        .addEstimate(
                            UsageEstimateResponse.Data.Estimate.builder()
                                .balanceAfterEstimate(0.0)
                                .addBreakdown(
                                    UsageEstimateResponse.Data.Estimate.Breakdown.builder()
                                        .cost(0.0)
                                        .featureId("featureId")
                                        .warningCode(
                                            UsageEstimateResponse.Data.Estimate.Breakdown
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
                            UsageEstimateResponse.Data.Warning.RESOURCE_SCOPED_SUBSCRIPTION_EXISTS
                        )
                        .build()
                )
                .build()

        assertThat(usageEstimateResponse.data())
            .isEqualTo(
                UsageEstimateResponse.Data.builder()
                    .addEstimate(
                        UsageEstimateResponse.Data.Estimate.builder()
                            .balanceAfterEstimate(0.0)
                            .addBreakdown(
                                UsageEstimateResponse.Data.Estimate.Breakdown.builder()
                                    .cost(0.0)
                                    .featureId("featureId")
                                    .warningCode(
                                        UsageEstimateResponse.Data.Estimate.Breakdown.WarningCode
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
                        UsageEstimateResponse.Data.Warning.RESOURCE_SCOPED_SUBSCRIPTION_EXISTS
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageEstimateResponse =
            UsageEstimateResponse.builder()
                .data(
                    UsageEstimateResponse.Data.builder()
                        .addEstimate(
                            UsageEstimateResponse.Data.Estimate.builder()
                                .balanceAfterEstimate(0.0)
                                .addBreakdown(
                                    UsageEstimateResponse.Data.Estimate.Breakdown.builder()
                                        .cost(0.0)
                                        .featureId("featureId")
                                        .warningCode(
                                            UsageEstimateResponse.Data.Estimate.Breakdown
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
                            UsageEstimateResponse.Data.Warning.RESOURCE_SCOPED_SUBSCRIPTION_EXISTS
                        )
                        .build()
                )
                .build()

        val roundtrippedUsageEstimateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageEstimateResponse),
                jacksonTypeRef<UsageEstimateResponse>(),
            )

        assertThat(roundtrippedUsageEstimateResponse).isEqualTo(usageEstimateResponse)
    }
}
