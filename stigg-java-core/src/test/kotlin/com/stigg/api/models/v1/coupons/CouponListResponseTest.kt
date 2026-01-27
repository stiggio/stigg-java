// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.coupons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stigg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CouponListResponseTest {

    @Test
    fun create() {
        val couponListResponse =
            CouponListResponse.builder()
                .addData(
                    CouponListResponse.Data.builder()
                        .id("id")
                        .addAmountsOff(
                            CouponListResponse.Data.AmountsOff.builder()
                                .amount(0.0)
                                .currency(CouponListResponse.Data.AmountsOff.Currency.USD)
                                .build()
                        )
                        .billingId("billingId")
                        .billingLinkUrl("billingLinkUrl")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .durationInMonths(0.0)
                        .name("name")
                        .percentOff(0.0)
                        .source(CouponListResponse.Data.Source.STIGG)
                        .status(CouponListResponse.Data.Status.ACTIVE)
                        .type(CouponListResponse.Data.Type.FIXED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pagination(
                    CouponListResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(couponListResponse.data())
            .containsExactly(
                CouponListResponse.Data.builder()
                    .id("id")
                    .addAmountsOff(
                        CouponListResponse.Data.AmountsOff.builder()
                            .amount(0.0)
                            .currency(CouponListResponse.Data.AmountsOff.Currency.USD)
                            .build()
                    )
                    .billingId("billingId")
                    .billingLinkUrl("billingLinkUrl")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .durationInMonths(0.0)
                    .name("name")
                    .percentOff(0.0)
                    .source(CouponListResponse.Data.Source.STIGG)
                    .status(CouponListResponse.Data.Status.ACTIVE)
                    .type(CouponListResponse.Data.Type.FIXED)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(couponListResponse.pagination())
            .isEqualTo(
                CouponListResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val couponListResponse =
            CouponListResponse.builder()
                .addData(
                    CouponListResponse.Data.builder()
                        .id("id")
                        .addAmountsOff(
                            CouponListResponse.Data.AmountsOff.builder()
                                .amount(0.0)
                                .currency(CouponListResponse.Data.AmountsOff.Currency.USD)
                                .build()
                        )
                        .billingId("billingId")
                        .billingLinkUrl("billingLinkUrl")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .durationInMonths(0.0)
                        .name("name")
                        .percentOff(0.0)
                        .source(CouponListResponse.Data.Source.STIGG)
                        .status(CouponListResponse.Data.Status.ACTIVE)
                        .type(CouponListResponse.Data.Type.FIXED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pagination(
                    CouponListResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedCouponListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(couponListResponse),
                jacksonTypeRef<CouponListResponse>(),
            )

        assertThat(roundtrippedCouponListResponse).isEqualTo(couponListResponse)
    }
}
