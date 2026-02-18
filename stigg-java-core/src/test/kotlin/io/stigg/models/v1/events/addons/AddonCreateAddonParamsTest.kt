// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons

import io.stigg.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonCreateAddonParamsTest {

    @Test
    fun create() {
        AddonCreateAddonParams.builder()
            .id("id")
            .displayName("displayName")
            .productId("productId")
            .billingId("billingId")
            .description("description")
            .maxQuantity(0L)
            .metadata(
                AddonCreateAddonParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .pricingType(AddonCreateAddonParams.PricingType.FREE)
            .status(AddonCreateAddonParams.Status.DRAFT)
            .build()
    }

    @Test
    fun body() {
        val params =
            AddonCreateAddonParams.builder()
                .id("id")
                .displayName("displayName")
                .productId("productId")
                .billingId("billingId")
                .description("description")
                .maxQuantity(0L)
                .metadata(
                    AddonCreateAddonParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .pricingType(AddonCreateAddonParams.PricingType.FREE)
                .status(AddonCreateAddonParams.Status.DRAFT)
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.displayName()).isEqualTo("displayName")
        assertThat(body.productId()).isEqualTo("productId")
        assertThat(body.billingId()).contains("billingId")
        assertThat(body.description()).contains("description")
        assertThat(body.maxQuantity()).contains(0L)
        assertThat(body.metadata())
            .contains(
                AddonCreateAddonParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.pricingType()).contains(AddonCreateAddonParams.PricingType.FREE)
        assertThat(body.status()).contains(AddonCreateAddonParams.Status.DRAFT)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AddonCreateAddonParams.builder()
                .id("id")
                .displayName("displayName")
                .productId("productId")
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.displayName()).isEqualTo("displayName")
        assertThat(body.productId()).isEqualTo("productId")
    }
}
