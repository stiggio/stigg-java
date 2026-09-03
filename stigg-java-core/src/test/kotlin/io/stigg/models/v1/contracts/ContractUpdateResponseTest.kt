// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.contracts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractUpdateResponseTest {

    @Test
    fun create() {
        val contractUpdateResponse =
            ContractUpdateResponse.builder()
                .data(
                    ContractUpdateResponse.Data.builder()
                        .id("id")
                        .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingId("billingId")
                        .billingState(ContractUpdateResponse.Data.BillingState.DRAFT)
                        .contractId("contractId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerExternalId("customerExternalId")
                        .externalId("externalId")
                        .latestInvoice(
                            ContractUpdateResponse.Data.LatestInvoice.builder()
                                .billingId("billingId")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .requiresAction(true)
                                .status(ContractUpdateResponse.Data.LatestInvoice.Status.OPEN)
                                .amountDue(0.0)
                                .billingReason(
                                    ContractUpdateResponse.Data.LatestInvoice.BillingReason
                                        .BILLING_CYCLE
                                )
                                .currency("currency")
                                .pdfUrl("pdfUrl")
                                .total(0.0)
                                .build()
                        )
                        .name("name")
                        .nextInvoice(
                            ContractUpdateResponse.Data.NextInvoice.builder()
                                .amount(
                                    ContractUpdateResponse.Data.NextInvoice.Amount.builder()
                                        .amount(0.0)
                                        .currency(
                                            ContractUpdateResponse.Data.NextInvoice.Amount.Currency
                                                .USD
                                        )
                                        .build()
                                )
                                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .invoiceId("invoiceId")
                                .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .poNumber("poNumber")
                        .refId("refId")
                        .state(ContractUpdateResponse.Data.State.DRAFT)
                        .addSubscription(
                            ContractUpdateResponse.Data.Subscription.builder()
                                .planDisplayName("planDisplayName")
                                .productDisplayName("productDisplayName")
                                .subscriptionId("subscriptionId")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(contractUpdateResponse.data())
            .isEqualTo(
                ContractUpdateResponse.Data.builder()
                    .id("id")
                    .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .billingId("billingId")
                    .billingState(ContractUpdateResponse.Data.BillingState.DRAFT)
                    .contractId("contractId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerExternalId("customerExternalId")
                    .externalId("externalId")
                    .latestInvoice(
                        ContractUpdateResponse.Data.LatestInvoice.builder()
                            .billingId("billingId")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .requiresAction(true)
                            .status(ContractUpdateResponse.Data.LatestInvoice.Status.OPEN)
                            .amountDue(0.0)
                            .billingReason(
                                ContractUpdateResponse.Data.LatestInvoice.BillingReason
                                    .BILLING_CYCLE
                            )
                            .currency("currency")
                            .pdfUrl("pdfUrl")
                            .total(0.0)
                            .build()
                    )
                    .name("name")
                    .nextInvoice(
                        ContractUpdateResponse.Data.NextInvoice.builder()
                            .amount(
                                ContractUpdateResponse.Data.NextInvoice.Amount.builder()
                                    .amount(0.0)
                                    .currency(
                                        ContractUpdateResponse.Data.NextInvoice.Amount.Currency.USD
                                    )
                                    .build()
                            )
                            .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .invoiceId("invoiceId")
                            .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .poNumber("poNumber")
                    .refId("refId")
                    .state(ContractUpdateResponse.Data.State.DRAFT)
                    .addSubscription(
                        ContractUpdateResponse.Data.Subscription.builder()
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
        val contractUpdateResponse =
            ContractUpdateResponse.builder()
                .data(
                    ContractUpdateResponse.Data.builder()
                        .id("id")
                        .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingId("billingId")
                        .billingState(ContractUpdateResponse.Data.BillingState.DRAFT)
                        .contractId("contractId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerExternalId("customerExternalId")
                        .externalId("externalId")
                        .latestInvoice(
                            ContractUpdateResponse.Data.LatestInvoice.builder()
                                .billingId("billingId")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .requiresAction(true)
                                .status(ContractUpdateResponse.Data.LatestInvoice.Status.OPEN)
                                .amountDue(0.0)
                                .billingReason(
                                    ContractUpdateResponse.Data.LatestInvoice.BillingReason
                                        .BILLING_CYCLE
                                )
                                .currency("currency")
                                .pdfUrl("pdfUrl")
                                .total(0.0)
                                .build()
                        )
                        .name("name")
                        .nextInvoice(
                            ContractUpdateResponse.Data.NextInvoice.builder()
                                .amount(
                                    ContractUpdateResponse.Data.NextInvoice.Amount.builder()
                                        .amount(0.0)
                                        .currency(
                                            ContractUpdateResponse.Data.NextInvoice.Amount.Currency
                                                .USD
                                        )
                                        .build()
                                )
                                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .invoiceId("invoiceId")
                                .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .poNumber("poNumber")
                        .refId("refId")
                        .state(ContractUpdateResponse.Data.State.DRAFT)
                        .addSubscription(
                            ContractUpdateResponse.Data.Subscription.builder()
                                .planDisplayName("planDisplayName")
                                .productDisplayName("productDisplayName")
                                .subscriptionId("subscriptionId")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedContractUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contractUpdateResponse),
                jacksonTypeRef<ContractUpdateResponse>(),
            )

        assertThat(roundtrippedContractUpdateResponse).isEqualTo(contractUpdateResponse)
    }
}
