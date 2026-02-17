// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons

import io.stigg.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonUpdateAddonParamsTest {

    @Test
    fun create() {
        AddonUpdateAddonParams.builder()
            .id("x")
            .billingId("billingId")
            .addDependency("string")
            .description("description")
            .displayName("displayName")
            .maxQuantity(0L)
            .metadata(
                AddonUpdateAddonParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = AddonUpdateAddonParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AddonUpdateAddonParams.builder()
                .id("x")
                .billingId("billingId")
                .addDependency("string")
                .description("description")
                .displayName("displayName")
                .maxQuantity(0L)
                .metadata(
                    AddonUpdateAddonParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.billingId()).contains("billingId")
        assertThat(body.dependencies().getOrNull()).containsExactly("string")
        assertThat(body.description()).contains("description")
        assertThat(body.displayName()).contains("displayName")
        assertThat(body.maxQuantity()).contains(0L)
        assertThat(body.metadata())
            .contains(
                AddonUpdateAddonParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AddonUpdateAddonParams.builder().id("x").build()

        val body = params._body()
    }
}
