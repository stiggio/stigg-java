// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonPublishResponseTest {

    @Test
    fun create() {
        val addonPublishResponse =
            AddonPublishResponse.builder()
                .data(
                    AddonPublishResponse.Data.builder()
                        .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(addonPublishResponse.data())
            .isEqualTo(
                AddonPublishResponse.Data.builder()
                    .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonPublishResponse =
            AddonPublishResponse.builder()
                .data(
                    AddonPublishResponse.Data.builder()
                        .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedAddonPublishResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonPublishResponse),
                jacksonTypeRef<AddonPublishResponse>(),
            )

        assertThat(roundtrippedAddonPublishResponse).isEqualTo(addonPublishResponse)
    }
}
