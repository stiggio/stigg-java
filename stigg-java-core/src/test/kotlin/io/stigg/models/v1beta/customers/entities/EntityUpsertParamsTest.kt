// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.entities

import io.stigg.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityUpsertParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            EntityUpsertParams.builder()
                .id("id")
                .addEntity(EntityUpsertParams.Entity.builder().id("user-7f3a0c1d").build())
                .addEntity(EntityUpsertParams.Entity.builder().id("user-c4d1b2e9").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.entities())
            .containsExactly(
                EntityUpsertParams.Entity.builder()
                    .id("user-7f3a0c1d")
                    .metadata(
                        EntityUpsertParams.Entity.Metadata.builder()
                            .putAdditionalProperty("email", JsonValue.from("jane@acme.com"))
                            .putAdditionalProperty("role", JsonValue.from("admin"))
                            .build()
                    )
                    .typeRefId("user")
                    .build(),
                EntityUpsertParams.Entity.builder()
                    .id("user-c4d1b2e9")
                    .metadata(
                        EntityUpsertParams.Entity.Metadata.builder()
                            .putAdditionalProperty("email", JsonValue.from("john@acme.com"))
                            .build()
                    )
                    .typeRefId("user")
                    .build(),
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EntityUpsertParams.builder()
                .id("id")
                .addEntity(EntityUpsertParams.Entity.builder().id("user-7f3a0c1d").build())
                .addEntity(EntityUpsertParams.Entity.builder().id("user-c4d1b2e9").build())
                .build()

        val body = params._body()

        assertThat(body.entities())
            .containsExactly(
                EntityUpsertParams.Entity.builder().id("user-7f3a0c1d").build(),
                EntityUpsertParams.Entity.builder().id("user-c4d1b2e9").build(),
            )
    }
}
