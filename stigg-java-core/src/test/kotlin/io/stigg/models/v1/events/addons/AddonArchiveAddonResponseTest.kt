// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonArchiveAddonResponseTest {

    @Test
    fun create() {
        val addonArchiveAddonResponse =
            AddonArchiveAddonResponse.builder()
                .data(
                    AddonArchiveAddonResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDependency("string")
                        .description("description")
                        .displayName("displayName")
                        .addEntitlement(
                            AddonArchiveAddonResponse.Data.Entitlement.builder()
                                .id("id")
                                .type(AddonArchiveAddonResponse.Data.Entitlement.Type.FEATURE)
                                .build()
                        )
                        .isLatest(true)
                        .maxQuantity(0L)
                        .metadata(
                            AddonArchiveAddonResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingType(AddonArchiveAddonResponse.Data.PricingType.FREE)
                        .productId("productId")
                        .status(AddonArchiveAddonResponse.Data.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .build()

        assertThat(addonArchiveAddonResponse.data())
            .isEqualTo(
                AddonArchiveAddonResponse.Data.builder()
                    .id("id")
                    .billingId("billingId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addDependency("string")
                    .description("description")
                    .displayName("displayName")
                    .addEntitlement(
                        AddonArchiveAddonResponse.Data.Entitlement.builder()
                            .id("id")
                            .type(AddonArchiveAddonResponse.Data.Entitlement.Type.FEATURE)
                            .build()
                    )
                    .isLatest(true)
                    .maxQuantity(0L)
                    .metadata(
                        AddonArchiveAddonResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .pricingType(AddonArchiveAddonResponse.Data.PricingType.FREE)
                    .productId("productId")
                    .status(AddonArchiveAddonResponse.Data.Status.DRAFT)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .versionNumber(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonArchiveAddonResponse =
            AddonArchiveAddonResponse.builder()
                .data(
                    AddonArchiveAddonResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDependency("string")
                        .description("description")
                        .displayName("displayName")
                        .addEntitlement(
                            AddonArchiveAddonResponse.Data.Entitlement.builder()
                                .id("id")
                                .type(AddonArchiveAddonResponse.Data.Entitlement.Type.FEATURE)
                                .build()
                        )
                        .isLatest(true)
                        .maxQuantity(0L)
                        .metadata(
                            AddonArchiveAddonResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingType(AddonArchiveAddonResponse.Data.PricingType.FREE)
                        .productId("productId")
                        .status(AddonArchiveAddonResponse.Data.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .build()

        val roundtrippedAddonArchiveAddonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonArchiveAddonResponse),
                jacksonTypeRef<AddonArchiveAddonResponse>(),
            )

        assertThat(roundtrippedAddonArchiveAddonResponse).isEqualTo(addonArchiveAddonResponse)
    }
}
