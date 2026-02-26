// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonPublishParamsTest {

    @Test
    fun create() {
        AddonPublishParams.builder()
            .id("x")
            .migrationType(AddonPublishParams.MigrationType.NEW_CUSTOMERS)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AddonPublishParams.builder()
                .id("x")
                .migrationType(AddonPublishParams.MigrationType.NEW_CUSTOMERS)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AddonPublishParams.builder()
                .id("x")
                .migrationType(AddonPublishParams.MigrationType.NEW_CUSTOMERS)
                .build()

        val body = params._body()

        assertThat(body.migrationType()).isEqualTo(AddonPublishParams.MigrationType.NEW_CUSTOMERS)
    }
}
