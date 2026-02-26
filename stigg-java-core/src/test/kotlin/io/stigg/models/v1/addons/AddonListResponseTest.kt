// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonListResponseTest {

    @Test
    fun create() {
        val addonListResponse =
            AddonListResponse.builder()
                .id("id")
                .billingId("billingId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDependency("string")
                .description("description")
                .displayName("displayName")
                .addEntitlement(
                    AddonListResponse.Entitlement.builder()
                        .id("id")
                        .type(AddonListResponse.Entitlement.Type.FEATURE)
                        .build()
                )
                .isLatest(true)
                .maxQuantity(0L)
                .metadata(
                    AddonListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .pricingType(AddonListResponse.PricingType.FREE)
                .productId("productId")
                .status(AddonListResponse.Status.DRAFT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .versionNumber(0L)
                .build()

        assertThat(addonListResponse.id()).isEqualTo("id")
        assertThat(addonListResponse.billingId()).contains("billingId")
        assertThat(addonListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(addonListResponse.dependencies().getOrNull()).containsExactly("string")
        assertThat(addonListResponse.description()).contains("description")
        assertThat(addonListResponse.displayName()).isEqualTo("displayName")
        assertThat(addonListResponse.entitlements())
            .containsExactly(
                AddonListResponse.Entitlement.builder()
                    .id("id")
                    .type(AddonListResponse.Entitlement.Type.FEATURE)
                    .build()
            )
        assertThat(addonListResponse.isLatest()).contains(true)
        assertThat(addonListResponse.maxQuantity()).contains(0L)
        assertThat(addonListResponse.metadata())
            .isEqualTo(
                AddonListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(addonListResponse.pricingType()).contains(AddonListResponse.PricingType.FREE)
        assertThat(addonListResponse.productId()).isEqualTo("productId")
        assertThat(addonListResponse.status()).isEqualTo(AddonListResponse.Status.DRAFT)
        assertThat(addonListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(addonListResponse.versionNumber()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonListResponse =
            AddonListResponse.builder()
                .id("id")
                .billingId("billingId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDependency("string")
                .description("description")
                .displayName("displayName")
                .addEntitlement(
                    AddonListResponse.Entitlement.builder()
                        .id("id")
                        .type(AddonListResponse.Entitlement.Type.FEATURE)
                        .build()
                )
                .isLatest(true)
                .maxQuantity(0L)
                .metadata(
                    AddonListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .pricingType(AddonListResponse.PricingType.FREE)
                .productId("productId")
                .status(AddonListResponse.Status.DRAFT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .versionNumber(0L)
                .build()

        val roundtrippedAddonListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonListResponse),
                jacksonTypeRef<AddonListResponse>(),
            )

        assertThat(roundtrippedAddonListResponse).isEqualTo(addonListResponse)
    }
}
