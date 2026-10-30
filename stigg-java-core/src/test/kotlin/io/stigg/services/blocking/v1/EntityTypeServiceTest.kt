// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1.entitytypes.EntityTypeArchiveParams
import io.stigg.models.v1.entitytypes.EntityTypeCheckActiveEntitiesParams
import io.stigg.models.v1.entitytypes.EntityTypeUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntityTypeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entityTypeService = client.v1().entityTypes()

        val page = entityTypeService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entityTypeService = client.v1().entityTypes()

        val response =
            entityTypeService.archive(
                EntityTypeArchiveParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .addId("team")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun checkActiveEntities() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entityTypeService = client.v1().entityTypes()

        val response =
            entityTypeService.checkActiveEntities(
                EntityTypeCheckActiveEntitiesParams.builder()
                    .id("id")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entityTypeService = client.v1().entityTypes()

        val response =
            entityTypeService.upsert(
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

        response.validate()
    }
}
