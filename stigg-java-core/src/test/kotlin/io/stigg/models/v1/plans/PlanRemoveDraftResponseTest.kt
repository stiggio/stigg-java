// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanRemoveDraftResponseTest {

    @Test
    fun create() {
        val planRemoveDraftResponse =
            PlanRemoveDraftResponse.builder()
                .data(PlanRemoveDraftResponse.Data.builder().id("id").build())
                .build()

        assertThat(planRemoveDraftResponse.data())
            .isEqualTo(PlanRemoveDraftResponse.Data.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planRemoveDraftResponse =
            PlanRemoveDraftResponse.builder()
                .data(PlanRemoveDraftResponse.Data.builder().id("id").build())
                .build()

        val roundtrippedPlanRemoveDraftResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planRemoveDraftResponse),
                jacksonTypeRef<PlanRemoveDraftResponse>(),
            )

        assertThat(roundtrippedPlanRemoveDraftResponse).isEqualTo(planRemoveDraftResponse)
    }
}
