// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.beta.entitytypes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityTypeUpsertParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
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
