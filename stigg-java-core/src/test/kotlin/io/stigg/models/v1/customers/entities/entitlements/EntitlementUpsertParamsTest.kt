// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.entities.entitlements

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementUpsertParamsTest {

    @Test
    fun create() {
        EntitlementUpsertParams.builder()
            .id("id")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .addEntityEntitlement(
                EntitlementUpsertParams.EntityEntitlement.builder()
                    .entityId("workspace-001")
                    .cadence("P1M")
                    .currencyId("currencyId")
                    .featureId("compute-minutes")
                    .parentId("parentId")
                    .addScopeEntityId("NxI")
                    .usageLimit(1000.0)
                    .build()
            )
            .addEntityEntitlement(
                EntitlementUpsertParams.EntityEntitlement.builder()
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
    }

    @Test
    fun pathParams() {
        val params =
            EntitlementUpsertParams.builder()
                .id("id")
                .addEntityEntitlement(
                    EntitlementUpsertParams.EntityEntitlement.builder()
                        .entityId("workspace-001")
                        .build()
                )
                .addEntityEntitlement(
                    EntitlementUpsertParams.EntityEntitlement.builder()
                        .entityId("workspace-002")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            EntitlementUpsertParams.builder()
                .id("id")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addEntityEntitlement(
                    EntitlementUpsertParams.EntityEntitlement.builder()
                        .entityId("workspace-001")
                        .cadence("P1M")
                        .currencyId("currencyId")
                        .featureId("compute-minutes")
                        .parentId("parentId")
                        .addScopeEntityId("NxI")
                        .usageLimit(1000.0)
                        .build()
                )
                .addEntityEntitlement(
                    EntitlementUpsertParams.EntityEntitlement.builder()
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
            EntitlementUpsertParams.builder()
                .id("id")
                .addEntityEntitlement(
                    EntitlementUpsertParams.EntityEntitlement.builder()
                        .entityId("workspace-001")
                        .build()
                )
                .addEntityEntitlement(
                    EntitlementUpsertParams.EntityEntitlement.builder()
                        .entityId("workspace-002")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            EntitlementUpsertParams.builder()
                .id("id")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addEntityEntitlement(
                    EntitlementUpsertParams.EntityEntitlement.builder()
                        .entityId("workspace-001")
                        .cadence("P1M")
                        .currencyId("currencyId")
                        .featureId("compute-minutes")
                        .parentId("parentId")
                        .addScopeEntityId("NxI")
                        .usageLimit(1000.0)
                        .build()
                )
                .addEntityEntitlement(
                    EntitlementUpsertParams.EntityEntitlement.builder()
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

        val body = params._body()

        assertThat(body.entityEntitlements())
            .containsExactly(
                EntitlementUpsertParams.EntityEntitlement.builder()
                    .entityId("workspace-001")
                    .cadence("P1M")
                    .currencyId("currencyId")
                    .featureId("compute-minutes")
                    .parentId("parentId")
                    .addScopeEntityId("NxI")
                    .usageLimit(1000.0)
                    .build(),
                EntitlementUpsertParams.EntityEntitlement.builder()
                    .entityId("workspace-002")
                    .cadence("P1M")
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
            EntitlementUpsertParams.builder()
                .id("id")
                .addEntityEntitlement(
                    EntitlementUpsertParams.EntityEntitlement.builder()
                        .entityId("workspace-001")
                        .build()
                )
                .addEntityEntitlement(
                    EntitlementUpsertParams.EntityEntitlement.builder()
                        .entityId("workspace-002")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.entityEntitlements())
            .containsExactly(
                EntitlementUpsertParams.EntityEntitlement.builder()
                    .entityId("workspace-001")
                    .build(),
                EntitlementUpsertParams.EntityEntitlement.builder()
                    .entityId("workspace-002")
                    .build(),
            )
    }
}
