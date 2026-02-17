// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions.invoice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceMarkAsPaidResponseTest {

    @Test
    fun create() {
        val invoiceMarkAsPaidResponse =
            InvoiceMarkAsPaidResponse.builder()
                .data(InvoiceMarkAsPaidResponse.Data.builder().id("id").build())
                .build()

        assertThat(invoiceMarkAsPaidResponse.data())
            .isEqualTo(InvoiceMarkAsPaidResponse.Data.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceMarkAsPaidResponse =
            InvoiceMarkAsPaidResponse.builder()
                .data(InvoiceMarkAsPaidResponse.Data.builder().id("id").build())
                .build()

        val roundtrippedInvoiceMarkAsPaidResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceMarkAsPaidResponse),
                jacksonTypeRef<InvoiceMarkAsPaidResponse>(),
            )

        assertThat(roundtrippedInvoiceMarkAsPaidResponse).isEqualTo(invoiceMarkAsPaidResponse)
    }
}
