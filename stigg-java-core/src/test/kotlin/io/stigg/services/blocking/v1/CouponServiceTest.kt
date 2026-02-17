// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1.coupons.CouponCreateParams
import io.stigg.models.v1.coupons.CouponUpdateCouponParams
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
                    .metadata(
                        CouponCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .percentOff(1.0)
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

        val page = couponService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun archiveCoupon() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponService = client.v1().coupons()

        val coupon = couponService.archiveCoupon("x")

        coupon.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateCoupon() {
        val client =
            StiggOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponService = client.v1().coupons()

        val coupon =
            couponService.updateCoupon(
                CouponUpdateCouponParams.builder()
                    .id("x")
                    .description("description")
                    .metadata(
                        CouponUpdateCouponParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        coupon.validate()
    }
}
