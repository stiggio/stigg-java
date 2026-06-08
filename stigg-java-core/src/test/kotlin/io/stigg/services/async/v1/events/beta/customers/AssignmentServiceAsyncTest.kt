// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.beta.customers

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.events.beta.customers.assignments.AssignmentUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssignmentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val assignmentServiceAsync = client.v1().events().beta().customers().assignments()

        val pageFuture = assignmentServiceAsync.list("id")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val assignmentServiceAsync = client.v1().events().beta().customers().assignments()

        val responseFuture =
            assignmentServiceAsync.upsert(
                AssignmentUpsertParams.builder()
                    .id("id")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
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

        val response = responseFuture.get()
        response.validate()
    }
}
