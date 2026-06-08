// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.core.JsonValue
import io.stigg.models.v1.coupons.CouponArchiveCouponParams
import io.stigg.models.v1.coupons.CouponCreateParams
import io.stigg.models.v1.coupons.CouponRetrieveParams
import io.stigg.models.v1.coupons.CouponUpdateCouponParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CouponServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val couponServiceAsync = client.v1().coupons()

        val couponFuture =
            couponServiceAsync.create(
                CouponCreateParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
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

        val coupon = couponFuture.get()
        coupon.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val couponServiceAsync = client.v1().coupons()

        val couponFuture =
            couponServiceAsync.retrieve(
                CouponRetrieveParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val coupon = couponFuture.get()
        coupon.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val couponServiceAsync = client.v1().coupons()

        val pageFuture = couponServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archiveCoupon() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val couponServiceAsync = client.v1().coupons()

        val couponFuture =
            couponServiceAsync.archiveCoupon(
                CouponArchiveCouponParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val coupon = couponFuture.get()
        coupon.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateCoupon() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val couponServiceAsync = client.v1().coupons()

        val couponFuture =
            couponServiceAsync.updateCoupon(
                CouponUpdateCouponParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .description("description")
                    .metadata(
                        CouponUpdateCouponParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        val coupon = couponFuture.get()
        coupon.validate()
    }
}
