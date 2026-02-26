// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonListPageResponseTest {

    @Test
    fun create() {
        val addonListPageResponse =
            AddonListPageResponse.builder()
                .addData(
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
                )
                .pagination(
                    AddonListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(addonListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(addonListPageResponse.pagination())
            .isEqualTo(
                AddonListPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonListPageResponse =
            AddonListPageResponse.builder()
                .addData(
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
                )
                .pagination(
                    AddonListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedAddonListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonListPageResponse),
                jacksonTypeRef<AddonListPageResponse>(),
            )

        assertThat(roundtrippedAddonListPageResponse).isEqualTo(addonListPageResponse)
    }
}
