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
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .addAssignment(
                        AssignmentUpsertParams.Assignment.builder()
                            .entityId("workspace-001")
                            .cadence("P1M")
                            .currencyId("currencyId")
                            .featureId("compute-minutes")
                            .parentId("parentId")
                            .addScopeEntityId("NxI")
                            .usageLimit(1000.0)
                            .build()
                    )
                    .addAssignment(
                        AssignmentUpsertParams.Assignment.builder()
                            .entityId("workspace-002")
                            .cadence("P1M")
                            .currencyId("cred-type-tokens")
                            .featureId("featureId")
                            .parentId("workspace-001")
                            .addScopeEntityId("user-1")
                            .usageLimit(2000.0)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
