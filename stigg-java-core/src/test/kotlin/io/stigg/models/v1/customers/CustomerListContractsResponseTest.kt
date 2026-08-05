// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListContractsResponseTest {

    @Test
    fun create() {
        val customerListContractsResponse =
            CustomerListContractsResponse.builder()
                .addData(
                    CustomerListContractsResponse.Data.builder()
                        .id("id")
                        .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingId("billingId")
                        .billingState(CustomerListContractsResponse.Data.BillingState.DRAFT)
                        .contractId("contractId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerExternalId("customerExternalId")
                        .externalId("externalId")
                        .latestInvoice(
                            CustomerListContractsResponse.Data.LatestInvoice.builder()
                                .billingId("billingId")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .requiresAction(true)
                                .status(
                                    CustomerListContractsResponse.Data.LatestInvoice.Status.OPEN
                                )
                                .amountDue(0.0)
                                .billingReason(
                                    CustomerListContractsResponse.Data.LatestInvoice.BillingReason
                                        .BILLING_CYCLE
                                )
                                .currency("currency")
                                .pdfUrl("pdfUrl")
                                .total(0.0)
                                .build()
                        )
                        .name("name")
                        .nextInvoice(
                            CustomerListContractsResponse.Data.NextInvoice.builder()
                                .amount(
                                    CustomerListContractsResponse.Data.NextInvoice.Amount.builder()
                                        .amount(0.0)
                                        .currency(
                                            CustomerListContractsResponse.Data.NextInvoice.Amount
                                                .Currency
                                                .USD
                                        )
                                        .build()
                                )
                                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .poNumber("poNumber")
                        .refId("refId")
                        .state(CustomerListContractsResponse.Data.State.DRAFT)
                        .addSubscription(
                            CustomerListContractsResponse.Data.Subscription.builder()
                                .planDisplayName("planDisplayName")
                                .productDisplayName("productDisplayName")
                                .subscriptionId("subscriptionId")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(customerListContractsResponse.data())
            .containsExactly(
                CustomerListContractsResponse.Data.builder()
                    .id("id")
                    .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .billingId("billingId")
                    .billingState(CustomerListContractsResponse.Data.BillingState.DRAFT)
                    .contractId("contractId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerExternalId("customerExternalId")
                    .externalId("externalId")
                    .latestInvoice(
                        CustomerListContractsResponse.Data.LatestInvoice.builder()
                            .billingId("billingId")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .requiresAction(true)
                            .status(CustomerListContractsResponse.Data.LatestInvoice.Status.OPEN)
                            .amountDue(0.0)
                            .billingReason(
                                CustomerListContractsResponse.Data.LatestInvoice.BillingReason
                                    .BILLING_CYCLE
                            )
                            .currency("currency")
                            .pdfUrl("pdfUrl")
                            .total(0.0)
                            .build()
                    )
                    .name("name")
                    .nextInvoice(
                        CustomerListContractsResponse.Data.NextInvoice.builder()
                            .amount(
                                CustomerListContractsResponse.Data.NextInvoice.Amount.builder()
                                    .amount(0.0)
                                    .currency(
                                        CustomerListContractsResponse.Data.NextInvoice.Amount
                                            .Currency
                                            .USD
                                    )
                                    .build()
                            )
                            .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .poNumber("poNumber")
                    .refId("refId")
                    .state(CustomerListContractsResponse.Data.State.DRAFT)
                    .addSubscription(
                        CustomerListContractsResponse.Data.Subscription.builder()
                            .planDisplayName("planDisplayName")
                            .productDisplayName("productDisplayName")
                            .subscriptionId("subscriptionId")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListContractsResponse =
            CustomerListContractsResponse.builder()
                .addData(
                    CustomerListContractsResponse.Data.builder()
                        .id("id")
                        .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingId("billingId")
                        .billingState(CustomerListContractsResponse.Data.BillingState.DRAFT)
                        .contractId("contractId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerExternalId("customerExternalId")
                        .externalId("externalId")
                        .latestInvoice(
                            CustomerListContractsResponse.Data.LatestInvoice.builder()
                                .billingId("billingId")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .requiresAction(true)
                                .status(
                                    CustomerListContractsResponse.Data.LatestInvoice.Status.OPEN
                                )
                                .amountDue(0.0)
                                .billingReason(
                                    CustomerListContractsResponse.Data.LatestInvoice.BillingReason
                                        .BILLING_CYCLE
                                )
                                .currency("currency")
                                .pdfUrl("pdfUrl")
                                .total(0.0)
                                .build()
                        )
                        .name("name")
                        .nextInvoice(
                            CustomerListContractsResponse.Data.NextInvoice.builder()
                                .amount(
                                    CustomerListContractsResponse.Data.NextInvoice.Amount.builder()
                                        .amount(0.0)
                                        .currency(
                                            CustomerListContractsResponse.Data.NextInvoice.Amount
                                                .Currency
                                                .USD
                                        )
                                        .build()
                                )
                                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .poNumber("poNumber")
                        .refId("refId")
                        .state(CustomerListContractsResponse.Data.State.DRAFT)
                        .addSubscription(
                            CustomerListContractsResponse.Data.Subscription.builder()
                                .planDisplayName("planDisplayName")
                                .productDisplayName("productDisplayName")
                                .subscriptionId("subscriptionId")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedCustomerListContractsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListContractsResponse),
                jacksonTypeRef<CustomerListContractsResponse>(),
            )

        assertThat(roundtrippedCustomerListContractsResponse)
            .isEqualTo(customerListContractsResponse)
    }
}
