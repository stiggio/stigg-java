// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageChargeUsageResponseTest {

    @Test
    fun create() {
        val usageChargeUsageResponse =
            UsageChargeUsageResponse.builder()
                .data(
                    UsageChargeUsageResponse.Data.builder()
                        .invoiceBillingId("invoiceBillingId")
                        .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .subscriptionId("subscriptionId")
                        .addUsageCharged(
                            UsageChargeUsageResponse.Data.UsageCharged.builder()
                                .featureId("featureId")
                                .usageAmount(0.0)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(usageChargeUsageResponse.data())
            .isEqualTo(
                UsageChargeUsageResponse.Data.builder()
                    .invoiceBillingId("invoiceBillingId")
                    .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .subscriptionId("subscriptionId")
                    .addUsageCharged(
                        UsageChargeUsageResponse.Data.UsageCharged.builder()
                            .featureId("featureId")
                            .usageAmount(0.0)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageChargeUsageResponse =
            UsageChargeUsageResponse.builder()
                .data(
                    UsageChargeUsageResponse.Data.builder()
                        .invoiceBillingId("invoiceBillingId")
                        .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .subscriptionId("subscriptionId")
                        .addUsageCharged(
                            UsageChargeUsageResponse.Data.UsageCharged.builder()
                                .featureId("featureId")
                                .usageAmount(0.0)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedUsageChargeUsageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageChargeUsageResponse),
                jacksonTypeRef<UsageChargeUsageResponse>(),
            )

        assertThat(roundtrippedUsageChargeUsageResponse).isEqualTo(usageChargeUsageResponse)
    }
}
