// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.beta.customers.entities

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityRetrieveParamsTest {

    @Test
    fun create() {
        EntityRetrieveParams.builder().id("id").entityId("x").build()
    }

    @Test
    fun pathParams() {
        val params = EntityRetrieveParams.builder().id("id").entityId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
