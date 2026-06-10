// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.assignments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssignmentListPageResponseTest {

    @Test
    fun create() {
        val assignmentListPageResponse =
            AssignmentListPageResponse.builder()
                .addData(
                    AssignmentListResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .cadence(AssignmentListResponse.Cadence.MONTH)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entityId("entityId")
                        .parentId("parentId")
                        .addScopeEntityId("NxI")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .currencyId("currencyId")
                        .featureId("featureId")
                        .build()
                )
                .pagination(
                    AssignmentListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(assignmentListPageResponse.data())
            .containsExactly(
                AssignmentListResponse.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cadence(AssignmentListResponse.Cadence.MONTH)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .entityId("entityId")
                    .parentId("parentId")
                    .addScopeEntityId("NxI")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .usageLimit(0.0)
                    .currencyId("currencyId")
                    .featureId("featureId")
                    .build()
            )
        assertThat(assignmentListPageResponse.pagination())
            .isEqualTo(
                AssignmentListPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assignmentListPageResponse =
            AssignmentListPageResponse.builder()
                .addData(
                    AssignmentListResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .cadence(AssignmentListResponse.Cadence.MONTH)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entityId("entityId")
                        .parentId("parentId")
                        .addScopeEntityId("NxI")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .usageLimit(0.0)
                        .currencyId("currencyId")
                        .featureId("featureId")
                        .build()
                )
                .pagination(
                    AssignmentListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedAssignmentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assignmentListPageResponse),
                jacksonTypeRef<AssignmentListPageResponse>(),
            )

        assertThat(roundtrippedAssignmentListPageResponse).isEqualTo(assignmentListPageResponse)
    }
}
