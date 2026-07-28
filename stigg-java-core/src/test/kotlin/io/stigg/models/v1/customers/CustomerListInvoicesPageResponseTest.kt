// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListInvoicesPageResponseTest {

    @Test
    fun create() {
        val customerListInvoicesPageResponse =
            CustomerListInvoicesPageResponse.builder()
                .addData(
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
                )
                .pagination(
                    CustomerListInvoicesPageResponse.Pagination.builder()
                        .next("next")
                        .prev("prev")
                        .build()
                )
                .build()

        assertThat(customerListInvoicesPageResponse.data())
            .containsExactly(
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
            )
        assertThat(customerListInvoicesPageResponse.pagination())
            .isEqualTo(
                CustomerListInvoicesPageResponse.Pagination.builder()
                    .next("next")
                    .prev("prev")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListInvoicesPageResponse =
            CustomerListInvoicesPageResponse.builder()
                .addData(
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
                )
                .pagination(
                    CustomerListInvoicesPageResponse.Pagination.builder()
                        .next("next")
                        .prev("prev")
                        .build()
                )
                .build()

        val roundtrippedCustomerListInvoicesPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListInvoicesPageResponse),
                jacksonTypeRef<CustomerListInvoicesPageResponse>(),
            )

        assertThat(roundtrippedCustomerListInvoicesPageResponse)
            .isEqualTo(customerListInvoicesPageResponse)
    }
}
