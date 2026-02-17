// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonListAddonsPageResponseTest {

    @Test
    fun create() {
        val addonListAddonsPageResponse =
            AddonListAddonsPageResponse.builder()
                .addData(
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
                        .status(AddonListAddonsResponse.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .pagination(
                    AddonListAddonsPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(addonListAddonsPageResponse.data())
            .containsExactly(
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
                    .status(AddonListAddonsResponse.Status.DRAFT)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .versionNumber(0L)
                    .build()
            )
        assertThat(addonListAddonsPageResponse.pagination())
            .isEqualTo(
                AddonListAddonsPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonListAddonsPageResponse =
            AddonListAddonsPageResponse.builder()
                .addData(
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
                        .status(AddonListAddonsResponse.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .pagination(
                    AddonListAddonsPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedAddonListAddonsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonListAddonsPageResponse),
                jacksonTypeRef<AddonListAddonsPageResponse>(),
            )

        assertThat(roundtrippedAddonListAddonsPageResponse).isEqualTo(addonListAddonsPageResponse)
    }
}
