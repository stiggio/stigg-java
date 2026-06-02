// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.beta.entitytypes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityTypeUpsertResponseTest {

    @Test
    fun create() {
        val entityTypeUpsertResponse =
            EntityTypeUpsertResponse.builder()
                .addData(
                    EntityTypeUpsertResponse.Data.builder()
                        .id("id")
                        .addAttributionKey("NxI")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("x")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(entityTypeUpsertResponse.data())
            .containsExactly(
                EntityTypeUpsertResponse.Data.builder()
                    .id("id")
                    .addAttributionKey("NxI")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("x")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entityTypeUpsertResponse =
            EntityTypeUpsertResponse.builder()
                .addData(
                    EntityTypeUpsertResponse.Data.builder()
                        .id("id")
                        .addAttributionKey("NxI")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("x")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedEntityTypeUpsertResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entityTypeUpsertResponse),
                jacksonTypeRef<EntityTypeUpsertResponse>(),
            )

        assertThat(roundtrippedEntityTypeUpsertResponse).isEqualTo(entityTypeUpsertResponse)
    }
}
