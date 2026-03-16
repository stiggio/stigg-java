// File generated from our OpenAPI spec by Stainless.

package io.stigg.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import io.stigg.models.v1.customers.CustomerResponse
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/stigg-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.v1()).isNotNull()
    }

    @Test
    fun customerResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerResponse =
            CustomerResponse.builder()
                .data(
                    CustomerResponse.Data.builder()
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingCurrency(CustomerResponse.Data.BillingCurrency.USD)
                        .billingId("billingId")
                        .couponId(CustomerResponse.Data.CouponId.EMPTY)
                        .defaultPaymentMethod(
                            CustomerResponse.Data.DefaultPaymentMethod.builder()
                                .billingId("billingId")
                                .cardExpiryMonth(0.0)
                                .cardExpiryYear(0.0)
                                .cardLast4Digits("cardLast4Digits")
                                .type(CustomerResponse.Data.DefaultPaymentMethod.Type.CARD)
                                .build()
                        )
                        .email("dev@stainless.com")
                        .addIntegration(
                            CustomerResponse.Data.Integration.builder()
                                .id("id")
                                .syncedEntityId("syncedEntityId")
                                .vendorIdentifier(
                                    CustomerResponse.Data.Integration.VendorIdentifier.AUTH0
                                )
                                .build()
                        )
                        .language("language")
                        .metadata(
                            CustomerResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .passthrough(
                            CustomerResponse.Data.Passthrough.builder()
                                .stripe(
                                    CustomerResponse.Data.Passthrough.Stripe.builder()
                                        .billingAddress(
                                            CustomerResponse.Data.Passthrough.Stripe.BillingAddress
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
                                            CustomerResponse.Data.Passthrough.Stripe
                                                .InvoiceCustomFields
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
                                                .build()
                                        )
                                        .metadata(
                                            CustomerResponse.Data.Passthrough.Stripe.Metadata
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
                                                .build()
                                        )
                                        .paymentMethodId("paymentMethodId")
                                        .shippingAddress(
                                            CustomerResponse.Data.Passthrough.Stripe.ShippingAddress
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
                                            CustomerResponse.Data.Passthrough.Stripe.TaxId.builder()
                                                .type("type")
                                                .value("value")
                                                .build()
                                        )
                                        .build()
                                )
                                .zuora(
                                    CustomerResponse.Data.Passthrough.Zuora.builder()
                                        .billingAddress(
                                            CustomerResponse.Data.Passthrough.Zuora.BillingAddress
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
                                            CustomerResponse.Data.Passthrough.Zuora.Currency.USD
                                        )
                                        .metadata(
                                            CustomerResponse.Data.Passthrough.Zuora.Metadata
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
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
                .build()

        val roundtrippedCustomerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerResponse),
                jacksonTypeRef<CustomerResponse>(),
            )

        assertThat(roundtrippedCustomerResponse).isEqualTo(customerResponse)
    }
}
