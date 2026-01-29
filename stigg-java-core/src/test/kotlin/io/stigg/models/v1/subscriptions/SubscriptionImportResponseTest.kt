// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionImportResponseTest {

    @Test
    fun create() {
        val subscriptionImportResponse =
            SubscriptionImportResponse.builder()
                .data(
                    SubscriptionImportResponse.Data.builder()
                        .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(subscriptionImportResponse.data())
            .isEqualTo(
                SubscriptionImportResponse.Data.builder()
                    .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionImportResponse =
            SubscriptionImportResponse.builder()
                .data(
                    SubscriptionImportResponse.Data.builder()
                        .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedSubscriptionImportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionImportResponse),
                jacksonTypeRef<SubscriptionImportResponse>(),
            )

        assertThat(roundtrippedSubscriptionImportResponse).isEqualTo(subscriptionImportResponse)
    }
}
