// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.coupons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CouponListResponseTest {

    @Test
    fun create() {
        val couponListResponse =
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
                .durationInMonths(1L)
                .metadata(
                    CouponListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .percentOff(1L)
                .source(CouponListResponse.Source.STIGG)
                .status(CouponListResponse.Status.ACTIVE)
                .type(CouponListResponse.Type.FIXED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(couponListResponse.id()).isEqualTo("id")
        assertThat(couponListResponse.amountsOff().getOrNull())
            .containsExactly(
                CouponListResponse.AmountsOff.builder()
                    .amount(0.0)
                    .currency(CouponListResponse.AmountsOff.Currency.USD)
                    .build()
            )
        assertThat(couponListResponse.billingId()).contains("billingId")
        assertThat(couponListResponse.billingLinkUrl()).contains("billingLinkUrl")
        assertThat(couponListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(couponListResponse.description()).contains("description")
        assertThat(couponListResponse.durationInMonths()).contains(1L)
        assertThat(couponListResponse.metadata())
            .contains(
                CouponListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(couponListResponse.name()).isEqualTo("name")
        assertThat(couponListResponse.percentOff()).contains(1L)
        assertThat(couponListResponse.source()).contains(CouponListResponse.Source.STIGG)
        assertThat(couponListResponse.status()).isEqualTo(CouponListResponse.Status.ACTIVE)
        assertThat(couponListResponse.type()).isEqualTo(CouponListResponse.Type.FIXED)
        assertThat(couponListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val couponListResponse =
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
                .durationInMonths(1L)
                .metadata(
                    CouponListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .percentOff(1L)
                .source(CouponListResponse.Source.STIGG)
                .status(CouponListResponse.Status.ACTIVE)
                .type(CouponListResponse.Type.FIXED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCouponListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(couponListResponse),
                jacksonTypeRef<CouponListResponse>(),
            )

        assertThat(roundtrippedCouponListResponse).isEqualTo(couponListResponse)
    }
}
