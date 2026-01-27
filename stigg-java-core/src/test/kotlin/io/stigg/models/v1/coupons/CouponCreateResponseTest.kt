// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.coupons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CouponCreateResponseTest {

    @Test
    fun create() {
        val couponCreateResponse =
            CouponCreateResponse.builder()
                .data(
                    CouponCreateResponse.Data.builder()
                        .id("id")
                        .addAmountsOff(
                            CouponCreateResponse.Data.AmountsOff.builder()
                                .amount(0.0)
                                .currency(CouponCreateResponse.Data.AmountsOff.Currency.USD)
                                .build()
                        )
                        .billingId("billingId")
                        .billingLinkUrl("billingLinkUrl")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .durationInMonths(0.0)
                        .name("name")
                        .percentOff(0.0)
                        .source(CouponCreateResponse.Data.Source.STIGG)
                        .status(CouponCreateResponse.Data.Status.ACTIVE)
                        .type(CouponCreateResponse.Data.Type.FIXED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(couponCreateResponse.data())
            .isEqualTo(
                CouponCreateResponse.Data.builder()
                    .id("id")
                    .addAmountsOff(
                        CouponCreateResponse.Data.AmountsOff.builder()
                            .amount(0.0)
                            .currency(CouponCreateResponse.Data.AmountsOff.Currency.USD)
                            .build()
                    )
                    .billingId("billingId")
                    .billingLinkUrl("billingLinkUrl")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .durationInMonths(0.0)
                    .name("name")
                    .percentOff(0.0)
                    .source(CouponCreateResponse.Data.Source.STIGG)
                    .status(CouponCreateResponse.Data.Status.ACTIVE)
                    .type(CouponCreateResponse.Data.Type.FIXED)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val couponCreateResponse =
            CouponCreateResponse.builder()
                .data(
                    CouponCreateResponse.Data.builder()
                        .id("id")
                        .addAmountsOff(
                            CouponCreateResponse.Data.AmountsOff.builder()
                                .amount(0.0)
                                .currency(CouponCreateResponse.Data.AmountsOff.Currency.USD)
                                .build()
                        )
                        .billingId("billingId")
                        .billingLinkUrl("billingLinkUrl")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .durationInMonths(0.0)
                        .name("name")
                        .percentOff(0.0)
                        .source(CouponCreateResponse.Data.Source.STIGG)
                        .status(CouponCreateResponse.Data.Status.ACTIVE)
                        .type(CouponCreateResponse.Data.Type.FIXED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCouponCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(couponCreateResponse),
                jacksonTypeRef<CouponCreateResponse>(),
            )

        assertThat(roundtrippedCouponCreateResponse).isEqualTo(couponCreateResponse)
    }
}
