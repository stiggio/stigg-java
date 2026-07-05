// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1beta.customers

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1beta.customers.entities.EntityArchiveParams
import io.stigg.models.v1beta.customers.entities.EntityRetrieveParams
import io.stigg.models.v1beta.customers.entities.EntityUnarchiveParams
import io.stigg.models.v1beta.customers.entities.EntityUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntityServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entityService = client.v1Beta().customers().entities()

        val entity =
            entityService.retrieve(
                EntityRetrieveParams.builder()
                    .id("id")
                    .entityId("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        entity.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entityService = client.v1Beta().customers().entities()

        val page = entityService.list("id")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entityService = client.v1Beta().customers().entities()

        val response =
            entityService.archive(
                EntityArchiveParams.builder()
                    .id("id")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .addId("user-7f3a0c1d")
                    .addId("user-c4d1b2e9")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unarchive() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entityService = client.v1Beta().customers().entities()

        val response =
            entityService.unarchive(
                EntityUnarchiveParams.builder()
                    .id("id")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .addId("user-7f3a0c1d")
                    .addId("user-c4d1b2e9")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val entityService = client.v1Beta().customers().entities()

        val response =
            entityService.upsert(
                EntityUpsertParams.builder()
                    .id("id")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .addEntity(
                        EntityUpsertParams.Entity.builder()
                            .id("user-7f3a0c1d")
                            .entityTypeId("user")
                            .metadata(
                                EntityUpsertParams.Entity.Metadata.builder()
                                    .putAdditionalProperty("email", JsonValue.from("jane@acme.com"))
                                    .putAdditionalProperty("role", JsonValue.from("admin"))
                                    .build()
                            )
                            .build()
                    )
                    .addEntity(
                        EntityUpsertParams.Entity.builder()
                            .id("user-c4d1b2e9")
                            .entityTypeId("user")
                            .metadata(
                                EntityUpsertParams.Entity.Metadata.builder()
                                    .putAdditionalProperty("email", JsonValue.from("john@acme.com"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
