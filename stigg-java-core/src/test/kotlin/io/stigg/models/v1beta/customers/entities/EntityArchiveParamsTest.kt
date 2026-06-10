// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.entities

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityArchiveParamsTest {

    @Test
    fun create() {
        EntityArchiveParams.builder()
            .id("id")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .addId("user-7f3a0c1d")
            .addId("user-c4d1b2e9")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EntityArchiveParams.builder()
                .id("id")
                .addId("user-7f3a0c1d")
                .addId("user-c4d1b2e9")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            EntityArchiveParams.builder()
                .id("id")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addId("user-7f3a0c1d")
                .addId("user-c4d1b2e9")
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
            EntityArchiveParams.builder()
                .id("id")
                .addId("user-7f3a0c1d")
                .addId("user-c4d1b2e9")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            EntityArchiveParams.builder()
                .id("id")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addId("user-7f3a0c1d")
                .addId("user-c4d1b2e9")
                .build()

        val body = params._body()

        assertThat(body.ids()).containsExactly("user-7f3a0c1d", "user-c4d1b2e9")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EntityArchiveParams.builder()
                .id("id")
                .addId("user-7f3a0c1d")
                .addId("user-c4d1b2e9")
                .build()

        val body = params._body()

        assertThat(body.ids()).containsExactly("user-7f3a0c1d", "user-c4d1b2e9")
    }
}
