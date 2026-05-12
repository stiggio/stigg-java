// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.credits

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.credits.grants.GrantCreateParams
import io.stigg.models.v1.credits.grants.GrantListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GrantServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val grantServiceAsync = client.v1().credits().grants()

        val creditGrantResponseFuture =
            grantServiceAsync.create(
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
            )

        val creditGrantResponse = creditGrantResponseFuture.get()
        creditGrantResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val grantServiceAsync = client.v1().credits().grants()

        val pageFuture =
            grantServiceAsync.list(GrantListParams.builder().customerId("customerId").build())

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun void_() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val grantServiceAsync = client.v1().credits().grants()

        val creditGrantResponseFuture = grantServiceAsync.void_("x")

        val creditGrantResponse = creditGrantResponseFuture.get()
        creditGrantResponse.validate()
    }
}
