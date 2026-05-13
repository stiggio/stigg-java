// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1.customers.CustomerCheckEntitlementParams
import io.stigg.models.v1.customers.CustomerImportParams
import io.stigg.models.v1.customers.CustomerProvisionParams
import io.stigg.models.v1.customers.CustomerRetrieveEntitlementsParams
import io.stigg.models.v1.customers.CustomerUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customerService = client.v1().customers()

        val customerResponse = customerService.retrieve("x")

        customerResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customerService = client.v1().customers()

        val customerResponse =
            customerService.update(
                CustomerUpdateParams.builder()
                    .id("x")
                    .billingCurrency(CustomerUpdateParams.BillingCurrency.USD)
                    .billingId("billingId")
                    .couponId(CustomerUpdateParams.CouponId.EMPTY)
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
                    .language("language")
                    .metadata(
                        CustomerUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .passthrough(
                        CustomerUpdateParams.Passthrough.builder()
                            .stripe(
                                CustomerUpdateParams.Passthrough.Stripe.builder()
                                    .billingAddress(
                                        CustomerUpdateParams.Passthrough.Stripe.BillingAddress
                                            .builder()
                                            .city("city")
                                            .country("country")
                                            .line1("line1")
                                            .line2("line2")
                                            .postalCode("postalCode")
                                            .state("state")
                                            .build()
                                    )
                                    .customerName("customerName")
                                    .invoiceCustomFields(
                                        CustomerUpdateParams.Passthrough.Stripe.InvoiceCustomFields
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .metadata(
                                        CustomerUpdateParams.Passthrough.Stripe.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .paymentMethodId("paymentMethodId")
                                    .shippingAddress(
                                        CustomerUpdateParams.Passthrough.Stripe.ShippingAddress
                                            .builder()
                                            .city("city")
                                            .country("country")
                                            .line1("line1")
                                            .line2("line2")
                                            .postalCode("postalCode")
                                            .state("state")
                                            .build()
                                    )
                                    .addTaxId(
                                        CustomerUpdateParams.Passthrough.Stripe.TaxId.builder()
                                            .type("type")
                                            .value("value")
                                            .build()
                                    )
                                    .build()
                            )
                            .zuora(
                                CustomerUpdateParams.Passthrough.Zuora.builder()
                                    .billingAddress(
                                        CustomerUpdateParams.Passthrough.Zuora.BillingAddress
                                            .builder()
                                            .city("city")
                                            .country("country")
                                            .line1("line1")
                                            .line2("line2")
                                            .postalCode("postalCode")
                                            .state("state")
                                            .build()
                                    )
                                    .currency(CustomerUpdateParams.Passthrough.Zuora.Currency.USD)
                                    .metadata(
                                        CustomerUpdateParams.Passthrough.Zuora.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .paymentMethodId("paymentMethodId")
                                    .build()
                            )
                            .build()
                    )
                    .timezone("timezone")
                    .build()
            )

        customerResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customerService = client.v1().customers()

        val page = customerService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customerService = client.v1().customers()

        val customerResponse = customerService.archive("x")

        customerResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun checkEntitlement() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customerService = client.v1().customers()

        val response =
            customerService.checkEntitlement(
                CustomerCheckEntitlementParams.builder()
                    .id("x")
                    .currencyId("x")
                    .featureId("x")
                    .requestedUsage(0L)
                    .addRequestedValue("string")
                    .resourceId("x")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun import_() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customerService = client.v1().customers()

        val response =
            customerService.import_(
                CustomerImportParams.builder()
                    .addCustomer(
                        CustomerImportParams.Customer.builder()
                            .id("id")
                            .email("dev@stainless.com")
                            .name("name")
                            .billingId("billingId")
                            .metadata(
                                CustomerImportParams.Customer.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentMethodId("paymentMethodId")
                            .salesforceId("salesforceId")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .integrationId("integrationId")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listResources() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customerService = client.v1().customers()

        val page = customerService.listResources("x")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun provision() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customerService = client.v1().customers()

        val customerResponse =
            customerService.provision(
                CustomerProvisionParams.builder()
                    .id("id")
                    .billingCurrency(CustomerProvisionParams.BillingCurrency.USD)
                    .billingId("billingId")
                    .couponId(CustomerProvisionParams.CouponId.EMPTY)
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
                    .language("language")
                    .metadata(
                        CustomerProvisionParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .passthrough(
                        CustomerProvisionParams.Passthrough.builder()
                            .stripe(
                                CustomerProvisionParams.Passthrough.Stripe.builder()
                                    .billingAddress(
                                        CustomerProvisionParams.Passthrough.Stripe.BillingAddress
                                            .builder()
                                            .city("city")
                                            .country("country")
                                            .line1("line1")
                                            .line2("line2")
                                            .postalCode("postalCode")
                                            .state("state")
                                            .build()
                                    )
                                    .customerName("customerName")
                                    .invoiceCustomFields(
                                        CustomerProvisionParams.Passthrough.Stripe
                                            .InvoiceCustomFields
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .metadata(
                                        CustomerProvisionParams.Passthrough.Stripe.Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .paymentMethodId("paymentMethodId")
                                    .shippingAddress(
                                        CustomerProvisionParams.Passthrough.Stripe.ShippingAddress
                                            .builder()
                                            .city("city")
                                            .country("country")
                                            .line1("line1")
                                            .line2("line2")
                                            .postalCode("postalCode")
                                            .state("state")
                                            .build()
                                    )
                                    .addTaxId(
                                        CustomerProvisionParams.Passthrough.Stripe.TaxId.builder()
                                            .type("type")
                                            .value("value")
                                            .build()
                                    )
                                    .build()
                            )
                            .zuora(
                                CustomerProvisionParams.Passthrough.Zuora.builder()
                                    .billingAddress(
                                        CustomerProvisionParams.Passthrough.Zuora.BillingAddress
                                            .builder()
                                            .city("city")
                                            .country("country")
                                            .line1("line1")
                                            .line2("line2")
                                            .postalCode("postalCode")
                                            .state("state")
                                            .build()
                                    )
                                    .currency(
                                        CustomerProvisionParams.Passthrough.Zuora.Currency.USD
                                    )
                                    .metadata(
                                        CustomerProvisionParams.Passthrough.Zuora.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .paymentMethodId("paymentMethodId")
                                    .build()
                            )
                            .build()
                    )
                    .timezone("timezone")
                    .build()
            )

        customerResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveEntitlements() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customerService = client.v1().customers()

        val response =
            customerService.retrieveEntitlements(
                CustomerRetrieveEntitlementsParams.builder()
                    .id("x")
                    .resourceId("resourceId")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unarchive() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val customerService = client.v1().customers()

        val customerResponse = customerService.unarchive("x")

        customerResponse.validate()
    }
}
