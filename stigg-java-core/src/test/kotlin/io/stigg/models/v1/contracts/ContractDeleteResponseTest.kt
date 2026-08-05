// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.contracts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractDeleteResponseTest {

    @Test
    fun create() {
        val contractDeleteResponse =
            ContractDeleteResponse.builder()
                .data(
                    ContractDeleteResponse.Data.builder()
                        .id("id")
                        .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingId("billingId")
                        .billingState(ContractDeleteResponse.Data.BillingState.DRAFT)
                        .contractId("contractId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerExternalId("customerExternalId")
                        .externalId("externalId")
                        .latestInvoice(
                            ContractDeleteResponse.Data.LatestInvoice.builder()
                                .billingId("billingId")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .requiresAction(true)
                                .status(ContractDeleteResponse.Data.LatestInvoice.Status.OPEN)
                                .amountDue(0.0)
                                .billingReason(
                                    ContractDeleteResponse.Data.LatestInvoice.BillingReason
                                        .BILLING_CYCLE
                                )
                                .currency("currency")
                                .pdfUrl("pdfUrl")
                                .total(0.0)
                                .build()
                        )
                        .name("name")
                        .nextInvoice(
                            ContractDeleteResponse.Data.NextInvoice.builder()
                                .amount(
                                    ContractDeleteResponse.Data.NextInvoice.Amount.builder()
                                        .amount(0.0)
                                        .currency(
                                            ContractDeleteResponse.Data.NextInvoice.Amount.Currency
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
                        .state(ContractDeleteResponse.Data.State.DRAFT)
                        .addSubscription(
                            ContractDeleteResponse.Data.Subscription.builder()
                                .planDisplayName("planDisplayName")
                                .productDisplayName("productDisplayName")
                                .subscriptionId("subscriptionId")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(contractDeleteResponse.data())
            .isEqualTo(
                ContractDeleteResponse.Data.builder()
                    .id("id")
                    .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .billingId("billingId")
                    .billingState(ContractDeleteResponse.Data.BillingState.DRAFT)
                    .contractId("contractId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerExternalId("customerExternalId")
                    .externalId("externalId")
                    .latestInvoice(
                        ContractDeleteResponse.Data.LatestInvoice.builder()
                            .billingId("billingId")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .requiresAction(true)
                            .status(ContractDeleteResponse.Data.LatestInvoice.Status.OPEN)
                            .amountDue(0.0)
                            .billingReason(
                                ContractDeleteResponse.Data.LatestInvoice.BillingReason
                                    .BILLING_CYCLE
                            )
                            .currency("currency")
                            .pdfUrl("pdfUrl")
                            .total(0.0)
                            .build()
                    )
                    .name("name")
                    .nextInvoice(
                        ContractDeleteResponse.Data.NextInvoice.builder()
                            .amount(
                                ContractDeleteResponse.Data.NextInvoice.Amount.builder()
                                    .amount(0.0)
                                    .currency(
                                        ContractDeleteResponse.Data.NextInvoice.Amount.Currency.USD
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
                    .state(ContractDeleteResponse.Data.State.DRAFT)
                    .addSubscription(
                        ContractDeleteResponse.Data.Subscription.builder()
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
        val contractDeleteResponse =
            ContractDeleteResponse.builder()
                .data(
                    ContractDeleteResponse.Data.builder()
                        .id("id")
                        .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingId("billingId")
                        .billingState(ContractDeleteResponse.Data.BillingState.DRAFT)
                        .contractId("contractId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerExternalId("customerExternalId")
                        .externalId("externalId")
                        .latestInvoice(
                            ContractDeleteResponse.Data.LatestInvoice.builder()
                                .billingId("billingId")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .requiresAction(true)
                                .status(ContractDeleteResponse.Data.LatestInvoice.Status.OPEN)
                                .amountDue(0.0)
                                .billingReason(
                                    ContractDeleteResponse.Data.LatestInvoice.BillingReason
                                        .BILLING_CYCLE
                                )
                                .currency("currency")
                                .pdfUrl("pdfUrl")
                                .total(0.0)
                                .build()
                        )
                        .name("name")
                        .nextInvoice(
                            ContractDeleteResponse.Data.NextInvoice.builder()
                                .amount(
                                    ContractDeleteResponse.Data.NextInvoice.Amount.builder()
                                        .amount(0.0)
                                        .currency(
                                            ContractDeleteResponse.Data.NextInvoice.Amount.Currency
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
                        .state(ContractDeleteResponse.Data.State.DRAFT)
                        .addSubscription(
                            ContractDeleteResponse.Data.Subscription.builder()
                                .planDisplayName("planDisplayName")
                                .productDisplayName("productDisplayName")
                                .subscriptionId("subscriptionId")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedContractDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contractDeleteResponse),
                jacksonTypeRef<ContractDeleteResponse>(),
            )

        assertThat(roundtrippedContractDeleteResponse).isEqualTo(contractDeleteResponse)
    }
}
