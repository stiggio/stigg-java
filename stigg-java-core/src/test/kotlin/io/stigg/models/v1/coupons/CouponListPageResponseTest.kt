// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.coupons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CouponListPageResponseTest {

    @Test
    fun create() {
        val couponListPageResponse =
            CouponListPageResponse.builder()
                .addData(
                    CouponListResponse.builder()
                        .id("id")
                        .addAmountsOff(
                            CouponListResponse.AmountsOff.builder()
                                .amount(0.0)
                                .currency(CouponListResponse.AmountsOff.Currency.USD)
                                .build()
                        )
                        .billingId("billingId")
                        .billingLinkUrl("billingLinkUrl")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .durationInMonths(0.0)
                        .name("name")
                        .percentOff(0.0)
                        .source(CouponListResponse.Source.STIGG)
                        .status(CouponListResponse.Status.ACTIVE)
                        .type(CouponListResponse.Type.FIXED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pagination(
                    CouponListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(couponListPageResponse.data())
            .containsExactly(
                CouponListResponse.builder()
                    .id("id")
                    .addAmountsOff(
                        CouponListResponse.AmountsOff.builder()
                            .amount(0.0)
                            .currency(CouponListResponse.AmountsOff.Currency.USD)
                            .build()
                    )
                    .billingId("billingId")
                    .billingLinkUrl("billingLinkUrl")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .durationInMonths(0.0)
                    .name("name")
                    .percentOff(0.0)
                    .source(CouponListResponse.Source.STIGG)
                    .status(CouponListResponse.Status.ACTIVE)
                    .type(CouponListResponse.Type.FIXED)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(couponListPageResponse.pagination())
            .isEqualTo(
                CouponListPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val couponListPageResponse =
            CouponListPageResponse.builder()
                .addData(
                    CouponListResponse.builder()
                        .id("id")
                        .addAmountsOff(
                            CouponListResponse.AmountsOff.builder()
                                .amount(0.0)
                                .currency(CouponListResponse.AmountsOff.Currency.USD)
                                .build()
                        )
                        .billingId("billingId")
                        .billingLinkUrl("billingLinkUrl")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .durationInMonths(0.0)
                        .name("name")
                        .percentOff(0.0)
                        .source(CouponListResponse.Source.STIGG)
                        .status(CouponListResponse.Status.ACTIVE)
                        .type(CouponListResponse.Type.FIXED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pagination(
                    CouponListPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedCouponListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(couponListPageResponse),
                jacksonTypeRef<CouponListPageResponse>(),
            )

        assertThat(roundtrippedCouponListPageResponse).isEqualTo(couponListPageResponse)
    }
}
