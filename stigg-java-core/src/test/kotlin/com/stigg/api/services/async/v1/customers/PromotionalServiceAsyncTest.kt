// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1.customers

import com.stigg.api.TestServerExtension
import com.stigg.api.client.okhttp.StiggOkHttpClientAsync
import com.stigg.api.models.v1.customers.promotional.PromotionalCreateParams
import com.stigg.api.models.v1.customers.promotional.PromotionalRevokeParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PromotionalServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promotionalServiceAsync = client.v1().customers().promotional()

        val promotionalFuture =
            promotionalServiceAsync.create(
                PromotionalCreateParams.builder()
                    .customerId("customerId")
                    .addPromotionalEntitlement(
                        PromotionalCreateParams.PromotionalEntitlement.builder()
                            .customEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addEnumValue("string")
                            .featureId("featureId")
                            .hasSoftLimit(true)
                            .hasUnlimitedUsage(true)
                            .isVisible(true)
                            .monthlyResetPeriodConfiguration(
                                PromotionalCreateParams.PromotionalEntitlement
                                    .MonthlyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        PromotionalCreateParams.PromotionalEntitlement
                                            .MonthlyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .period(PromotionalCreateParams.PromotionalEntitlement.Period._1_WEEK)
                            .resetPeriod(
                                PromotionalCreateParams.PromotionalEntitlement.ResetPeriod.YEAR
                            )
                            .usageLimit(-9007199254740991L)
                            .weeklyResetPeriodConfiguration(
                                PromotionalCreateParams.PromotionalEntitlement
                                    .WeeklyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        PromotionalCreateParams.PromotionalEntitlement
                                            .WeeklyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .yearlyResetPeriodConfiguration(
                                PromotionalCreateParams.PromotionalEntitlement
                                    .YearlyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        PromotionalCreateParams.PromotionalEntitlement
                                            .YearlyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val promotional = promotionalFuture.get()
        promotional.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun revoke() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promotionalServiceAsync = client.v1().customers().promotional()

        val responseFuture =
            promotionalServiceAsync.revoke(
                PromotionalRevokeParams.builder()
                    .customerId("customerId")
                    .featureId("featureId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
