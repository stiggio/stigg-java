// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.entities

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityIdsActionResponseDtoTest {

    @Test
    fun create() {
        val entityIdsActionResponseDto =
            EntityIdsActionResponseDto.builder()
                .data(EntityIdsActionResponseDto.Data.builder().addId("string").build())
                .build()

        assertThat(entityIdsActionResponseDto.data())
            .isEqualTo(EntityIdsActionResponseDto.Data.builder().addId("string").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entityIdsActionResponseDto =
            EntityIdsActionResponseDto.builder()
                .data(EntityIdsActionResponseDto.Data.builder().addId("string").build())
                .build()

        val roundtrippedEntityIdsActionResponseDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entityIdsActionResponseDto),
                jacksonTypeRef<EntityIdsActionResponseDto>(),
            )

        assertThat(roundtrippedEntityIdsActionResponseDto).isEqualTo(entityIdsActionResponseDto)
    }
}
