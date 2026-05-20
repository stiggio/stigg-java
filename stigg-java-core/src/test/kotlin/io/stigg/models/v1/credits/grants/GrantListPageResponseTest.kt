// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.grants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GrantListPageResponseTest {

    @Test
    fun create() {
        val grantListPageResponse =
            GrantListPageResponse.builder()
                .addData(
                    GrantListResponse.builder()
                        .id("id")
                        .amount(0.0)
                        .comment("comment")
                        .consumedAmount(0.0)
                        .cost(
                            GrantListResponse.Cost.builder()
                                .amount(0.0)
                                .currency("currency")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currencyId("currencyId")
                        .customerId("customerId")
                        .displayName("displayName")
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expireAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .grantType(GrantListResponse.GrantType.PAID)
                        .invoiceId("invoiceId")
                        .latestInvoice(
                            GrantListResponse.LatestInvoice.builder()
                                .billingId("billingId")
                                .billingReason(GrantListResponse.LatestInvoice.BillingReason.MANUAL)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency("currency")
                                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .errorMessage("errorMessage")
                                .paymentUrl("paymentUrl")
                                .pdfUrl("pdfUrl")
                                .requiresAction(true)
                                .status(GrantListResponse.LatestInvoice.Status.OPEN)
                                .subTotal(0.0)
                                .tax(0.0)
                                .total(0.0)
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .metadata(
                            GrantListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentCollection(GrantListResponse.PaymentCollection.NOT_REQUIRED)
                        .priority(0.0)
                        .resourceId("resourceId")
                        .sourceType(GrantListResponse.SourceType.PRICE)
                        .status(GrantListResponse.Status.PAYMENT_PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .voidedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pagination(
                    GrantListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(grantListPageResponse.data())
            .containsExactly(
                GrantListResponse.builder()
                    .id("id")
                    .amount(0.0)
                    .comment("comment")
                    .consumedAmount(0.0)
                    .cost(GrantListResponse.Cost.builder().amount(0.0).currency("currency").build())
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currencyId("currencyId")
                    .customerId("customerId")
                    .displayName("displayName")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expireAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .grantType(GrantListResponse.GrantType.PAID)
                    .invoiceId("invoiceId")
                    .latestInvoice(
                        GrantListResponse.LatestInvoice.builder()
                            .billingId("billingId")
                            .billingReason(GrantListResponse.LatestInvoice.BillingReason.MANUAL)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .errorMessage("errorMessage")
                            .paymentUrl("paymentUrl")
                            .pdfUrl("pdfUrl")
                            .requiresAction(true)
                            .status(GrantListResponse.LatestInvoice.Status.OPEN)
                            .subTotal(0.0)
                            .tax(0.0)
                            .total(0.0)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .metadata(
                        GrantListResponse.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .paymentCollection(GrantListResponse.PaymentCollection.NOT_REQUIRED)
                    .priority(0.0)
                    .resourceId("resourceId")
                    .sourceType(GrantListResponse.SourceType.PRICE)
                    .status(GrantListResponse.Status.PAYMENT_PENDING)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .voidedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(grantListPageResponse.pagination())
            .isEqualTo(
                GrantListPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val grantListPageResponse =
            GrantListPageResponse.builder()
                .addData(
                    GrantListResponse.builder()
                        .id("id")
                        .amount(0.0)
                        .comment("comment")
                        .consumedAmount(0.0)
                        .cost(
                            GrantListResponse.Cost.builder()
                                .amount(0.0)
                                .currency("currency")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currencyId("currencyId")
                        .customerId("customerId")
                        .displayName("displayName")
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expireAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .grantType(GrantListResponse.GrantType.PAID)
                        .invoiceId("invoiceId")
                        .latestInvoice(
                            GrantListResponse.LatestInvoice.builder()
                                .billingId("billingId")
                                .billingReason(GrantListResponse.LatestInvoice.BillingReason.MANUAL)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency("currency")
                                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .errorMessage("errorMessage")
                                .paymentUrl("paymentUrl")
                                .pdfUrl("pdfUrl")
                                .requiresAction(true)
                                .status(GrantListResponse.LatestInvoice.Status.OPEN)
                                .subTotal(0.0)
                                .tax(0.0)
                                .total(0.0)
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .metadata(
                            GrantListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentCollection(GrantListResponse.PaymentCollection.NOT_REQUIRED)
                        .priority(0.0)
                        .resourceId("resourceId")
                        .sourceType(GrantListResponse.SourceType.PRICE)
                        .status(GrantListResponse.Status.PAYMENT_PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .voidedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pagination(
                    GrantListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedGrantListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(grantListPageResponse),
                jacksonTypeRef<GrantListPageResponse>(),
            )

        assertThat(roundtrippedGrantListPageResponse).isEqualTo(grantListPageResponse)
    }
}
