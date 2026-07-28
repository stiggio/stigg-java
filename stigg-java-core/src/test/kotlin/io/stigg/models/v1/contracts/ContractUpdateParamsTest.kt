// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.contracts

import io.stigg.core.http.Headers
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractUpdateParamsTest {

    @Test
    fun create() {
        ContractUpdateParams.builder()
            .id("x")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .name("name")
            .poNumber("poNumber")
            .setupBilling(true)
            .addSubscriptionId("NxI")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ContractUpdateParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ContractUpdateParams.builder()
                .id("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .poNumber("poNumber")
                .setupBilling(true)
                .addSubscriptionId("NxI")
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
        val params = ContractUpdateParams.builder().id("x").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ContractUpdateParams.builder()
                .id("x")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .poNumber("poNumber")
                .setupBilling(true)
                .addSubscriptionId("NxI")
                .build()

        val body = params._body()

        assertThat(body.activationEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.activationStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.name()).contains("name")
        assertThat(body.poNumber()).contains("poNumber")
        assertThat(body.setupBilling()).contains(true)
        assertThat(body.subscriptionIds().getOrNull()).containsExactly("NxI")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ContractUpdateParams.builder().id("x").build()

        val body = params._body()
    }
}
