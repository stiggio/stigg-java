// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.contracts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractListPageResponseTest {

    @Test
    fun create() {
        val contractListPageResponse =
            ContractListPageResponse.builder()
                .addData(
                    ContractListResponse.builder()
                        .id("id")
                        .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingId("billingId")
                        .billingState(ContractListResponse.BillingState.DRAFT)
                        .contractId("contractId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerExternalId("customerExternalId")
                        .externalId("externalId")
                        .latestInvoice(
                            ContractListResponse.LatestInvoice.builder()
                                .billingId("billingId")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .requiresAction(true)
                                .status(ContractListResponse.LatestInvoice.Status.OPEN)
                                .amountDue(0.0)
                                .billingReason(
                                    ContractListResponse.LatestInvoice.BillingReason.BILLING_CYCLE
                                )
                                .currency("currency")
                                .pdfUrl("pdfUrl")
                                .total(0.0)
                                .build()
                        )
                        .name("name")
                        .nextInvoice(
                            ContractListResponse.NextInvoice.builder()
                                .amount(
                                    ContractListResponse.NextInvoice.Amount.builder()
                                        .amount(0.0)
                                        .currency(
                                            ContractListResponse.NextInvoice.Amount.Currency.USD
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
                        .state(ContractListResponse.State.DRAFT)
                        .addSubscription(
                            ContractListResponse.Subscription.builder()
                                .planDisplayName("planDisplayName")
                                .productDisplayName("productDisplayName")
                                .subscriptionId("subscriptionId")
                                .build()
                        )
                        .build()
                )
                .pagination(
                    ContractListPageResponse.Pagination.builder().next("next").prev("prev").build()
                )
                .build()

        assertThat(contractListPageResponse.data())
            .containsExactly(
                ContractListResponse.builder()
                    .id("id")
                    .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .billingId("billingId")
                    .billingState(ContractListResponse.BillingState.DRAFT)
                    .contractId("contractId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerExternalId("customerExternalId")
                    .externalId("externalId")
                    .latestInvoice(
                        ContractListResponse.LatestInvoice.builder()
                            .billingId("billingId")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .requiresAction(true)
                            .status(ContractListResponse.LatestInvoice.Status.OPEN)
                            .amountDue(0.0)
                            .billingReason(
                                ContractListResponse.LatestInvoice.BillingReason.BILLING_CYCLE
                            )
                            .currency("currency")
                            .pdfUrl("pdfUrl")
                            .total(0.0)
                            .build()
                    )
                    .name("name")
                    .nextInvoice(
                        ContractListResponse.NextInvoice.builder()
                            .amount(
                                ContractListResponse.NextInvoice.Amount.builder()
                                    .amount(0.0)
                                    .currency(ContractListResponse.NextInvoice.Amount.Currency.USD)
                                    .build()
                            )
                            .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .poNumber("poNumber")
                    .refId("refId")
                    .state(ContractListResponse.State.DRAFT)
                    .addSubscription(
                        ContractListResponse.Subscription.builder()
                            .planDisplayName("planDisplayName")
                            .productDisplayName("productDisplayName")
                            .subscriptionId("subscriptionId")
                            .build()
                    )
                    .build()
            )
        assertThat(contractListPageResponse.pagination())
            .isEqualTo(
                ContractListPageResponse.Pagination.builder().next("next").prev("prev").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contractListPageResponse =
            ContractListPageResponse.builder()
                .addData(
                    ContractListResponse.builder()
                        .id("id")
                        .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingId("billingId")
                        .billingState(ContractListResponse.BillingState.DRAFT)
                        .contractId("contractId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerExternalId("customerExternalId")
                        .externalId("externalId")
                        .latestInvoice(
                            ContractListResponse.LatestInvoice.builder()
                                .billingId("billingId")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .requiresAction(true)
                                .status(ContractListResponse.LatestInvoice.Status.OPEN)
                                .amountDue(0.0)
                                .billingReason(
                                    ContractListResponse.LatestInvoice.BillingReason.BILLING_CYCLE
                                )
                                .currency("currency")
                                .pdfUrl("pdfUrl")
                                .total(0.0)
                                .build()
                        )
                        .name("name")
                        .nextInvoice(
                            ContractListResponse.NextInvoice.builder()
                                .amount(
                                    ContractListResponse.NextInvoice.Amount.builder()
                                        .amount(0.0)
                                        .currency(
                                            ContractListResponse.NextInvoice.Amount.Currency.USD
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
                        .state(ContractListResponse.State.DRAFT)
                        .addSubscription(
                            ContractListResponse.Subscription.builder()
                                .planDisplayName("planDisplayName")
                                .productDisplayName("productDisplayName")
                                .subscriptionId("subscriptionId")
                                .build()
                        )
                        .build()
                )
                .pagination(
                    ContractListPageResponse.Pagination.builder().next("next").prev("prev").build()
                )
                .build()

        val roundtrippedContractListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contractListPageResponse),
                jacksonTypeRef<ContractListPageResponse>(),
            )

        assertThat(roundtrippedContractListPageResponse).isEqualTo(contractListPageResponse)
    }
}
