// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.autorecharge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoRechargeGetAutoRechargeResponseTest {

    @Test
    fun create() {
        val autoRechargeGetAutoRechargeResponse =
            AutoRechargeGetAutoRechargeResponse.builder()
                .data(
                    AutoRechargeGetAutoRechargeResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currencyId("currencyId")
                        .customerId("customerId")
                        .grantExpirationPeriod(
                            AutoRechargeGetAutoRechargeResponse.Data.GrantExpirationPeriod._1_MONTH
                        )
                        .isEnabled(true)
                        .maxSpendLimit(0.0)
                        .targetBalance(0.0)
                        .thresholdType(
                            AutoRechargeGetAutoRechargeResponse.Data.ThresholdType.CREDIT_AMOUNT
                        )
                        .thresholdValue(0.0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(autoRechargeGetAutoRechargeResponse.data())
            .isEqualTo(
                AutoRechargeGetAutoRechargeResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currencyId("currencyId")
                    .customerId("customerId")
                    .grantExpirationPeriod(
                        AutoRechargeGetAutoRechargeResponse.Data.GrantExpirationPeriod._1_MONTH
                    )
                    .isEnabled(true)
                    .maxSpendLimit(0.0)
                    .targetBalance(0.0)
                    .thresholdType(
                        AutoRechargeGetAutoRechargeResponse.Data.ThresholdType.CREDIT_AMOUNT
                    )
                    .thresholdValue(0.0)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autoRechargeGetAutoRechargeResponse =
            AutoRechargeGetAutoRechargeResponse.builder()
                .data(
                    AutoRechargeGetAutoRechargeResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currencyId("currencyId")
                        .customerId("customerId")
                        .grantExpirationPeriod(
                            AutoRechargeGetAutoRechargeResponse.Data.GrantExpirationPeriod._1_MONTH
                        )
                        .isEnabled(true)
                        .maxSpendLimit(0.0)
                        .targetBalance(0.0)
                        .thresholdType(
                            AutoRechargeGetAutoRechargeResponse.Data.ThresholdType.CREDIT_AMOUNT
                        )
                        .thresholdValue(0.0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedAutoRechargeGetAutoRechargeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autoRechargeGetAutoRechargeResponse),
                jacksonTypeRef<AutoRechargeGetAutoRechargeResponse>(),
            )

        assertThat(roundtrippedAutoRechargeGetAutoRechargeResponse)
            .isEqualTo(autoRechargeGetAutoRechargeResponse)
    }
}
