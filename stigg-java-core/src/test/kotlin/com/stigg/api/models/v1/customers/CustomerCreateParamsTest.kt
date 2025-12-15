// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers

import com.stigg.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreateParamsTest {

    @Test
    fun create() {
        CustomerCreateParams.builder()
            .email("dev@stainless.com")
            .externalId("externalId")
            .name("name")
            .defaultPaymentMethod(
                CustomerCreateParams.DefaultPaymentMethod.builder()
                    .billingId("billingId")
                    .cardExpiryMonth(0.0)
                    .cardExpiryYear(0.0)
                    .cardLast4Digits("cardLast4Digits")
                    .type(CustomerCreateParams.DefaultPaymentMethod.Type.CARD)
                    .build()
            )
            .addIntegration(
                CustomerCreateParams.Integration.builder()
                    .id("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(CustomerCreateParams.Integration.VendorIdentifier.AUTH0)
                    .build()
            )
            .metadata(
                CustomerCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreateParams.builder()
                .email("dev@stainless.com")
                .externalId("externalId")
                .name("name")
                .defaultPaymentMethod(
                    CustomerCreateParams.DefaultPaymentMethod.builder()
                        .billingId("billingId")
                        .cardExpiryMonth(0.0)
                        .cardExpiryYear(0.0)
                        .cardLast4Digits("cardLast4Digits")
                        .type(CustomerCreateParams.DefaultPaymentMethod.Type.CARD)
                        .build()
                )
                .addIntegration(
                    CustomerCreateParams.Integration.builder()
                        .id("id")
                        .syncedEntityId("syncedEntityId")
                        .vendorIdentifier(CustomerCreateParams.Integration.VendorIdentifier.AUTH0)
                        .build()
                )
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.email()).contains("dev@stainless.com")
        assertThat(body.externalId()).isEqualTo("externalId")
        assertThat(body.name()).contains("name")
        assertThat(body.defaultPaymentMethod())
            .contains(
                CustomerCreateParams.DefaultPaymentMethod.builder()
                    .billingId("billingId")
                    .cardExpiryMonth(0.0)
                    .cardExpiryYear(0.0)
                    .cardLast4Digits("cardLast4Digits")
                    .type(CustomerCreateParams.DefaultPaymentMethod.Type.CARD)
                    .build()
            )
        assertThat(body.integrations().getOrNull())
            .containsExactly(
                CustomerCreateParams.Integration.builder()
                    .id("id")
                    .syncedEntityId("syncedEntityId")
                    .vendorIdentifier(CustomerCreateParams.Integration.VendorIdentifier.AUTH0)
                    .build()
            )
        assertThat(body.metadata())
            .contains(
                CustomerCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerCreateParams.builder()
                .email("dev@stainless.com")
                .externalId("externalId")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.email()).contains("dev@stainless.com")
        assertThat(body.externalId()).isEqualTo("externalId")
        assertThat(body.name()).contains("name")
    }
}
