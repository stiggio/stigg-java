// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.governance

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GovernanceListPageResponseTest {

    @Test
    fun create() {
        val governanceListPageResponse =
            GovernanceListPageResponse.builder()
                .addData(
                    GovernanceListResponse.builder()
                        .cadence("cadence")
                        .currentUsage(0.0)
                        .displayName("displayName")
                        .entityId("entityId")
                        .entityTypeId("entityTypeId")
                        .parentId("parentId")
                        .addScopeEntityId("string")
                        .usageLimit(0.0)
                        .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .utilization(0.0)
                        .currencyId("currencyId")
                        .featureId("featureId")
                        .build()
                )
                .pagination(
                    GovernanceListPageResponse.Pagination.builder()
                        .next("next")
                        .prev("prev")
                        .build()
                )
                .build()

        assertThat(governanceListPageResponse.data())
            .containsExactly(
                GovernanceListResponse.builder()
                    .cadence("cadence")
                    .currentUsage(0.0)
                    .displayName("displayName")
                    .entityId("entityId")
                    .entityTypeId("entityTypeId")
                    .parentId("parentId")
                    .addScopeEntityId("string")
                    .usageLimit(0.0)
                    .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .utilization(0.0)
                    .currencyId("currencyId")
                    .featureId("featureId")
                    .build()
            )
        assertThat(governanceListPageResponse.pagination())
            .isEqualTo(
                GovernanceListPageResponse.Pagination.builder().next("next").prev("prev").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val governanceListPageResponse =
            GovernanceListPageResponse.builder()
                .addData(
                    GovernanceListResponse.builder()
                        .cadence("cadence")
                        .currentUsage(0.0)
                        .displayName("displayName")
                        .entityId("entityId")
                        .entityTypeId("entityTypeId")
                        .parentId("parentId")
                        .addScopeEntityId("string")
                        .usageLimit(0.0)
                        .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usagePeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .utilization(0.0)
                        .currencyId("currencyId")
                        .featureId("featureId")
                        .build()
                )
                .pagination(
                    GovernanceListPageResponse.Pagination.builder()
                        .next("next")
                        .prev("prev")
                        .build()
                )
                .build()

        val roundtrippedGovernanceListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(governanceListPageResponse),
                jacksonTypeRef<GovernanceListPageResponse>(),
            )

        assertThat(roundtrippedGovernanceListPageResponse).isEqualTo(governanceListPageResponse)
    }
}
