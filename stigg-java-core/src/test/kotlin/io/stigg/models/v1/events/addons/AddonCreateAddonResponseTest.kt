// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonCreateAddonResponseTest {

    @Test
    fun create() {
        val addonCreateAddonResponse =
            AddonCreateAddonResponse.builder()
                .data(
                    AddonCreateAddonResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDependency("string")
                        .description("description")
                        .displayName("displayName")
                        .addEntitlement(
                            AddonCreateAddonResponse.Data.Entitlement.builder()
                                .id("id")
                                .type(AddonCreateAddonResponse.Data.Entitlement.Type.FEATURE)
                                .build()
                        )
                        .isLatest(true)
                        .maxQuantity(0L)
                        .metadata(
                            AddonCreateAddonResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingType(AddonCreateAddonResponse.Data.PricingType.FREE)
                        .status(AddonCreateAddonResponse.Data.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .build()

        assertThat(addonCreateAddonResponse.data())
            .isEqualTo(
                AddonCreateAddonResponse.Data.builder()
                    .id("id")
                    .billingId("billingId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addDependency("string")
                    .description("description")
                    .displayName("displayName")
                    .addEntitlement(
                        AddonCreateAddonResponse.Data.Entitlement.builder()
                            .id("id")
                            .type(AddonCreateAddonResponse.Data.Entitlement.Type.FEATURE)
                            .build()
                    )
                    .isLatest(true)
                    .maxQuantity(0L)
                    .metadata(
                        AddonCreateAddonResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .pricingType(AddonCreateAddonResponse.Data.PricingType.FREE)
                    .status(AddonCreateAddonResponse.Data.Status.DRAFT)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .versionNumber(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonCreateAddonResponse =
            AddonCreateAddonResponse.builder()
                .data(
                    AddonCreateAddonResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDependency("string")
                        .description("description")
                        .displayName("displayName")
                        .addEntitlement(
                            AddonCreateAddonResponse.Data.Entitlement.builder()
                                .id("id")
                                .type(AddonCreateAddonResponse.Data.Entitlement.Type.FEATURE)
                                .build()
                        )
                        .isLatest(true)
                        .maxQuantity(0L)
                        .metadata(
                            AddonCreateAddonResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingType(AddonCreateAddonResponse.Data.PricingType.FREE)
                        .status(AddonCreateAddonResponse.Data.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .build()

        val roundtrippedAddonCreateAddonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonCreateAddonResponse),
                jacksonTypeRef<AddonCreateAddonResponse>(),
            )

        assertThat(roundtrippedAddonCreateAddonResponse).isEqualTo(addonCreateAddonResponse)
    }
}
