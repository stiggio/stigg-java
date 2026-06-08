// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.beta

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1.events.beta.entitytypes.EntityTypeUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntityTypeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entityTypeService = client.v1().events().beta().entityTypes()

        val page = entityTypeService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entityTypeService = client.v1().events().beta().entityTypes()

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

        response.validate()
    }
}
