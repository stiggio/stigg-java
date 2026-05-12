// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits.customcurrencies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomCurrencyArchiveParamsTest {

    @Test
    fun create() {
        CustomCurrencyArchiveParams.builder().currencyId("currencyId").build()
    }

    @Test
    fun pathParams() {
        val params = CustomCurrencyArchiveParams.builder().currencyId("currencyId").build()

        assertThat(params._pathParam(0)).isEqualTo("currencyId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
