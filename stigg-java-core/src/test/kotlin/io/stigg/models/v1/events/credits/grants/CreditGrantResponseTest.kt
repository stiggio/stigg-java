// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits.grants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditGrantResponseTest {

    @Test
    fun create() {
        val creditGrantResponse =
            CreditGrantResponse.builder()
                .data(
                    CreditGrantResponse.Data.builder()
                        .id("id")
                        .amount(0.0)
                        .comment("comment")
                        .consumedAmount(0.0)
                        .cost(
                            CreditGrantResponse.Data.Cost.builder()
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
                        .grantType(CreditGrantResponse.Data.GrantType.PAID)
                        .invoiceId("invoiceId")
                        .latestInvoice(
                            CreditGrantResponse.Data.LatestInvoice.builder()
                                .billingId("billingId")
                                .billingReason(
                                    CreditGrantResponse.Data.LatestInvoice.BillingReason.MANUAL
                                )
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency("currency")
                                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .errorMessage("errorMessage")
                                .paymentUrl("paymentUrl")
                                .pdfUrl("pdfUrl")
                                .requiresAction(true)
                                .status(CreditGrantResponse.Data.LatestInvoice.Status.OPEN)
                                .subTotal(0.0)
                                .tax(0.0)
                                .total(0.0)
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .metadata(
                            CreditGrantResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentCollection(CreditGrantResponse.Data.PaymentCollection.NOT_REQUIRED)
                        .priority(0.0)
                        .resourceId("resourceId")
                        .sourceType(CreditGrantResponse.Data.SourceType.PRICE)
                        .status(CreditGrantResponse.Data.Status.PAYMENT_PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .voidedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(creditGrantResponse.data())
            .isEqualTo(
                CreditGrantResponse.Data.builder()
                    .id("id")
                    .amount(0.0)
                    .comment("comment")
                    .consumedAmount(0.0)
                    .cost(
                        CreditGrantResponse.Data.Cost.builder()
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
                    .grantType(CreditGrantResponse.Data.GrantType.PAID)
                    .invoiceId("invoiceId")
                    .latestInvoice(
                        CreditGrantResponse.Data.LatestInvoice.builder()
                            .billingId("billingId")
                            .billingReason(
                                CreditGrantResponse.Data.LatestInvoice.BillingReason.MANUAL
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .errorMessage("errorMessage")
                            .paymentUrl("paymentUrl")
                            .pdfUrl("pdfUrl")
                            .requiresAction(true)
                            .status(CreditGrantResponse.Data.LatestInvoice.Status.OPEN)
                            .subTotal(0.0)
                            .tax(0.0)
                            .total(0.0)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .metadata(
                        CreditGrantResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .paymentCollection(CreditGrantResponse.Data.PaymentCollection.NOT_REQUIRED)
                    .priority(0.0)
                    .resourceId("resourceId")
                    .sourceType(CreditGrantResponse.Data.SourceType.PRICE)
                    .status(CreditGrantResponse.Data.Status.PAYMENT_PENDING)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .voidedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditGrantResponse =
            CreditGrantResponse.builder()
                .data(
                    CreditGrantResponse.Data.builder()
                        .id("id")
                        .amount(0.0)
                        .comment("comment")
                        .consumedAmount(0.0)
                        .cost(
                            CreditGrantResponse.Data.Cost.builder()
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
                        .grantType(CreditGrantResponse.Data.GrantType.PAID)
                        .invoiceId("invoiceId")
                        .latestInvoice(
                            CreditGrantResponse.Data.LatestInvoice.builder()
                                .billingId("billingId")
                                .billingReason(
                                    CreditGrantResponse.Data.LatestInvoice.BillingReason.MANUAL
                                )
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency("currency")
                                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .errorMessage("errorMessage")
                                .paymentUrl("paymentUrl")
                                .pdfUrl("pdfUrl")
                                .requiresAction(true)
                                .status(CreditGrantResponse.Data.LatestInvoice.Status.OPEN)
                                .subTotal(0.0)
                                .tax(0.0)
                                .total(0.0)
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .metadata(
                            CreditGrantResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentCollection(CreditGrantResponse.Data.PaymentCollection.NOT_REQUIRED)
                        .priority(0.0)
                        .resourceId("resourceId")
                        .sourceType(CreditGrantResponse.Data.SourceType.PRICE)
                        .status(CreditGrantResponse.Data.Status.PAYMENT_PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .voidedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCreditGrantResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditGrantResponse),
                jacksonTypeRef<CreditGrantResponse>(),
            )

        assertThat(roundtrippedCreditGrantResponse).isEqualTo(creditGrantResponse)
    }
}
