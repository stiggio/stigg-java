// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.governance

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GovernanceListResponseTest {

    @Test
    fun create() {
        val governanceListResponse =
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

        assertThat(governanceListResponse.cadence()).contains("cadence")
        assertThat(governanceListResponse.currentUsage()).contains(0.0)
        assertThat(governanceListResponse.displayName()).contains("displayName")
        assertThat(governanceListResponse.entityId()).isEqualTo("entityId")
        assertThat(governanceListResponse.entityTypeId()).isEqualTo("entityTypeId")
        assertThat(governanceListResponse.parentId()).contains("parentId")
        assertThat(governanceListResponse.scopeEntityIds()).containsExactly("string")
        assertThat(governanceListResponse.usageLimit()).contains(0.0)
        assertThat(governanceListResponse.usagePeriodEnd())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(governanceListResponse.usagePeriodStart())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(governanceListResponse.utilization()).contains(0.0)
        assertThat(governanceListResponse.currencyId()).contains("currencyId")
        assertThat(governanceListResponse.featureId()).contains("featureId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val governanceListResponse =
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

        val roundtrippedGovernanceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(governanceListResponse),
                jacksonTypeRef<GovernanceListResponse>(),
            )

        assertThat(roundtrippedGovernanceListResponse).isEqualTo(governanceListResponse)
    }
}
