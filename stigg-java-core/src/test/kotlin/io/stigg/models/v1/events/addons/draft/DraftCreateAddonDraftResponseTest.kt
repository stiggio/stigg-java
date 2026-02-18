// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons.draft

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DraftCreateAddonDraftResponseTest {

    @Test
    fun create() {
        val draftCreateAddonDraftResponse =
            DraftCreateAddonDraftResponse.builder()
                .data(
                    DraftCreateAddonDraftResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDependency("string")
                        .description("description")
                        .displayName("displayName")
                        .addEntitlement(
                            DraftCreateAddonDraftResponse.Data.Entitlement.builder()
                                .id("id")
                                .type(DraftCreateAddonDraftResponse.Data.Entitlement.Type.FEATURE)
                                .build()
                        )
                        .isLatest(true)
                        .maxQuantity(0L)
                        .metadata(
                            DraftCreateAddonDraftResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingType(DraftCreateAddonDraftResponse.Data.PricingType.FREE)
                        .productId("productId")
                        .status(DraftCreateAddonDraftResponse.Data.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .build()

        assertThat(draftCreateAddonDraftResponse.data())
            .isEqualTo(
                DraftCreateAddonDraftResponse.Data.builder()
                    .id("id")
                    .billingId("billingId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addDependency("string")
                    .description("description")
                    .displayName("displayName")
                    .addEntitlement(
                        DraftCreateAddonDraftResponse.Data.Entitlement.builder()
                            .id("id")
                            .type(DraftCreateAddonDraftResponse.Data.Entitlement.Type.FEATURE)
                            .build()
                    )
                    .isLatest(true)
                    .maxQuantity(0L)
                    .metadata(
                        DraftCreateAddonDraftResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .pricingType(DraftCreateAddonDraftResponse.Data.PricingType.FREE)
                    .productId("productId")
                    .status(DraftCreateAddonDraftResponse.Data.Status.DRAFT)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .versionNumber(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val draftCreateAddonDraftResponse =
            DraftCreateAddonDraftResponse.builder()
                .data(
                    DraftCreateAddonDraftResponse.Data.builder()
                        .id("id")
                        .billingId("billingId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDependency("string")
                        .description("description")
                        .displayName("displayName")
                        .addEntitlement(
                            DraftCreateAddonDraftResponse.Data.Entitlement.builder()
                                .id("id")
                                .type(DraftCreateAddonDraftResponse.Data.Entitlement.Type.FEATURE)
                                .build()
                        )
                        .isLatest(true)
                        .maxQuantity(0L)
                        .metadata(
                            DraftCreateAddonDraftResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingType(DraftCreateAddonDraftResponse.Data.PricingType.FREE)
                        .productId("productId")
                        .status(DraftCreateAddonDraftResponse.Data.Status.DRAFT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .versionNumber(0L)
                        .build()
                )
                .build()

        val roundtrippedDraftCreateAddonDraftResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(draftCreateAddonDraftResponse),
                jacksonTypeRef<DraftCreateAddonDraftResponse>(),
            )

        assertThat(roundtrippedDraftCreateAddonDraftResponse)
            .isEqualTo(draftCreateAddonDraftResponse)
    }
}
