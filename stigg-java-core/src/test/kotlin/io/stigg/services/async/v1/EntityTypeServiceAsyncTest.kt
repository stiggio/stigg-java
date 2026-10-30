// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.entitytypes.EntityTypeArchiveParams
import io.stigg.models.v1.entitytypes.EntityTypeCheckActiveEntitiesParams
import io.stigg.models.v1.entitytypes.EntityTypeUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntityTypeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entityTypeServiceAsync = client.v1().entityTypes()

        val pageFuture = entityTypeServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entityTypeServiceAsync = client.v1().entityTypes()

        val responseFuture =
            entityTypeServiceAsync.archive(
                EntityTypeArchiveParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .addId("team")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun checkActiveEntities() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entityTypeServiceAsync = client.v1().entityTypes()

        val responseFuture =
            entityTypeServiceAsync.checkActiveEntities(
                EntityTypeCheckActiveEntitiesParams.builder()
                    .id("id")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entityTypeServiceAsync = client.v1().entityTypes()

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
                            .description(
                                "A customer organization — the top of the hierarchy, holding the account-wide budget."
                            )
                            .build()
                    )
                    .addType(
                        EntityTypeUpsertParams.Type.builder()
                            .id("team")
                            .addAttributionKey("teamId")
                            .displayName("Team")
                            .description("description")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
