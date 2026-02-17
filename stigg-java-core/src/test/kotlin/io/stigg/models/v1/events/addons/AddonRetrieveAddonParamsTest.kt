// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonRetrieveAddonParamsTest {

    @Test
    fun create() {
        AddonRetrieveAddonParams.builder().id("x").build()
    }

    @Test
    fun pathParams() {
        val params = AddonRetrieveAddonParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
