// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageSyncResponseTest {

    @Test
    fun create() {
        val usageSyncResponse =
            UsageSyncResponse.builder()
                .data(UsageSyncResponse.Data.builder().triggered(true).build())
                .build()

        assertThat(usageSyncResponse.data())
            .isEqualTo(UsageSyncResponse.Data.builder().triggered(true).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageSyncResponse =
            UsageSyncResponse.builder()
                .data(UsageSyncResponse.Data.builder().triggered(true).build())
                .build()

        val roundtrippedUsageSyncResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageSyncResponse),
                jacksonTypeRef<UsageSyncResponse>(),
            )

        assertThat(roundtrippedUsageSyncResponse).isEqualTo(usageSyncResponse)
    }
}
