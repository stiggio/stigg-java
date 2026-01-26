// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClient
import com.stigg.api.core.JsonValue
import com.stigg.api.models.v1.customers.CustomerCreateParams
import com.stigg.api.models.v1.customers.CustomerListParams
import com.stigg.api.models.v1.customers.CustomerUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.v1().customers()

        val customerResponse =
            customerService.create(
                CustomerCreateParams.builder()
                    .id("id")
                    .defaultPaymentMethod(
                        CustomerCreateParams.DefaultPaymentMethod.builder()
                            .billingId("billingId")
                            .cardExpiryMonth(0.0)
                            .cardExpiryYear(0.0)
                            .cardLast4Digits("cardLast4Digits")
                            .type(CustomerCreateParams.DefaultPaymentMethod.Type.CARD)
                            .build()
                    )
                    .email("dev@stainless.com")
                    .addIntegration(
                        CustomerCreateParams.Integration.builder()
                            .id("id")
                            .syncedEntityId("syncedEntityId")
                            .vendorIdentifier(
                                CustomerCreateParams.Integration.VendorIdentifier.AUTH0
                            )
                            .build()
                    )
                    .metadata(
                        CustomerCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        customerResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.v1().customers()

        val customerResponse = customerService.retrieve("x")

        customerResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.v1().customers()

        val customerResponse =
            customerService.update(
                CustomerUpdateParams.builder()
                    .id("x")
                    .email("dev@stainless.com")
                    .addIntegration(
                        CustomerUpdateParams.Integration.builder()
                            .id("id")
                            .syncedEntityId("syncedEntityId")
                            .vendorIdentifier(
                                CustomerUpdateParams.Integration.VendorIdentifier.AUTH0
                            )
                            .build()
                    )
                    .metadata(
                        CustomerUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        customerResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.v1().customers()

        val customers =
            customerService.list(
                CustomerListParams.builder()
                    .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(1L)
                    .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        customers.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun archive() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.v1().customers()

        val customerResponse = customerService.archive("x")

        customerResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unarchive() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.v1().customers()

        val customerResponse = customerService.unarchive("x")

        customerResponse.validate()
    }
}
