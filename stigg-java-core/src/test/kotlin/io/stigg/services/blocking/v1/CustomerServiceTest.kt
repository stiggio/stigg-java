// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1.customers.CustomerImportParams
import io.stigg.models.v1.customers.CustomerProvisionParams
import io.stigg.models.v1.customers.CustomerUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceTest {

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
                    .couponId("couponId")
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

        val page = customerService.list()

        page.response().validate()
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
    fun import_() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.v1().customers()

        val response =
            customerService.import_(
                CustomerImportParams.builder()
                    .addCustomer(
                        CustomerImportParams.Customer.builder()
                            .id("id")
                            .email("dev@stainless.com")
                            .name("name")
                            .metadata(
                                CustomerImportParams.Customer.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentMethodId("paymentMethodId")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun provision() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.v1().customers()

        val customerResponse =
            customerService.provision(
                CustomerProvisionParams.builder()
                    .id("id")
                    .couponId("couponId")
                    .defaultPaymentMethod(
                        CustomerProvisionParams.DefaultPaymentMethod.builder()
                            .billingId("billingId")
                            .cardExpiryMonth(0.0)
                            .cardExpiryYear(0.0)
                            .cardLast4Digits("cardLast4Digits")
                            .type(CustomerProvisionParams.DefaultPaymentMethod.Type.CARD)
                            .build()
                    )
                    .email("dev@stainless.com")
                    .addIntegration(
                        CustomerProvisionParams.Integration.builder()
                            .id("id")
                            .syncedEntityId("syncedEntityId")
                            .vendorIdentifier(
                                CustomerProvisionParams.Integration.VendorIdentifier.AUTH0
                            )
                            .build()
                    )
                    .metadata(
                        CustomerProvisionParams.Metadata.builder()
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
