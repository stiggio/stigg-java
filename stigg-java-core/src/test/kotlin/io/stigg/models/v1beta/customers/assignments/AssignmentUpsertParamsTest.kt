// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.assignments

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssignmentUpsertParamsTest {

    @Test
    fun create() {
        AssignmentUpsertParams.builder()
            .id("id")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .addAssignment(
                AssignmentUpsertParams.Assignment.builder()
                    .entityId("workspace-001")
                    .cadence(AssignmentUpsertParams.Assignment.Cadence.MONTH)
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
                    .cadence(AssignmentUpsertParams.Assignment.Cadence.MONTH)
                    .currencyId("cred-type-tokens")
                    .featureId("featureId")
                    .parentId("workspace-001")
                    .addScopeEntityId("user-1")
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
                    AssignmentUpsertParams.Assignment.builder().entityId("workspace-001").build()
                )
                .addAssignment(
                    AssignmentUpsertParams.Assignment.builder().entityId("workspace-002").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            AssignmentUpsertParams.builder()
                .id("id")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addAssignment(
                    AssignmentUpsertParams.Assignment.builder()
                        .entityId("workspace-001")
                        .cadence(AssignmentUpsertParams.Assignment.Cadence.MONTH)
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
                        .cadence(AssignmentUpsertParams.Assignment.Cadence.MONTH)
                        .currencyId("cred-type-tokens")
                        .featureId("featureId")
                        .parentId("workspace-001")
                        .addScopeEntityId("user-1")
                        .usageLimit(2000.0)
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-ACCOUNT-ID", "X-ACCOUNT-ID")
                    .put("X-ENVIRONMENT-ID", "X-ENVIRONMENT-ID")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            AssignmentUpsertParams.builder()
                .id("id")
                .addAssignment(
                    AssignmentUpsertParams.Assignment.builder().entityId("workspace-001").build()
                )
                .addAssignment(
                    AssignmentUpsertParams.Assignment.builder().entityId("workspace-002").build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            AssignmentUpsertParams.builder()
                .id("id")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addAssignment(
                    AssignmentUpsertParams.Assignment.builder()
                        .entityId("workspace-001")
                        .cadence(AssignmentUpsertParams.Assignment.Cadence.MONTH)
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
                        .cadence(AssignmentUpsertParams.Assignment.Cadence.MONTH)
                        .currencyId("cred-type-tokens")
                        .featureId("featureId")
                        .parentId("workspace-001")
                        .addScopeEntityId("user-1")
                        .usageLimit(2000.0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.assignments())
            .containsExactly(
                AssignmentUpsertParams.Assignment.builder()
                    .entityId("workspace-001")
                    .cadence(AssignmentUpsertParams.Assignment.Cadence.MONTH)
                    .currencyId("currencyId")
                    .featureId("compute-minutes")
                    .parentId("parentId")
                    .addScopeEntityId("NxI")
                    .usageLimit(1000.0)
                    .build(),
                AssignmentUpsertParams.Assignment.builder()
                    .entityId("workspace-002")
                    .cadence(AssignmentUpsertParams.Assignment.Cadence.MONTH)
                    .currencyId("cred-type-tokens")
                    .featureId("featureId")
                    .parentId("workspace-001")
                    .addScopeEntityId("user-1")
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
                    AssignmentUpsertParams.Assignment.builder().entityId("workspace-001").build()
                )
                .addAssignment(
                    AssignmentUpsertParams.Assignment.builder().entityId("workspace-002").build()
                )
                .build()

        val body = params._body()

        assertThat(body.assignments())
            .containsExactly(
                AssignmentUpsertParams.Assignment.builder().entityId("workspace-001").build(),
                AssignmentUpsertParams.Assignment.builder().entityId("workspace-002").build(),
            )
    }
}
