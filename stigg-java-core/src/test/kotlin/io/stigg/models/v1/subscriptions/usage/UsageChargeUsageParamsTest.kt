// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions.usage

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageChargeUsageParamsTest {

    @Test
    fun create() {
        UsageChargeUsageParams.builder()
            .id("x")
            .untilDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = UsageChargeUsageParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UsageChargeUsageParams.builder()
                .id("x")
                .untilDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.untilDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UsageChargeUsageParams.builder().id("x").build()

        val body = params._body()
    }
}
