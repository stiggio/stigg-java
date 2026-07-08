// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonCreateParamsTest {

    @Test
    fun create() {
        AddonCreateParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .id("id")
            .displayName("displayName")
            .productId("productId")
            .billingId("billingId")
            .description("description")
            .maxQuantity(1L)
            .metadata(
                AddonCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .pricingType(AddonCreateParams.PricingType.FREE)
            .status(AddonCreateParams.Status.DRAFT)
            .build()
    }

    @Test
    fun headers() {
        val params =
            AddonCreateParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .id("id")
                .displayName("displayName")
                .productId("productId")
                .billingId("billingId")
                .description("description")
                .maxQuantity(1L)
                .metadata(
                    AddonCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .pricingType(AddonCreateParams.PricingType.FREE)
                .status(AddonCreateParams.Status.DRAFT)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-ACCOUNT-ID", "X-ACCOUNT-ID")
                    .put("X-ENVIRONMENT-ID", "X-ENVIRONMENT-ID")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            AddonCreateParams.builder()
                .id("id")
                .displayName("displayName")
                .productId("productId")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            AddonCreateParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .id("id")
                .displayName("displayName")
                .productId("productId")
                .billingId("billingId")
                .description("description")
                .maxQuantity(1L)
                .metadata(
                    AddonCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .pricingType(AddonCreateParams.PricingType.FREE)
                .status(AddonCreateParams.Status.DRAFT)
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.displayName()).isEqualTo("displayName")
        assertThat(body.productId()).isEqualTo("productId")
        assertThat(body.billingId()).contains("billingId")
        assertThat(body.description()).contains("description")
        assertThat(body.maxQuantity()).contains(1L)
        assertThat(body.metadata())
            .contains(
                AddonCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.pricingType()).contains(AddonCreateParams.PricingType.FREE)
        assertThat(body.status()).contains(AddonCreateParams.Status.DRAFT)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AddonCreateParams.builder()
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
