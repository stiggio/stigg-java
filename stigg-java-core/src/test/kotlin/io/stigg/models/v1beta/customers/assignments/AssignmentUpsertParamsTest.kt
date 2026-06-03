// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.assignments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssignmentUpsertParamsTest {

    @Test
    fun create() {
        AssignmentUpsertParams.builder()
            .id("id")
            .addAssignment(
                AssignmentUpsertParams.Assignment.builder()
                    .capabilityId("compute-minutes")
                    .entityId("workspace-001")
                    .cadence(AssignmentUpsertParams.Assignment.Cadence.MONTH)
                    .usageLimit(1000.0)
                    .build()
            )
            .addAssignment(
                AssignmentUpsertParams.Assignment.builder()
                    .capabilityId("compute-minutes")
                    .entityId("workspace-002")
                    .cadence(AssignmentUpsertParams.Assignment.Cadence.MONTH)
                    .usageLimit(2000.0)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AssignmentUpsertParams.builder()
                .id("id")
                .addAssignment(
                    AssignmentUpsertParams.Assignment.builder()
                        .capabilityId("compute-minutes")
                        .entityId("workspace-001")
                        .build()
                )
                .addAssignment(
                    AssignmentUpsertParams.Assignment.builder()
                        .capabilityId("compute-minutes")
                        .entityId("workspace-002")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AssignmentUpsertParams.builder()
                .id("id")
                .addAssignment(
                    AssignmentUpsertParams.Assignment.builder()
                        .capabilityId("compute-minutes")
                        .entityId("workspace-001")
                        .cadence(AssignmentUpsertParams.Assignment.Cadence.MONTH)
                        .usageLimit(1000.0)
                        .build()
                )
                .addAssignment(
                    AssignmentUpsertParams.Assignment.builder()
                        .capabilityId("compute-minutes")
                        .entityId("workspace-002")
                        .cadence(AssignmentUpsertParams.Assignment.Cadence.MONTH)
                        .usageLimit(2000.0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.assignments())
            .containsExactly(
                AssignmentUpsertParams.Assignment.builder()
                    .capabilityId("compute-minutes")
                    .entityId("workspace-001")
                    .cadence(AssignmentUpsertParams.Assignment.Cadence.MONTH)
                    .usageLimit(1000.0)
                    .build(),
                AssignmentUpsertParams.Assignment.builder()
                    .capabilityId("compute-minutes")
                    .entityId("workspace-002")
                    .cadence(AssignmentUpsertParams.Assignment.Cadence.MONTH)
                    .usageLimit(2000.0)
                    .build(),
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AssignmentUpsertParams.builder()
                .id("id")
                .addAssignment(
                    AssignmentUpsertParams.Assignment.builder()
                        .capabilityId("compute-minutes")
                        .entityId("workspace-001")
                        .build()
                )
                .addAssignment(
                    AssignmentUpsertParams.Assignment.builder()
                        .capabilityId("compute-minutes")
                        .entityId("workspace-002")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.assignments())
            .containsExactly(
                AssignmentUpsertParams.Assignment.builder()
                    .capabilityId("compute-minutes")
                    .entityId("workspace-001")
                    .build(),
                AssignmentUpsertParams.Assignment.builder()
                    .capabilityId("compute-minutes")
                    .entityId("workspace-002")
                    .build(),
            )
    }
}
