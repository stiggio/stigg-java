// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditGetAutoRechargeResponseTest {

    @Test
    fun create() {
        val creditGetAutoRechargeResponse =
            CreditGetAutoRechargeResponse.builder()
                .data(
                    CreditGetAutoRechargeResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currencyId("currencyId")
                        .customerId("customerId")
                        .grantExpirationPeriod(
                            CreditGetAutoRechargeResponse.Data.GrantExpirationPeriod._1_MONTH
                        )
                        .isEnabled(true)
                        .maxSpendLimit(0.0)
                        .targetBalance(0.0)
                        .thresholdType(
                            CreditGetAutoRechargeResponse.Data.ThresholdType.CREDIT_AMOUNT
                        )
                        .thresholdValue(0.0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(creditGetAutoRechargeResponse.data())
            .isEqualTo(
                CreditGetAutoRechargeResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currencyId("currencyId")
                    .customerId("customerId")
                    .grantExpirationPeriod(
                        CreditGetAutoRechargeResponse.Data.GrantExpirationPeriod._1_MONTH
                    )
                    .isEnabled(true)
                    .maxSpendLimit(0.0)
                    .targetBalance(0.0)
                    .thresholdType(CreditGetAutoRechargeResponse.Data.ThresholdType.CREDIT_AMOUNT)
                    .thresholdValue(0.0)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditGetAutoRechargeResponse =
            CreditGetAutoRechargeResponse.builder()
                .data(
                    CreditGetAutoRechargeResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currencyId("currencyId")
                        .customerId("customerId")
                        .grantExpirationPeriod(
                            CreditGetAutoRechargeResponse.Data.GrantExpirationPeriod._1_MONTH
                        )
                        .isEnabled(true)
                        .maxSpendLimit(0.0)
                        .targetBalance(0.0)
                        .thresholdType(
                            CreditGetAutoRechargeResponse.Data.ThresholdType.CREDIT_AMOUNT
                        )
                        .thresholdValue(0.0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCreditGetAutoRechargeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditGetAutoRechargeResponse),
                jacksonTypeRef<CreditGetAutoRechargeResponse>(),
            )

        assertThat(roundtrippedCreditGetAutoRechargeResponse)
            .isEqualTo(creditGetAutoRechargeResponse)
    }
}
