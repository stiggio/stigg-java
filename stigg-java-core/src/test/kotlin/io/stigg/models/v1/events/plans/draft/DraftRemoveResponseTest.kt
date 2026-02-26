// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.plans.draft

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DraftRemoveResponseTest {

    @Test
    fun create() {
        val draftRemoveResponse =
            DraftRemoveResponse.builder()
                .data(DraftRemoveResponse.Data.builder().id("id").build())
                .build()

        assertThat(draftRemoveResponse.data())
            .isEqualTo(DraftRemoveResponse.Data.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val draftRemoveResponse =
            DraftRemoveResponse.builder()
                .data(DraftRemoveResponse.Data.builder().id("id").build())
                .build()

        val roundtrippedDraftRemoveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(draftRemoveResponse),
                jacksonTypeRef<DraftRemoveResponse>(),
            )

        assertThat(roundtrippedDraftRemoveResponse).isEqualTo(draftRemoveResponse)
    }
}
