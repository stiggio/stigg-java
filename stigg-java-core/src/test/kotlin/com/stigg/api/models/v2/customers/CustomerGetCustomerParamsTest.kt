// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v2.customers

import com.stigg.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerGetCustomerParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CustomerGetCustomerParams.builder()
            .refId("refId")
            .xApiKey("X-API-KEY")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            CustomerGetCustomerParams.builder()
                .refId("refId")
                .xApiKey("X-API-KEY")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("refId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headers() {
        val params =
            CustomerGetCustomerParams.builder()
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
