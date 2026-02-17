// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers

import io.stigg.TestServerExtension
import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementCreateParams
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementRevokeParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PromotionalEntitlementServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promotionalEntitlementServiceAsync = client.v1().customers().promotionalEntitlements()

        val promotionalEntitlementFuture =
            promotionalEntitlementServiceAsync.create(
                PromotionalEntitlementCreateParams.builder()
                    .id("x")
                    .addPromotionalEntitlement(
                        PromotionalEntitlementCreateParams.PromotionalEntitlement.builder()
                            .customEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addEnumValue("string")
                            .featureId("featureId")
                            .hasSoftLimit(true)
                            .hasUnlimitedUsage(true)
                            .isVisible(true)
                            .monthlyResetPeriodConfiguration(
                                PromotionalEntitlementCreateParams.PromotionalEntitlement
                                    .MonthlyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        PromotionalEntitlementCreateParams.PromotionalEntitlement
                                            .MonthlyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .period(
                                PromotionalEntitlementCreateParams.PromotionalEntitlement.Period
                                    ._1_WEEK
                            )
                            .resetPeriod(
                                PromotionalEntitlementCreateParams.PromotionalEntitlement
                                    .ResetPeriod
                                    .YEAR
                            )
                            .usageLimit(-9007199254740991L)
                            .weeklyResetPeriodConfiguration(
                                PromotionalEntitlementCreateParams.PromotionalEntitlement
                                    .WeeklyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        PromotionalEntitlementCreateParams.PromotionalEntitlement
                                            .WeeklyResetPeriodConfiguration
                                            .AccordingTo
                                            .SUBSCRIPTION_START
                                    )
                                    .build()
                            )
                            .yearlyResetPeriodConfiguration(
                                PromotionalEntitlementCreateParams.PromotionalEntitlement
                                    .YearlyResetPeriodConfiguration
                                    .builder()
                                    .accordingTo(
                                        PromotionalEntitlementCreateParams.PromotionalEntitlement
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

        val promotionalEntitlement = promotionalEntitlementFuture.get()
        promotionalEntitlement.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            StiggOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promotionalEntitlementServiceAsync = client.v1().customers().promotionalEntitlements()

        val pageFuture = promotionalEntitlementServiceAsync.list("x")

        val page = pageFuture.get()
        page.response().validate()
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
                PromotionalEntitlementRevokeParams.builder().id("id").featureId("featureId").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
