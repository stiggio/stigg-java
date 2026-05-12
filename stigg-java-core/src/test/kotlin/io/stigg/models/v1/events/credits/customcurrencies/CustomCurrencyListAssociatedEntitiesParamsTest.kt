// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits.customcurrencies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomCurrencyListAssociatedEntitiesParamsTest {

    @Test
    fun create() {
        CustomCurrencyListAssociatedEntitiesParams.builder().currencyId("currencyId").build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomCurrencyListAssociatedEntitiesParams.builder().currencyId("currencyId").build()

        assertThat(params._pathParam(0)).isEqualTo("currencyId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
