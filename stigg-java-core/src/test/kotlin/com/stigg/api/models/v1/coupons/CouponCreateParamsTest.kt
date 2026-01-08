// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.coupons

import com.stigg.api.core.JsonValue
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
            .name("name")
            .percentOff(1.0)
            .additionalMetaData(JsonValue.from(mapOf<String, Any>()))
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
                .name("name")
                .percentOff(1.0)
                .additionalMetaData(JsonValue.from(mapOf<String, Any>()))
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
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.percentOff()).contains(1.0)
        assertThat(body._additionalMetaData()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
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
                .name("name")
                .percentOff(1.0)
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
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.percentOff()).contains(1.0)
    }
}
