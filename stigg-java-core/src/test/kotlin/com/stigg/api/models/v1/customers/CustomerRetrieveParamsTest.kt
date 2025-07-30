// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers

import com.stigg.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerRetrieveParamsTest {

    @Test
    fun create() {
        CustomerRetrieveParams.builder()
            .refId("refId")
            .xApiKey("X-API-KEY")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerRetrieveParams.builder()
                .refId("refId")
                .xApiKey("X-API-KEY")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("refId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CustomerRetrieveParams.builder()
                .refId("refId")
                .xApiKey("X-API-KEY")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-API-KEY", "X-API-KEY")
                    .put("X-ENVIRONMENT-ID", "X-ENVIRONMENT-ID")
                    .build()
            )
    }
}
