// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons.draft

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DraftRemoveAddonDraftResponseTest {

    @Test
    fun create() {
        val draftRemoveAddonDraftResponse =
            DraftRemoveAddonDraftResponse.builder()
                .data(DraftRemoveAddonDraftResponse.Data.builder().id("id").build())
                .build()

        assertThat(draftRemoveAddonDraftResponse.data())
            .isEqualTo(DraftRemoveAddonDraftResponse.Data.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val draftRemoveAddonDraftResponse =
            DraftRemoveAddonDraftResponse.builder()
                .data(DraftRemoveAddonDraftResponse.Data.builder().id("id").build())
                .build()

        val roundtrippedDraftRemoveAddonDraftResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(draftRemoveAddonDraftResponse),
                jacksonTypeRef<DraftRemoveAddonDraftResponse>(),
            )

        assertThat(roundtrippedDraftRemoveAddonDraftResponse)
            .isEqualTo(draftRemoveAddonDraftResponse)
    }
}
