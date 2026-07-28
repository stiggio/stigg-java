// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.contracts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractRetrieveResponseTest {

    @Test
    fun create() {
        val contractRetrieveResponse =
            ContractRetrieveResponse.builder()
                .data(
                    ContractRetrieveResponse.Data.builder()
                        .id("id")
                        .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingId("billingId")
                        .contractId("contractId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerExternalId("customerExternalId")
                        .externalId("externalId")
                        .latestInvoice(
                            ContractRetrieveResponse.Data.LatestInvoice.builder()
                                .billingId("billingId")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .requiresAction(true)
                                .status(ContractRetrieveResponse.Data.LatestInvoice.Status.OPEN)
                                .amountDue(0.0)
                                .billingReason(
                                    ContractRetrieveResponse.Data.LatestInvoice.BillingReason
                                        .BILLING_CYCLE
                                )
                                .currency("currency")
                                .pdfUrl("pdfUrl")
                                .total(0.0)
                                .build()
                        )
                        .name("name")
                        .nextInvoice(
                            ContractRetrieveResponse.Data.NextInvoice.builder()
                                .amount(
                                    ContractRetrieveResponse.Data.NextInvoice.Amount.builder()
                                        .amount(0.0)
                                        .currency(
                                            ContractRetrieveResponse.Data.NextInvoice.Amount
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
                        .state(ContractRetrieveResponse.Data.State.DRAFT)
                        .addSubscription(
                            ContractRetrieveResponse.Data.Subscription.builder()
                                .planDisplayName("planDisplayName")
                                .productDisplayName("productDisplayName")
                                .subscriptionId("subscriptionId")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(contractRetrieveResponse.data())
            .isEqualTo(
                ContractRetrieveResponse.Data.builder()
                    .id("id")
                    .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .billingId("billingId")
                    .contractId("contractId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerExternalId("customerExternalId")
                    .externalId("externalId")
                    .latestInvoice(
                        ContractRetrieveResponse.Data.LatestInvoice.builder()
                            .billingId("billingId")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .requiresAction(true)
                            .status(ContractRetrieveResponse.Data.LatestInvoice.Status.OPEN)
                            .amountDue(0.0)
                            .billingReason(
                                ContractRetrieveResponse.Data.LatestInvoice.BillingReason
                                    .BILLING_CYCLE
                            )
                            .currency("currency")
                            .pdfUrl("pdfUrl")
                            .total(0.0)
                            .build()
                    )
                    .name("name")
                    .nextInvoice(
                        ContractRetrieveResponse.Data.NextInvoice.builder()
                            .amount(
                                ContractRetrieveResponse.Data.NextInvoice.Amount.builder()
                                    .amount(0.0)
                                    .currency(
                                        ContractRetrieveResponse.Data.NextInvoice.Amount.Currency
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
                    .state(ContractRetrieveResponse.Data.State.DRAFT)
                    .addSubscription(
                        ContractRetrieveResponse.Data.Subscription.builder()
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
        val contractRetrieveResponse =
            ContractRetrieveResponse.builder()
                .data(
                    ContractRetrieveResponse.Data.builder()
                        .id("id")
                        .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingId("billingId")
                        .contractId("contractId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerExternalId("customerExternalId")
                        .externalId("externalId")
                        .latestInvoice(
                            ContractRetrieveResponse.Data.LatestInvoice.builder()
                                .billingId("billingId")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .requiresAction(true)
                                .status(ContractRetrieveResponse.Data.LatestInvoice.Status.OPEN)
                                .amountDue(0.0)
                                .billingReason(
                                    ContractRetrieveResponse.Data.LatestInvoice.BillingReason
                                        .BILLING_CYCLE
                                )
                                .currency("currency")
                                .pdfUrl("pdfUrl")
                                .total(0.0)
                                .build()
                        )
                        .name("name")
                        .nextInvoice(
                            ContractRetrieveResponse.Data.NextInvoice.builder()
                                .amount(
                                    ContractRetrieveResponse.Data.NextInvoice.Amount.builder()
                                        .amount(0.0)
                                        .currency(
                                            ContractRetrieveResponse.Data.NextInvoice.Amount
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
                        .state(ContractRetrieveResponse.Data.State.DRAFT)
                        .addSubscription(
                            ContractRetrieveResponse.Data.Subscription.builder()
                                .planDisplayName("planDisplayName")
                                .productDisplayName("productDisplayName")
                                .subscriptionId("subscriptionId")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedContractRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contractRetrieveResponse),
                jacksonTypeRef<ContractRetrieveResponse>(),
            )

        assertThat(roundtrippedContractRetrieveResponse).isEqualTo(contractRetrieveResponse)
    }
}
