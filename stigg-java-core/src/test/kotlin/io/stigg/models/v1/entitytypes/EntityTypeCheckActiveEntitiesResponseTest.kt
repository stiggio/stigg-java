// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.entitytypes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityTypeCheckActiveEntitiesResponseTest {

    @Test
    fun create() {
        val entityTypeCheckActiveEntitiesResponse =
            EntityTypeCheckActiveEntitiesResponse.builder()
                .data(
                    EntityTypeCheckActiveEntitiesResponse.Data.builder()
                        .hasActiveEntities(true)
                        .build()
                )
                .build()

        assertThat(entityTypeCheckActiveEntitiesResponse.data())
            .isEqualTo(
                EntityTypeCheckActiveEntitiesResponse.Data.builder().hasActiveEntities(true).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entityTypeCheckActiveEntitiesResponse =
            EntityTypeCheckActiveEntitiesResponse.builder()
                .data(
                    EntityTypeCheckActiveEntitiesResponse.Data.builder()
                        .hasActiveEntities(true)
                        .build()
                )
                .build()

        val roundtrippedEntityTypeCheckActiveEntitiesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entityTypeCheckActiveEntitiesResponse),
                jacksonTypeRef<EntityTypeCheckActiveEntitiesResponse>(),
            )

        assertThat(roundtrippedEntityTypeCheckActiveEntitiesResponse)
            .isEqualTo(entityTypeCheckActiveEntitiesResponse)
    }
}
