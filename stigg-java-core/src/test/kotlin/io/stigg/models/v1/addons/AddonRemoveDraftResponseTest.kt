// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonRemoveDraftResponseTest {

    @Test
    fun create() {
        val addonRemoveDraftResponse =
            AddonRemoveDraftResponse.builder()
                .data(AddonRemoveDraftResponse.Data.builder().id("id").build())
                .build()

        assertThat(addonRemoveDraftResponse.data())
            .isEqualTo(AddonRemoveDraftResponse.Data.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonRemoveDraftResponse =
            AddonRemoveDraftResponse.builder()
                .data(AddonRemoveDraftResponse.Data.builder().id("id").build())
                .build()

        val roundtrippedAddonRemoveDraftResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonRemoveDraftResponse),
                jacksonTypeRef<AddonRemoveDraftResponse>(),
            )

        assertThat(roundtrippedAddonRemoveDraftResponse).isEqualTo(addonRemoveDraftResponse)
    }
}
