// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.credits

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1.credits.autorecharge.AutoRechargeGetAutoRechargeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AutoRechargeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAutoRecharge() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val autoRechargeService = client.v1().credits().autoRecharge()

        val response =
            autoRechargeService.getAutoRecharge(
                AutoRechargeGetAutoRechargeParams.builder()
                    .currencyId("currencyId")
                    .customerId("customerId")
                    .build()
            )

        response.validate()
    }
}
