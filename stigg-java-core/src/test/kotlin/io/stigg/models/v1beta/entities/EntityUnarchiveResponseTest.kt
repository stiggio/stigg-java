// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.entities

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityUnarchiveResponseTest {

    @Test
    fun create() {
        val entityUnarchiveResponse =
            EntityUnarchiveResponse.builder()
                .data(EntityUnarchiveResponse.Data.builder().addId("string").build())
                .build()

        assertThat(entityUnarchiveResponse.data())
            .isEqualTo(EntityUnarchiveResponse.Data.builder().addId("string").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entityUnarchiveResponse =
            EntityUnarchiveResponse.builder()
                .data(EntityUnarchiveResponse.Data.builder().addId("string").build())
                .build()

        val roundtrippedEntityUnarchiveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entityUnarchiveResponse),
                jacksonTypeRef<EntityUnarchiveResponse>(),
            )

        assertThat(roundtrippedEntityUnarchiveResponse).isEqualTo(entityUnarchiveResponse)
    }
}
