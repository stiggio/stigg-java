// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.coupons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CouponRetrieveResponseTest {

    @Test
    fun create() {
        val couponRetrieveResponse =
            CouponRetrieveResponse.builder()
                .data(
                    CouponRetrieveResponse.Data.builder()
                        .id("id")
                        .addAmountsOff(
                            CouponRetrieveResponse.Data.AmountsOff.builder()
                                .amount(0.0)
                                .currency(CouponRetrieveResponse.Data.AmountsOff.Currency.USD)
                                .build()
                        )
                        .billingId("billingId")
                        .billingLinkUrl("billingLinkUrl")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .durationInMonths(0.0)
                        .name("name")
                        .percentOff(0.0)
                        .source(CouponRetrieveResponse.Data.Source.STIGG)
                        .status(CouponRetrieveResponse.Data.Status.ACTIVE)
                        .type(CouponRetrieveResponse.Data.Type.FIXED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(couponRetrieveResponse.data())
            .isEqualTo(
                CouponRetrieveResponse.Data.builder()
                    .id("id")
                    .addAmountsOff(
                        CouponRetrieveResponse.Data.AmountsOff.builder()
                            .amount(0.0)
                            .currency(CouponRetrieveResponse.Data.AmountsOff.Currency.USD)
                            .build()
                    )
                    .billingId("billingId")
                    .billingLinkUrl("billingLinkUrl")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .durationInMonths(0.0)
                    .name("name")
                    .percentOff(0.0)
                    .source(CouponRetrieveResponse.Data.Source.STIGG)
                    .status(CouponRetrieveResponse.Data.Status.ACTIVE)
                    .type(CouponRetrieveResponse.Data.Type.FIXED)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val couponRetrieveResponse =
            CouponRetrieveResponse.builder()
                .data(
                    CouponRetrieveResponse.Data.builder()
                        .id("id")
                        .addAmountsOff(
                            CouponRetrieveResponse.Data.AmountsOff.builder()
                                .amount(0.0)
                                .currency(CouponRetrieveResponse.Data.AmountsOff.Currency.USD)
                                .build()
                        )
                        .billingId("billingId")
                        .billingLinkUrl("billingLinkUrl")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .durationInMonths(0.0)
                        .name("name")
                        .percentOff(0.0)
                        .source(CouponRetrieveResponse.Data.Source.STIGG)
                        .status(CouponRetrieveResponse.Data.Status.ACTIVE)
                        .type(CouponRetrieveResponse.Data.Type.FIXED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCouponRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(couponRetrieveResponse),
                jacksonTypeRef<CouponRetrieveResponse>(),
            )

        assertThat(roundtrippedCouponRetrieveResponse).isEqualTo(couponRetrieveResponse)
    }
}
