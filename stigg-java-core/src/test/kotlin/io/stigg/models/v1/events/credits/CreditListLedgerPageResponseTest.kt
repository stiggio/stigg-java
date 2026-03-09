// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditListLedgerPageResponseTest {

    @Test
    fun create() {
        val creditListLedgerPageResponse =
            CreditListLedgerPageResponse.builder()
                .addData(
                    CreditListLedgerResponse.builder()
                        .amount(0.0)
                        .creditCurrencyId("creditCurrencyId")
                        .creditGrantId("creditGrantId")
                        .customerId("customerId")
                        .eventId("eventId")
                        .eventType(CreditListLedgerResponse.EventType.CREDITS_GRANTED)
                        .featureId("featureId")
                        .resourceId("resourceId")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pagination(
                    CreditListLedgerPageResponse.Pagination.builder()
                        .next("next")
                        .prev("prev")
                        .build()
                )
                .build()

        assertThat(creditListLedgerPageResponse.data())
            .containsExactly(
                CreditListLedgerResponse.builder()
                    .amount(0.0)
                    .creditCurrencyId("creditCurrencyId")
                    .creditGrantId("creditGrantId")
                    .customerId("customerId")
                    .eventId("eventId")
                    .eventType(CreditListLedgerResponse.EventType.CREDITS_GRANTED)
                    .featureId("featureId")
                    .resourceId("resourceId")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(creditListLedgerPageResponse.pagination())
            .isEqualTo(
                CreditListLedgerPageResponse.Pagination.builder().next("next").prev("prev").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditListLedgerPageResponse =
            CreditListLedgerPageResponse.builder()
                .addData(
                    CreditListLedgerResponse.builder()
                        .amount(0.0)
                        .creditCurrencyId("creditCurrencyId")
                        .creditGrantId("creditGrantId")
                        .customerId("customerId")
                        .eventId("eventId")
                        .eventType(CreditListLedgerResponse.EventType.CREDITS_GRANTED)
                        .featureId("featureId")
                        .resourceId("resourceId")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pagination(
                    CreditListLedgerPageResponse.Pagination.builder()
                        .next("next")
                        .prev("prev")
                        .build()
                )
                .build()

        val roundtrippedCreditListLedgerPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditListLedgerPageResponse),
                jacksonTypeRef<CreditListLedgerPageResponse>(),
            )

        assertThat(roundtrippedCreditListLedgerPageResponse).isEqualTo(creditListLedgerPageResponse)
    }
}
