// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditListLedgerResponseTest {

    @Test
    fun create() {
        val creditListLedgerResponse =
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

        assertThat(creditListLedgerResponse.amount()).isEqualTo(0.0)
        assertThat(creditListLedgerResponse.creditCurrencyId()).isEqualTo("creditCurrencyId")
        assertThat(creditListLedgerResponse.creditGrantId()).isEqualTo("creditGrantId")
        assertThat(creditListLedgerResponse.customerId()).isEqualTo("customerId")
        assertThat(creditListLedgerResponse.eventId()).contains("eventId")
        assertThat(creditListLedgerResponse.eventType())
            .isEqualTo(CreditListLedgerResponse.EventType.CREDITS_GRANTED)
        assertThat(creditListLedgerResponse.featureId()).contains("featureId")
        assertThat(creditListLedgerResponse.resourceId()).contains("resourceId")
        assertThat(creditListLedgerResponse.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditListLedgerResponse =
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

        val roundtrippedCreditListLedgerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditListLedgerResponse),
                jacksonTypeRef<CreditListLedgerResponse>(),
            )

        assertThat(roundtrippedCreditListLedgerResponse).isEqualTo(creditListLedgerResponse)
    }
}
