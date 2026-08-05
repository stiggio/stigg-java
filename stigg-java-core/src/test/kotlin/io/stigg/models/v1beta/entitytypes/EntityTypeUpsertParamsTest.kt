// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.entitytypes

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityTypeUpsertParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun headers() {
        val params =
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
            EntityTypeUpsertParams.builder()
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

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.types())
            .containsExactly(
                EntityTypeUpsertParams.Type.builder()
                    .id("org")
                    .addAttributionKey("organizationId")
                    .displayName("Organization")
                    .description(
                        "A customer organization — the top of the hierarchy, holding the account-wide budget."
                    )
                    .build(),
                EntityTypeUpsertParams.Type.builder()
                    .id("team")
                    .addAttributionKey("teamId")
                    .displayName("Team")
                    .description("description")
                    .build(),
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EntityTypeUpsertParams.builder()
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

        val body = params._body()

        assertThat(body.types())
            .containsExactly(
                EntityTypeUpsertParams.Type.builder()
                    .id("org")
                    .addAttributionKey("organizationId")
                    .displayName("Organization")
                    .build(),
                EntityTypeUpsertParams.Type.builder()
                    .id("team")
                    .addAttributionKey("teamId")
                    .displayName("Team")
                    .build(),
            )
    }
}
