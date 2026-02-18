// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonListAddonsResponseTest {

    @Test
    fun create() {
        val addonListAddonsResponse =
            AddonListAddonsResponse.builder()
                .id("id")
                .billingId("billingId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDependency("string")
                .description("description")
                .displayName("displayName")
                .addEntitlement(
                    AddonListAddonsResponse.Entitlement.builder()
                        .id("id")
                        .type(AddonListAddonsResponse.Entitlement.Type.FEATURE)
                        .build()
                )
                .isLatest(true)
                .maxQuantity(0L)
                .metadata(
                    AddonListAddonsResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .pricingType(AddonListAddonsResponse.PricingType.FREE)
                .productId("productId")
                .status(AddonListAddonsResponse.Status.DRAFT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .versionNumber(0L)
                .build()

        assertThat(addonListAddonsResponse.id()).isEqualTo("id")
        assertThat(addonListAddonsResponse.billingId()).contains("billingId")
        assertThat(addonListAddonsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(addonListAddonsResponse.dependencies().getOrNull()).containsExactly("string")
        assertThat(addonListAddonsResponse.description()).contains("description")
        assertThat(addonListAddonsResponse.displayName()).isEqualTo("displayName")
        assertThat(addonListAddonsResponse.entitlements())
            .containsExactly(
                AddonListAddonsResponse.Entitlement.builder()
                    .id("id")
                    .type(AddonListAddonsResponse.Entitlement.Type.FEATURE)
                    .build()
            )
        assertThat(addonListAddonsResponse.isLatest()).contains(true)
        assertThat(addonListAddonsResponse.maxQuantity()).contains(0L)
        assertThat(addonListAddonsResponse.metadata())
            .isEqualTo(
                AddonListAddonsResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(addonListAddonsResponse.pricingType())
            .contains(AddonListAddonsResponse.PricingType.FREE)
        assertThat(addonListAddonsResponse.productId()).isEqualTo("productId")
        assertThat(addonListAddonsResponse.status()).isEqualTo(AddonListAddonsResponse.Status.DRAFT)
        assertThat(addonListAddonsResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(addonListAddonsResponse.versionNumber()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonListAddonsResponse =
            AddonListAddonsResponse.builder()
                .id("id")
                .billingId("billingId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDependency("string")
                .description("description")
                .displayName("displayName")
                .addEntitlement(
                    AddonListAddonsResponse.Entitlement.builder()
                        .id("id")
                        .type(AddonListAddonsResponse.Entitlement.Type.FEATURE)
                        .build()
                )
                .isLatest(true)
                .maxQuantity(0L)
                .metadata(
                    AddonListAddonsResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .pricingType(AddonListAddonsResponse.PricingType.FREE)
                .productId("productId")
                .status(AddonListAddonsResponse.Status.DRAFT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .versionNumber(0L)
                .build()

        val roundtrippedAddonListAddonsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonListAddonsResponse),
                jacksonTypeRef<AddonListAddonsResponse>(),
            )

        assertThat(roundtrippedAddonListAddonsResponse).isEqualTo(addonListAddonsResponse)
    }
}
