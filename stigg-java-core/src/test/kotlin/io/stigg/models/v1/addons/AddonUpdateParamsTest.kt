// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons

import io.stigg.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonUpdateParamsTest {

    @Test
    fun create() {
        AddonUpdateParams.builder()
            .id("x")
            .billingId("billingId")
            .addDependency("string")
            .description("description")
            .displayName("displayName")
            .maxQuantity(0L)
            .metadata(
                AddonUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .status(AddonUpdateParams.Status.DRAFT)
            .build()
    }

    @Test
    fun pathParams() {
        val params = AddonUpdateParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AddonUpdateParams.builder()
                .id("x")
                .billingId("billingId")
                .addDependency("string")
                .description("description")
                .displayName("displayName")
                .maxQuantity(0L)
                .metadata(
                    AddonUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .status(AddonUpdateParams.Status.DRAFT)
                .build()

        val body = params._body()

        assertThat(body.billingId()).contains("billingId")
        assertThat(body.dependencies().getOrNull()).containsExactly("string")
        assertThat(body.description()).contains("description")
        assertThat(body.displayName()).contains("displayName")
        assertThat(body.maxQuantity()).contains(0L)
        assertThat(body.metadata())
            .contains(
                AddonUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.status()).contains(AddonUpdateParams.Status.DRAFT)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AddonUpdateParams.builder().id("x").build()

        val body = params._body()
    }
}
