// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.credits

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.credits.autorecharge.AutoRechargeGetAutoRechargeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AutoRechargeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAutoRecharge() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val autoRechargeServiceAsync = client.v1().credits().autoRecharge()

        val responseFuture =
            autoRechargeServiceAsync.getAutoRecharge(
                AutoRechargeGetAutoRechargeParams.builder()
                    .currencyId("currencyId")
                    .customerId("customerId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
