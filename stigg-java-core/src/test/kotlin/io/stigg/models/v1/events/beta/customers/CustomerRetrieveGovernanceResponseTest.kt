// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.beta.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerRetrieveGovernanceResponseTest {

    @Test
    fun create() {
        val customerRetrieveGovernanceResponse =
            CustomerRetrieveGovernanceResponse.builder()
                .addData(
                    CustomerRetrieveGovernanceResponse.Data.builder()
                        .cadence("cadence")
                        .currentUsage(0.0)
                        .entityId("entityId")
                        .entityType("entityType")
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
                    CustomerRetrieveGovernanceResponse.Pagination.builder().next("next").build()
                )
                .build()

        assertThat(customerRetrieveGovernanceResponse.data())
            .containsExactly(
                CustomerRetrieveGovernanceResponse.Data.builder()
                    .cadence("cadence")
                    .currentUsage(0.0)
                    .entityId("entityId")
                    .entityType("entityType")
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
        assertThat(customerRetrieveGovernanceResponse.pagination())
            .isEqualTo(CustomerRetrieveGovernanceResponse.Pagination.builder().next("next").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerRetrieveGovernanceResponse =
            CustomerRetrieveGovernanceResponse.builder()
                .addData(
                    CustomerRetrieveGovernanceResponse.Data.builder()
                        .cadence("cadence")
                        .currentUsage(0.0)
                        .entityId("entityId")
                        .entityType("entityType")
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
                    CustomerRetrieveGovernanceResponse.Pagination.builder().next("next").build()
                )
                .build()

        val roundtrippedCustomerRetrieveGovernanceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerRetrieveGovernanceResponse),
                jacksonTypeRef<CustomerRetrieveGovernanceResponse>(),
            )

        assertThat(roundtrippedCustomerRetrieveGovernanceResponse)
            .isEqualTo(customerRetrieveGovernanceResponse)
    }
}
