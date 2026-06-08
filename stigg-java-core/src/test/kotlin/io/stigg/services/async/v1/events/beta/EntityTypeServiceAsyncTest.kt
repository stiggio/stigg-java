// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.beta

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.events.beta.entitytypes.EntityTypeUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntityTypeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entityTypeServiceAsync = client.v1().events().beta().entityTypes()

        val pageFuture = entityTypeServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entityTypeServiceAsync = client.v1().events().beta().entityTypes()

        val responseFuture =
            entityTypeServiceAsync.upsert(
                EntityTypeUpsertParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .addType(
                        EntityTypeUpsertParams.Type.builder()
                            .id("org")
                            .addAttributionKey("organizationId")
                            .displayName("Organization")
                            .build()
                    )
                    .addType(
                        EntityTypeUpsertParams.Type.builder()
                            .id("team")
                            .addAttributionKey("teamId")
                            .displayName("Team")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
