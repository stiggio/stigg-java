// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.entitytypes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityTypeArchiveResponseTest {

    @Test
    fun create() {
        val entityTypeArchiveResponse =
            EntityTypeArchiveResponse.builder()
                .data(EntityTypeArchiveResponse.Data.builder().addId("string").build())
                .build()

        assertThat(entityTypeArchiveResponse.data())
            .isEqualTo(EntityTypeArchiveResponse.Data.builder().addId("string").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entityTypeArchiveResponse =
            EntityTypeArchiveResponse.builder()
                .data(EntityTypeArchiveResponse.Data.builder().addId("string").build())
                .build()

        val roundtrippedEntityTypeArchiveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entityTypeArchiveResponse),
                jacksonTypeRef<EntityTypeArchiveResponse>(),
            )

        assertThat(roundtrippedEntityTypeArchiveResponse).isEqualTo(entityTypeArchiveResponse)
    }
}
