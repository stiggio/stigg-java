// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.entities

import io.stigg.core.JsonValue
import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityUpsertParamsTest {

    @Test
    fun create() {
        EntityUpsertParams.builder()
            .id("id")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .addEntity(
                EntityUpsertParams.Entity.builder()
                    .id("user-7f3a0c1d")
                    .displayName("Jane Doe")
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
                    .displayName("John Roe")
                    .entityTypeId("user")
                    .metadata(
                        EntityUpsertParams.Entity.Metadata.builder()
                            .putAdditionalProperty("email", JsonValue.from("john@acme.com"))
                            .build()
                    )
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
    fun headers() {
        val params =
            EntityUpsertParams.builder()
                .id("id")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addEntity(
                    EntityUpsertParams.Entity.builder()
                        .id("user-7f3a0c1d")
                        .displayName("Jane Doe")
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
                        .displayName("John Roe")
                        .entityTypeId("user")
                        .metadata(
                            EntityUpsertParams.Entity.Metadata.builder()
                                .putAdditionalProperty("email", JsonValue.from("john@acme.com"))
                                .build()
                        )
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
            EntityUpsertParams.builder()
                .id("id")
                .addEntity(EntityUpsertParams.Entity.builder().id("user-7f3a0c1d").build())
                .addEntity(EntityUpsertParams.Entity.builder().id("user-c4d1b2e9").build())
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            EntityUpsertParams.builder()
                .id("id")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addEntity(
                    EntityUpsertParams.Entity.builder()
                        .id("user-7f3a0c1d")
                        .displayName("Jane Doe")
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
                        .displayName("John Roe")
                        .entityTypeId("user")
                        .metadata(
                            EntityUpsertParams.Entity.Metadata.builder()
                                .putAdditionalProperty("email", JsonValue.from("john@acme.com"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.entities())
            .containsExactly(
                EntityUpsertParams.Entity.builder()
                    .id("user-7f3a0c1d")
                    .displayName("Jane Doe")
                    .entityTypeId("user")
                    .metadata(
                        EntityUpsertParams.Entity.Metadata.builder()
                            .putAdditionalProperty("email", JsonValue.from("jane@acme.com"))
                            .putAdditionalProperty("role", JsonValue.from("admin"))
                            .build()
                    )
                    .build(),
                EntityUpsertParams.Entity.builder()
                    .id("user-c4d1b2e9")
                    .displayName("John Roe")
                    .entityTypeId("user")
                    .metadata(
                        EntityUpsertParams.Entity.Metadata.builder()
                            .putAdditionalProperty("email", JsonValue.from("john@acme.com"))
                            .build()
                    )
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
