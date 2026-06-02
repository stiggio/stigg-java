// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1beta.customers

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1beta.customers.entities.EntityArchiveParams
import io.stigg.models.v1beta.customers.entities.EntityRetrieveParams
import io.stigg.models.v1beta.customers.entities.EntityUnarchiveParams
import io.stigg.models.v1beta.customers.entities.EntityUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EntityServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entityServiceAsync = client.v1Beta().customers().entities()

        val entityFuture =
            entityServiceAsync.retrieve(
                EntityRetrieveParams.builder().id("id").entityId("x").build()
            )

        val entity = entityFuture.get()
        entity.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entityServiceAsync = client.v1Beta().customers().entities()

        val pageFuture = entityServiceAsync.list("id")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entityServiceAsync = client.v1Beta().customers().entities()

        val responseFuture =
            entityServiceAsync.archive(
                EntityArchiveParams.builder()
                    .id("id")
                    .addId("user-7f3a0c1d")
                    .addId("user-c4d1b2e9")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unarchive() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entityServiceAsync = client.v1Beta().customers().entities()

        val responseFuture =
            entityServiceAsync.unarchive(
                EntityUnarchiveParams.builder()
                    .id("id")
                    .addId("user-7f3a0c1d")
                    .addId("user-c4d1b2e9")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val entityServiceAsync = client.v1Beta().customers().entities()

        val responseFuture =
            entityServiceAsync.upsert(
                EntityUpsertParams.builder()
                    .id("id")
                    .addEntity(
                        EntityUpsertParams.Entity.builder()
                            .id("user-7f3a0c1d")
                            .metadata(
                                EntityUpsertParams.Entity.Metadata.builder()
                                    .putAdditionalProperty("email", JsonValue.from("jane@acme.com"))
                                    .putAdditionalProperty("role", JsonValue.from("admin"))
                                    .build()
                            )
                            .typeRefId("user")
                            .build()
                    )
                    .addEntity(
                        EntityUpsertParams.Entity.builder()
                            .id("user-c4d1b2e9")
                            .metadata(
                                EntityUpsertParams.Entity.Metadata.builder()
                                    .putAdditionalProperty("email", JsonValue.from("john@acme.com"))
                                    .build()
                            )
                            .typeRefId("user")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
