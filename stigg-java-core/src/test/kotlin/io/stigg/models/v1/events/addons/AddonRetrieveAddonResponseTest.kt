// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonRetrieveAddonResponseTest {

    @Test
    fun create() {
        val addonRetrieveAddonResponse =
            AddonRetrieveAddonResponse.builder()
                .data(
                    AddonRetrieveAddonResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDependency("string")
                        .description("description")
                        .displayName("displayName")
                        .addEntitlement(
                            AddonRetrieveAddonResponse.Data.Entitlement.builder()
                                .id("id")
                                .type(AddonRetrieveAddonResponse.Data.Entitlement.Type.FEATURE)
                                .build()
                        )
                        .isLatest(true)
                        .maxQuantity(0L)
                        .metadata(
                            AddonRetrieveAddonResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingType(AddonRetrieveAddonResponse.Data.PricingType.FREE)
                        .productId("productId")
                        .status(AddonRetrieveAddonResponse.Data.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .build()

        assertThat(addonRetrieveAddonResponse.data())
            .isEqualTo(
                AddonRetrieveAddonResponse.Data.builder()
                    .id("id")
                    .billingId("billingId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addDependency("string")
                    .description("description")
                    .displayName("displayName")
                    .addEntitlement(
                        AddonRetrieveAddonResponse.Data.Entitlement.builder()
                            .id("id")
                            .type(AddonRetrieveAddonResponse.Data.Entitlement.Type.FEATURE)
                            .build()
                    )
                    .isLatest(true)
                    .maxQuantity(0L)
                    .metadata(
                        AddonRetrieveAddonResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .pricingType(AddonRetrieveAddonResponse.Data.PricingType.FREE)
                    .productId("productId")
                    .status(AddonRetrieveAddonResponse.Data.Status.DRAFT)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .versionNumber(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonRetrieveAddonResponse =
            AddonRetrieveAddonResponse.builder()
                .data(
                    AddonRetrieveAddonResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDependency("string")
                        .description("description")
                        .displayName("displayName")
                        .addEntitlement(
                            AddonRetrieveAddonResponse.Data.Entitlement.builder()
                                .id("id")
                                .type(AddonRetrieveAddonResponse.Data.Entitlement.Type.FEATURE)
                                .build()
                        )
                        .isLatest(true)
                        .maxQuantity(0L)
                        .metadata(
                            AddonRetrieveAddonResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingType(AddonRetrieveAddonResponse.Data.PricingType.FREE)
                        .productId("productId")
                        .status(AddonRetrieveAddonResponse.Data.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .build()

        val roundtrippedAddonRetrieveAddonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonRetrieveAddonResponse),
                jacksonTypeRef<AddonRetrieveAddonResponse>(),
            )

        assertThat(roundtrippedAddonRetrieveAddonResponse).isEqualTo(addonRetrieveAddonResponse)
    }
}
