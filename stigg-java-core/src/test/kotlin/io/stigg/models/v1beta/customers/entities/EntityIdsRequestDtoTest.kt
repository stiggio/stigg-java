// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.entities

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityIdsRequestDtoTest {

    @Test
    fun create() {
        val entityIdsRequestDto = EntityIdsRequestDto.builder().addId("NxI").build()

        assertThat(entityIdsRequestDto.ids()).containsExactly("NxI")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entityIdsRequestDto = EntityIdsRequestDto.builder().addId("NxI").build()

        val roundtrippedEntityIdsRequestDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entityIdsRequestDto),
                jacksonTypeRef<EntityIdsRequestDto>(),
            )

        assertThat(roundtrippedEntityIdsRequestDto).isEqualTo(entityIdsRequestDto)
    }
}
