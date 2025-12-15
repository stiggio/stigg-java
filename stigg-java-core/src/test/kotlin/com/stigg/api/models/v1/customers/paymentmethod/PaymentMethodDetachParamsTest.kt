// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers.paymentmethod

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentMethodDetachParamsTest {

    @Test
    fun create() {
        PaymentMethodDetachParams.builder().id("x").build()
    }

    @Test
    fun pathParams() {
        val params = PaymentMethodDetachParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
