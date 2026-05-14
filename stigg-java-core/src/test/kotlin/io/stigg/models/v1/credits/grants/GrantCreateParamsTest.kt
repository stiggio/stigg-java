// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.grants

import io.stigg.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GrantCreateParamsTest {

    @Test
    fun create() {
        GrantCreateParams.builder()
            .amount(0.0)
            .currencyId("currencyId")
            .customerId("customerId")
            .displayName("displayName")
            .grantType(GrantCreateParams.GrantType.PAID)
            .awaitPaymentConfirmation(true)
            .billingInformation(
                GrantCreateParams.BillingInformation.builder()
                    .billingAddress(
                        GrantCreateParams.BillingInformation.BillingAddress.builder()
                            .city("city")
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .postalCode("postalCode")
                            .state("state")
                            .build()
                    )
                    .invoiceDaysUntilDue(0.0)
                    .isInvoicePaid(true)
                    .build()
            )
            .comment("comment")
            .cost(
                GrantCreateParams.Cost.builder()
                    .amount(0.0)
                    .currency(GrantCreateParams.Cost.Currency.USD)
                    .build()
            )
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .expireAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .metadata(
                GrantCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .paymentCollectionMethod(GrantCreateParams.PaymentCollectionMethod.CHARGE)
            .priority(0L)
            .resourceId("resourceId")
            .build()
    }

    @Test
    fun body() {
        val params =
            GrantCreateParams.builder()
                .amount(0.0)
                .currencyId("currencyId")
                .customerId("customerId")
                .displayName("displayName")
                .grantType(GrantCreateParams.GrantType.PAID)
                .awaitPaymentConfirmation(true)
                .billingInformation(
                    GrantCreateParams.BillingInformation.builder()
                        .billingAddress(
                            GrantCreateParams.BillingInformation.BillingAddress.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .postalCode("postalCode")
                                .state("state")
                                .build()
                        )
                        .invoiceDaysUntilDue(0.0)
                        .isInvoicePaid(true)
                        .build()
                )
                .comment("comment")
                .cost(
                    GrantCreateParams.Cost.builder()
                        .amount(0.0)
                        .currency(GrantCreateParams.Cost.Currency.USD)
                        .build()
                )
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expireAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    GrantCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentCollectionMethod(GrantCreateParams.PaymentCollectionMethod.CHARGE)
                .priority(0L)
                .resourceId("resourceId")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0.0)
        assertThat(body.currencyId()).isEqualTo("currencyId")
        assertThat(body.customerId()).isEqualTo("customerId")
        assertThat(body.displayName()).isEqualTo("displayName")
        assertThat(body.grantType()).isEqualTo(GrantCreateParams.GrantType.PAID)
        assertThat(body.awaitPaymentConfirmation()).contains(true)
        assertThat(body.billingInformation())
            .contains(
                GrantCreateParams.BillingInformation.builder()
                    .billingAddress(
                        GrantCreateParams.BillingInformation.BillingAddress.builder()
                            .city("city")
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .postalCode("postalCode")
                            .state("state")
                            .build()
                    )
                    .invoiceDaysUntilDue(0.0)
                    .isInvoicePaid(true)
                    .build()
            )
        assertThat(body.comment()).contains("comment")
        assertThat(body.cost())
            .contains(
                GrantCreateParams.Cost.builder()
                    .amount(0.0)
                    .currency(GrantCreateParams.Cost.Currency.USD)
                    .build()
            )
        assertThat(body.effectiveAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.expireAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.metadata())
            .contains(
                GrantCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.paymentCollectionMethod())
            .contains(GrantCreateParams.PaymentCollectionMethod.CHARGE)
        assertThat(body.priority()).contains(0L)
        assertThat(body.resourceId()).contains("resourceId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GrantCreateParams.builder()
                .amount(0.0)
                .currencyId("currencyId")
                .customerId("customerId")
                .displayName("displayName")
                .grantType(GrantCreateParams.GrantType.PAID)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0.0)
        assertThat(body.currencyId()).isEqualTo("currencyId")
        assertThat(body.customerId()).isEqualTo("customerId")
        assertThat(body.displayName()).isEqualTo("displayName")
        assertThat(body.grantType()).isEqualTo(GrantCreateParams.GrantType.PAID)
    }
}
