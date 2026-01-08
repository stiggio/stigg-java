// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionMigrateParamsTest {

    @Test
    fun create() {
        SubscriptionMigrateParams.builder()
            .id("x")
            .subscriptionMigrationTime(
                SubscriptionMigrateParams.SubscriptionMigrationTime.END_OF_BILLING_PERIOD
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = SubscriptionMigrateParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionMigrateParams.builder()
                .id("x")
                .subscriptionMigrationTime(
                    SubscriptionMigrateParams.SubscriptionMigrationTime.END_OF_BILLING_PERIOD
                )
                .build()

        val body = params._body()

        assertThat(body.subscriptionMigrationTime())
            .contains(SubscriptionMigrateParams.SubscriptionMigrationTime.END_OF_BILLING_PERIOD)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SubscriptionMigrateParams.builder().id("x").build()

        val body = params._body()
    }
}
