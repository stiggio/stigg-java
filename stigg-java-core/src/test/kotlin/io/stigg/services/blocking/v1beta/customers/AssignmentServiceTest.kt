// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1beta.customers

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1beta.customers.assignments.AssignmentUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssignmentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val assignmentService = client.v1Beta().customers().assignments()

        val page = assignmentService.list("id")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val assignmentService = client.v1Beta().customers().assignments()

        val response =
            assignmentService.upsert(
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
            )

        response.validate()
    }
}
