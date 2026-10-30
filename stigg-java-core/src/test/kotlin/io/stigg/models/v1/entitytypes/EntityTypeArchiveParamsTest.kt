// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.entitytypes

import io.stigg.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityTypeArchiveParamsTest {

    @Test
    fun create() {
        EntityTypeArchiveParams.builder()
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .addId("team")
            .build()
    }

    @Test
    fun headers() {
        val params =
            EntityTypeArchiveParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addId("team")
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
        val params = EntityTypeArchiveParams.builder().addId("team").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            EntityTypeArchiveParams.builder()
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .addId("team")
                .build()

        val body = params._body()

        assertThat(body.ids()).containsExactly("team")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EntityTypeArchiveParams.builder().addId("team").build()

        val body = params._body()

        assertThat(body.ids()).containsExactly("team")
    }
}
