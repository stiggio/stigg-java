// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.beta.customers.entities

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityArchiveResponseTest {

    @Test
    fun create() {
        val entityArchiveResponse =
            EntityArchiveResponse.builder()
                .data(EntityArchiveResponse.Data.builder().addId("string").build())
                .build()

        assertThat(entityArchiveResponse.data())
            .isEqualTo(EntityArchiveResponse.Data.builder().addId("string").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entityArchiveResponse =
            EntityArchiveResponse.builder()
                .data(EntityArchiveResponse.Data.builder().addId("string").build())
                .build()

        val roundtrippedEntityArchiveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entityArchiveResponse),
                jacksonTypeRef<EntityArchiveResponse>(),
            )

        assertThat(roundtrippedEntityArchiveResponse).isEqualTo(entityArchiveResponse)
    }
}
