// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanPublishResponseTest {

    @Test
    fun create() {
        val planPublishResponse =
            PlanPublishResponse.builder()
                .data(
                    PlanPublishResponse.Data.builder()
                        .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(planPublishResponse.data())
            .isEqualTo(
                PlanPublishResponse.Data.builder()
                    .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planPublishResponse =
            PlanPublishResponse.builder()
                .data(
                    PlanPublishResponse.Data.builder()
                        .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedPlanPublishResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planPublishResponse),
                jacksonTypeRef<PlanPublishResponse>(),
            )

        assertThat(roundtrippedPlanPublishResponse).isEqualTo(planPublishResponse)
    }
}
