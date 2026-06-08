// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.credits

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1.credits.grants.GrantCreateParams
import io.stigg.models.v1.credits.grants.GrantListParams
import io.stigg.models.v1.credits.grants.GrantVoidParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GrantServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val grantService = client.v1().credits().grants()

        val creditGrantResponse =
            grantService.create(
                GrantCreateParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
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

        creditGrantResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val grantService = client.v1().credits().grants()

        val page = grantService.list(GrantListParams.builder().customerId("customerId").build())

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun void_() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val grantService = client.v1().credits().grants()

        val creditGrantResponse =
            grantService.void_(
                GrantVoidParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        creditGrantResponse.validate()
    }
}
