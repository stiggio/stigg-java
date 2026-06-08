// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import io.stigg.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCancelParamsTest {

    @Test
    fun create() {
        SubscriptionCancelParams.builder()
            .id("x")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .cancellationAction(SubscriptionCancelParams.CancellationAction.DEFAULT)
            .cancellationTime(SubscriptionCancelParams.CancellationTime.END_OF_BILLING_PERIOD)
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .prorate(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = SubscriptionCancelParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SubscriptionCancelParams.builder()
                .id("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .cancellationAction(SubscriptionCancelParams.CancellationAction.DEFAULT)
                .cancellationTime(SubscriptionCancelParams.CancellationTime.END_OF_BILLING_PERIOD)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .prorate(true)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-ACCOUNT-ID", "X-ACCOUNT-ID")
                    .put("X-ENVIRONMENT-ID", "X-ENVIRONMENT-ID")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = SubscriptionCancelParams.builder().id("x").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SubscriptionCancelParams.builder()
                .id("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .cancellationAction(SubscriptionCancelParams.CancellationAction.DEFAULT)
                .cancellationTime(SubscriptionCancelParams.CancellationTime.END_OF_BILLING_PERIOD)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .prorate(true)
                .build()

        val body = params._body()

        assertThat(body.cancellationAction())
            .contains(SubscriptionCancelParams.CancellationAction.DEFAULT)
        assertThat(body.cancellationTime())
            .contains(SubscriptionCancelParams.CancellationTime.END_OF_BILLING_PERIOD)
        assertThat(body.endDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.prorate()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SubscriptionCancelParams.builder().id("x").build()

        val body = params._body()
    }
}
