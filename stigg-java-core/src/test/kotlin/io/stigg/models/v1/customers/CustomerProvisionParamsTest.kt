// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import io.stigg.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerProvisionParamsTest {

    @Test
    fun create() {
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
                    .vendorIdentifier(CustomerProvisionParams.Integration.VendorIdentifier.AUTH0)
                    .build()
            )
            .metadata(
                CustomerProvisionParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("name")
            .build()
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.couponId()).contains("couponId")
        assertThat(body.defaultPaymentMethod())
            .contains(
                CustomerProvisionParams.DefaultPaymentMethod.builder()
                    .billingId("billingId")
                    .cardExpiryMonth(0.0)
                    .cardExpiryYear(0.0)
                    .cardLast4Digits("cardLast4Digits")
                    .type(CustomerProvisionParams.DefaultPaymentMethod.Type.CARD)
                    .build()
            )
        assertThat(body.email()).contains("dev@stainless.com")
        assertThat(body.integrations().getOrNull())
            .containsExactly(
                CustomerProvisionParams.Integration.builder()
                    .id("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(CustomerProvisionParams.Integration.VendorIdentifier.AUTH0)
                    .build()
            )
        assertThat(body.metadata())
            .contains(
                CustomerProvisionParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerProvisionParams.builder().id("id").build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
    }
}
