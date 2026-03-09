// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.coupons

import io.stigg.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CouponCreateParamsTest {

    @Test
    fun create() {
        CouponCreateParams.builder()
            .id("id")
            .addAmountsOff(
                CouponCreateParams.AmountsOff.builder()
                    .amount(0.0)
                    .currency(CouponCreateParams.AmountsOff.Currency.USD)
                    .build()
            )
            .description("description")
            .durationInMonths(1L)
            .metadata(
                CouponCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("name")
            .percentOff(1L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CouponCreateParams.builder()
                .id("id")
                .addAmountsOff(
                    CouponCreateParams.AmountsOff.builder()
                        .amount(0.0)
                        .currency(CouponCreateParams.AmountsOff.Currency.USD)
                        .build()
                )
                .description("description")
                .durationInMonths(1L)
                .metadata(
                    CouponCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .percentOff(1L)
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
        assertThat(body.amountsOff().getOrNull())
            .containsExactly(
                CouponCreateParams.AmountsOff.builder()
                    .amount(0.0)
                    .currency(CouponCreateParams.AmountsOff.Currency.USD)
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.durationInMonths()).contains(1L)
        assertThat(body.metadata())
            .contains(
                CouponCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.percentOff()).contains(1L)
    }
}
