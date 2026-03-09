// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits.grants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GrantListResponseTest {

    @Test
    fun create() {
        val grantListResponse =
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

        assertThat(grantListResponse.id()).isEqualTo("id")
        assertThat(grantListResponse.amount()).isEqualTo(0.0)
        assertThat(grantListResponse.comment()).contains("comment")
        assertThat(grantListResponse.consumedAmount()).isEqualTo(0.0)
        assertThat(grantListResponse.cost())
            .isEqualTo(GrantListResponse.Cost.builder().amount(0.0).currency("currency").build())
        assertThat(grantListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(grantListResponse.currencyId()).isEqualTo("currencyId")
        assertThat(grantListResponse.customerId()).isEqualTo("customerId")
        assertThat(grantListResponse.displayName()).isEqualTo("displayName")
        assertThat(grantListResponse.effectiveAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(grantListResponse.expireAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(grantListResponse.grantType()).isEqualTo(GrantListResponse.GrantType.PAID)
        assertThat(grantListResponse.invoiceId()).contains("invoiceId")
        assertThat(grantListResponse.latestInvoice())
            .contains(
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
        assertThat(grantListResponse.metadata())
            .isEqualTo(
                GrantListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(grantListResponse.paymentCollection())
            .isEqualTo(GrantListResponse.PaymentCollection.NOT_REQUIRED)
        assertThat(grantListResponse.priority()).isEqualTo(0.0)
        assertThat(grantListResponse.resourceId()).contains("resourceId")
        assertThat(grantListResponse.sourceType()).contains(GrantListResponse.SourceType.PRICE)
        assertThat(grantListResponse.status()).isEqualTo(GrantListResponse.Status.PAYMENT_PENDING)
        assertThat(grantListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(grantListResponse.voidedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val grantListResponse =
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

        val roundtrippedGrantListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(grantListResponse),
                jacksonTypeRef<GrantListResponse>(),
            )

        assertThat(roundtrippedGrantListResponse).isEqualTo(grantListResponse)
    }
}
