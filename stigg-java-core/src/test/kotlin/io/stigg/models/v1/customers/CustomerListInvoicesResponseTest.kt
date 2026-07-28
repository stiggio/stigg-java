// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListInvoicesResponseTest {

    @Test
    fun create() {
        val customerListInvoicesResponse =
            CustomerListInvoicesResponse.builder()
                .contractExternalId("contractExternalId")
                .currency("currency")
                .customerExternalId("customerExternalId")
                .discount(0.0)
                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoiceExternalId("invoiceExternalId")
                .invoiceId("invoiceId")
                .invoiceNumber("invoiceNumber")
                .issueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addLineItem(
                    CustomerListInvoicesResponse.LineItem.builder()
                        .amount(0.0)
                        .description("description")
                        .productExternalId("productExternalId")
                        .quantity(0.0)
                        .unitPrice(0.0)
                        .build()
                )
                .paidDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .state(CustomerListInvoicesResponse.State.OPEN)
                .subtotal(0.0)
                .tax(0.0)
                .total(0.0)
                .build()

        assertThat(customerListInvoicesResponse.contractExternalId()).contains("contractExternalId")
        assertThat(customerListInvoicesResponse.currency()).contains("currency")
        assertThat(customerListInvoicesResponse.customerExternalId()).contains("customerExternalId")
        assertThat(customerListInvoicesResponse.discount()).contains(0.0)
        assertThat(customerListInvoicesResponse.dueDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListInvoicesResponse.invoiceExternalId()).contains("invoiceExternalId")
        assertThat(customerListInvoicesResponse.invoiceId()).isEqualTo("invoiceId")
        assertThat(customerListInvoicesResponse.invoiceNumber()).contains("invoiceNumber")
        assertThat(customerListInvoicesResponse.issueDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListInvoicesResponse.lineItems())
            .containsExactly(
                CustomerListInvoicesResponse.LineItem.builder()
                    .amount(0.0)
                    .description("description")
                    .productExternalId("productExternalId")
                    .quantity(0.0)
                    .unitPrice(0.0)
                    .build()
            )
        assertThat(customerListInvoicesResponse.paidDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListInvoicesResponse.state())
            .isEqualTo(CustomerListInvoicesResponse.State.OPEN)
        assertThat(customerListInvoicesResponse.subtotal()).contains(0.0)
        assertThat(customerListInvoicesResponse.tax()).contains(0.0)
        assertThat(customerListInvoicesResponse.total()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListInvoicesResponse =
            CustomerListInvoicesResponse.builder()
                .contractExternalId("contractExternalId")
                .currency("currency")
                .customerExternalId("customerExternalId")
                .discount(0.0)
                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoiceExternalId("invoiceExternalId")
                .invoiceId("invoiceId")
                .invoiceNumber("invoiceNumber")
                .issueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addLineItem(
                    CustomerListInvoicesResponse.LineItem.builder()
                        .amount(0.0)
                        .description("description")
                        .productExternalId("productExternalId")
                        .quantity(0.0)
                        .unitPrice(0.0)
                        .build()
                )
                .paidDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .state(CustomerListInvoicesResponse.State.OPEN)
                .subtotal(0.0)
                .tax(0.0)
                .total(0.0)
                .build()

        val roundtrippedCustomerListInvoicesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListInvoicesResponse),
                jacksonTypeRef<CustomerListInvoicesResponse>(),
            )

        assertThat(roundtrippedCustomerListInvoicesResponse).isEqualTo(customerListInvoicesResponse)
    }
}
