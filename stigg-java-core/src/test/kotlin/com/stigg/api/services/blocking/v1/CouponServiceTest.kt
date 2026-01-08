// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClient
import com.stigg.api.core.JsonValue
import com.stigg.api.models.v1.coupons.CouponCreateParams
import com.stigg.api.models.v1.coupons.CouponListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CouponServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponService = client.v1().coupons()

        val coupon =
            couponService.create(
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
            )

        coupon.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponService = client.v1().coupons()

        val coupon = couponService.retrieve("x")

        coupon.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponService = client.v1().coupons()

        val coupons =
            couponService.list(
                CouponListParams.builder()
                    .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(1L)
                    .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        coupons.validate()
    }
}
