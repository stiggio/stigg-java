// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClientAsync
import com.stigg.api.core.JsonValue
import com.stigg.api.models.v1.coupons.CouponCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CouponServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponServiceAsync = client.v1().coupons()

        val couponFuture =
            couponServiceAsync.create(
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

        val coupon = couponFuture.get()
        coupon.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponServiceAsync = client.v1().coupons()

        val couponFuture = couponServiceAsync.retrieve("x")

        val coupon = couponFuture.get()
        coupon.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponServiceAsync = client.v1().coupons()

        val pageFuture = couponServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
