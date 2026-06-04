// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.beta.entitytypes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityTypeListResponseTest {

    @Test
    fun create() {
        val entityTypeListResponse =
            EntityTypeListResponse.builder()
                .id("id")
                .addAttributionKey("NxI")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("x")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(entityTypeListResponse.id()).isEqualTo("id")
        assertThat(entityTypeListResponse.attributionKeys()).containsExactly("NxI")
        assertThat(entityTypeListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entityTypeListResponse.displayName()).isEqualTo("x")
        assertThat(entityTypeListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entityTypeListResponse =
            EntityTypeListResponse.builder()
                .id("id")
                .addAttributionKey("NxI")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("x")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedEntityTypeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entityTypeListResponse),
                jacksonTypeRef<EntityTypeListResponse>(),
            )

        assertThat(roundtrippedEntityTypeListResponse).isEqualTo(entityTypeListResponse)
    }
}
