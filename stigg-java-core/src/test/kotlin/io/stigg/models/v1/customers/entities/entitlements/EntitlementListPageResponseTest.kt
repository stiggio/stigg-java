// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.entities.entitlements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementListPageResponseTest {

    @Test
    fun create() {
        val entitlementListPageResponse =
            EntitlementListPageResponse.builder()
                .addData(
                    EntitlementListResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .cadence("PT869S")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entityId("entityId")
                        .parentId("parentId")
                        .addScopeEntityId("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .currencyId("currencyId")
                        .featureId("featureId")
                        .build()
                )
                .pagination(
                    EntitlementListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(entitlementListPageResponse.data())
            .containsExactly(
                EntitlementListResponse.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cadence("PT869S")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .entityId("entityId")
                    .parentId("parentId")
                    .addScopeEntityId("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .usageLimit(0.0)
                    .currencyId("currencyId")
                    .featureId("featureId")
                    .build()
            )
        assertThat(entitlementListPageResponse.pagination())
            .isEqualTo(
                EntitlementListPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementListPageResponse =
            EntitlementListPageResponse.builder()
                .addData(
                    EntitlementListResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .cadence("PT869S")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entityId("entityId")
                        .parentId("parentId")
                        .addScopeEntityId("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .currencyId("currencyId")
                        .featureId("featureId")
                        .build()
                )
                .pagination(
                    EntitlementListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedEntitlementListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementListPageResponse),
                jacksonTypeRef<EntitlementListPageResponse>(),
            )

        assertThat(roundtrippedEntitlementListPageResponse).isEqualTo(entitlementListPageResponse)
    }
}
