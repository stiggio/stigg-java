// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.entities

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityUnarchiveParamsTest {

    @Test
    fun create() {
        EntityUnarchiveParams.builder()
            .id("id")
            .addId("user-7f3a0c1d")
            .addId("user-c4d1b2e9")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EntityUnarchiveParams.builder()
                .id("id")
                .addId("user-7f3a0c1d")
                .addId("user-c4d1b2e9")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EntityUnarchiveParams.builder()
                .id("id")
                .addId("user-7f3a0c1d")
                .addId("user-c4d1b2e9")
                .build()

        val body = params._body()

        assertThat(body.ids()).containsExactly("user-7f3a0c1d", "user-c4d1b2e9")
    }
}
