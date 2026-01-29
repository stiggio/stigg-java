// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.customers.CustomerImportParams
import io.stigg.models.v1.customers.CustomerProvisionParams
import io.stigg.models.v1.customers.CustomerUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.v1().customers()

        val customerResponseFuture = customerServiceAsync.retrieve("x")

        val customerResponse = customerResponseFuture.get()
        customerResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.v1().customers()

        val customerResponseFuture =
            customerServiceAsync.update(
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

        val customerResponse = customerResponseFuture.get()
        customerResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.v1().customers()

        val pageFuture = customerServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun archive() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.v1().customers()

        val customerResponseFuture = customerServiceAsync.archive("x")

        val customerResponse = customerResponseFuture.get()
        customerResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun import_() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.v1().customers()

        val responseFuture =
            customerServiceAsync.import_(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun provision() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.v1().customers()

        val customerResponseFuture =
            customerServiceAsync.provision(
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

        val customerResponse = customerResponseFuture.get()
        customerResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unarchive() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.v1().customers()

        val customerResponseFuture = customerServiceAsync.unarchive("x")

        val customerResponse = customerResponseFuture.get()
        customerResponse.validate()
    }
}
