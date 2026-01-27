// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions.futureupdate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FutureUpdateCancelScheduleParamsTest {

    @Test
    fun create() {
        FutureUpdateCancelScheduleParams.builder().id("x").build()
    }

    @Test
    fun pathParams() {
        val params = FutureUpdateCancelScheduleParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
