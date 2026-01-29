// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementGrantParams
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementRevokeParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PromotionalEntitlementServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun grant() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promotionalEntitlementServiceAsync = client.v1().customers().promotionalEntitlements()

        val responseFuture =
            promotionalEntitlementServiceAsync.grant(
                PromotionalEntitlementGrantParams.builder()
                    .customerId("customerId")
                    .addPromotionalEntitlement(
                        PromotionalEntitlementGrantParams.PromotionalEntitlement.builder()
                            .customEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addEnumValue("string")
                            .featureId("featureId")
                            .hasSoftLimit(true)
                            .hasUnlimitedUsage(true)
                            .isVisible(true)
                            .monthlyResetPeriodConfiguration(
                                PromotionalEntitlementGrantParams.PromotionalEntitlement
                                    .MonthlyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        PromotionalEntitlementGrantParams.PromotionalEntitlement
                                            .MonthlyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .period(
                                PromotionalEntitlementGrantParams.PromotionalEntitlement.Period
                                    ._1_WEEK
                            )
                            .resetPeriod(
                                PromotionalEntitlementGrantParams.PromotionalEntitlement.ResetPeriod
                                    .YEAR
                            )
                            .usageLimit(-9007199254740991L)
                            .weeklyResetPeriodConfiguration(
                                PromotionalEntitlementGrantParams.PromotionalEntitlement
                                    .WeeklyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        PromotionalEntitlementGrantParams.PromotionalEntitlement
                                            .WeeklyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .yearlyResetPeriodConfiguration(
                                PromotionalEntitlementGrantParams.PromotionalEntitlement
                                    .YearlyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        PromotionalEntitlementGrantParams.PromotionalEntitlement
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun revoke() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promotionalEntitlementServiceAsync = client.v1().customers().promotionalEntitlements()

        val responseFuture =
            promotionalEntitlementServiceAsync.revoke(
                PromotionalEntitlementRevokeParams.builder()
                    .customerId("customerId")
                    .featureId("featureId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
