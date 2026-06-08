// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionDelegateParamsTest {

    @Test
    fun create() {
        SubscriptionDelegateParams.builder()
            .id("x")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .targetCustomerId("targetCustomerId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionDelegateParams.builder()
                .id("x")
                .targetCustomerId("targetCustomerId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SubscriptionDelegateParams.builder()
                .id("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .targetCustomerId("targetCustomerId")
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
        val params =
            SubscriptionDelegateParams.builder()
                .id("x")
                .targetCustomerId("targetCustomerId")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SubscriptionDelegateParams.builder()
                .id("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .targetCustomerId("targetCustomerId")
                .build()

        val body = params._body()

        assertThat(body.targetCustomerId()).isEqualTo("targetCustomerId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionDelegateParams.builder()
                .id("x")
                .targetCustomerId("targetCustomerId")
                .build()

        val body = params._body()

        assertThat(body.targetCustomerId()).isEqualTo("targetCustomerId")
    }
}
