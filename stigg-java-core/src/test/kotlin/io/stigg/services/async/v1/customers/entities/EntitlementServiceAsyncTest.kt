// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers.entities

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.customers.entities.entitlements.EntitlementUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntitlementServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementServiceAsync = client.v1().customers().entities().entitlements()

        val pageFuture = entitlementServiceAsync.list("id")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entitlementServiceAsync = client.v1().customers().entities().entitlements()

        val responseFuture =
            entitlementServiceAsync.upsert(
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}
