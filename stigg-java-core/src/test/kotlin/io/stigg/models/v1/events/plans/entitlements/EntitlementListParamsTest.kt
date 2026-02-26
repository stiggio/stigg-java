// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.plans.entitlements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementListParamsTest {

    @Test
    fun create() {
        EntitlementListParams.builder().planId("planId").build()
    }

    @Test
    fun pathParams() {
        val params = EntitlementListParams.builder().planId("planId").build()

        assertThat(params._pathParam(0)).isEqualTo("planId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
