// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonPublishAddonParamsTest {

    @Test
    fun create() {
        AddonPublishAddonParams.builder()
            .id("x")
            .migrationType(AddonPublishAddonParams.MigrationType.NEW_CUSTOMERS)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AddonPublishAddonParams.builder()
                .id("x")
                .migrationType(AddonPublishAddonParams.MigrationType.NEW_CUSTOMERS)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AddonPublishAddonParams.builder()
                .id("x")
                .migrationType(AddonPublishAddonParams.MigrationType.NEW_CUSTOMERS)
                .build()

        val body = params._body()

        assertThat(body.migrationType())
            .isEqualTo(AddonPublishAddonParams.MigrationType.NEW_CUSTOMERS)
    }
}
