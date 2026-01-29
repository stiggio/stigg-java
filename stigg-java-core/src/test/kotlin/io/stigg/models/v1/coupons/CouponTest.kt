// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.coupons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CouponTest {

    @Test
    fun create() {
        val coupon =
            Coupon.builder()
                .data(
                    Coupon.Data.builder()
                        .id("id")
                        .addAmountsOff(
                            Coupon.Data.AmountsOff.builder()
                                .amount(0.0)
                                .currency(Coupon.Data.AmountsOff.Currency.USD)
                                .build()
                        )
                        .billingId("billingId")
                        .billingLinkUrl("billingLinkUrl")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .durationInMonths(0.0)
                        .name("name")
                        .percentOff(0.0)
                        .source(Coupon.Data.Source.STIGG)
                        .status(Coupon.Data.Status.ACTIVE)
                        .type(Coupon.Data.Type.FIXED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(coupon.data())
            .isEqualTo(
                Coupon.Data.builder()
                    .id("id")
                    .addAmountsOff(
                        Coupon.Data.AmountsOff.builder()
                            .amount(0.0)
                            .currency(Coupon.Data.AmountsOff.Currency.USD)
                            .build()
                    )
                    .billingId("billingId")
                    .billingLinkUrl("billingLinkUrl")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .durationInMonths(0.0)
                    .name("name")
                    .percentOff(0.0)
                    .source(Coupon.Data.Source.STIGG)
                    .status(Coupon.Data.Status.ACTIVE)
                    .type(Coupon.Data.Type.FIXED)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val coupon =
            Coupon.builder()
                .data(
                    Coupon.Data.builder()
                        .id("id")
                        .addAmountsOff(
                            Coupon.Data.AmountsOff.builder()
                                .amount(0.0)
                                .currency(Coupon.Data.AmountsOff.Currency.USD)
                                .build()
                        )
                        .billingId("billingId")
                        .billingLinkUrl("billingLinkUrl")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .durationInMonths(0.0)
                        .name("name")
                        .percentOff(0.0)
                        .source(Coupon.Data.Source.STIGG)
                        .status(Coupon.Data.Status.ACTIVE)
                        .type(Coupon.Data.Type.FIXED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCoupon =
            jsonMapper.readValue(jsonMapper.writeValueAsString(coupon), jacksonTypeRef<Coupon>())

        assertThat(roundtrippedCoupon).isEqualTo(coupon)
    }
}
