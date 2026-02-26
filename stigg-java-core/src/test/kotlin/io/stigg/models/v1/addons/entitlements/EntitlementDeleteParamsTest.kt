// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons.entitlements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementDeleteParamsTest {

    @Test
    fun create() {
        EntitlementDeleteParams.builder().addonId("addonId").id("id").build()
    }

    @Test
    fun pathParams() {
        val params = EntitlementDeleteParams.builder().addonId("addonId").id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("addonId")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
