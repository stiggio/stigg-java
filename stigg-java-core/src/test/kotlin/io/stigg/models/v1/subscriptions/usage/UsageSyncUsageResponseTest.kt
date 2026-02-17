// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageSyncUsageResponseTest {

    @Test
    fun create() {
        val usageSyncUsageResponse =
            UsageSyncUsageResponse.builder()
                .data(UsageSyncUsageResponse.Data.builder().triggered(true).build())
                .build()

        assertThat(usageSyncUsageResponse.data())
            .isEqualTo(UsageSyncUsageResponse.Data.builder().triggered(true).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageSyncUsageResponse =
            UsageSyncUsageResponse.builder()
                .data(UsageSyncUsageResponse.Data.builder().triggered(true).build())
                .build()

        val roundtrippedUsageSyncUsageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageSyncUsageResponse),
                jacksonTypeRef<UsageSyncUsageResponse>(),
            )

        assertThat(roundtrippedUsageSyncUsageResponse).isEqualTo(usageSyncUsageResponse)
    }
}
