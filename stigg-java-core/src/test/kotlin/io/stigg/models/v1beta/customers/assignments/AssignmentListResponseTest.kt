// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.assignments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssignmentListResponseTest {

    @Test
    fun create() {
        val assignmentListResponse =
            AssignmentListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cadence(AssignmentListResponse.Cadence.MONTH)
                .capabilityId("capabilityId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .entityId("entityId")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .usageLimit(0.0)
                .build()

        assertThat(assignmentListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(assignmentListResponse.cadence()).isEqualTo(AssignmentListResponse.Cadence.MONTH)
        assertThat(assignmentListResponse.capabilityId()).isEqualTo("capabilityId")
        assertThat(assignmentListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(assignmentListResponse.entityId()).isEqualTo("entityId")
        assertThat(assignmentListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(assignmentListResponse.usageLimit()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assignmentListResponse =
            AssignmentListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cadence(AssignmentListResponse.Cadence.MONTH)
                .capabilityId("capabilityId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .entityId("entityId")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .usageLimit(0.0)
                .build()

        val roundtrippedAssignmentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assignmentListResponse),
                jacksonTypeRef<AssignmentListResponse>(),
            )

        assertThat(roundtrippedAssignmentListResponse).isEqualTo(assignmentListResponse)
    }
}
