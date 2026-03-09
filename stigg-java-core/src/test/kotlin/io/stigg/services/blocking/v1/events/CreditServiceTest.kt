// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.models.v1.events.credits.CreditGetAutoRechargeParams
import io.stigg.models.v1.events.credits.CreditGetUsageParams
import io.stigg.models.v1.events.credits.CreditListLedgerParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CreditServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAutoRecharge() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val creditService = client.v1().events().credits()

        val response =
            creditService.getAutoRecharge(
                CreditGetAutoRechargeParams.builder()
                    .currencyId("currencyId")
                    .customerId("customerId")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getUsage() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val creditService = client.v1().events().credits()

        val response =
            creditService.getUsage(
                CreditGetUsageParams.builder()
                    .customerId("customerId")
                    .currencyId("currencyId")
                    .resourceId("resourceId")
                    .timeRange(CreditGetUsageParams.TimeRange.LAST_DAY)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLedger() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val creditService = client.v1().events().credits()

        val page =
            creditService.listLedger(
                CreditListLedgerParams.builder().customerId("customerId").build()
            )

        page.response().validate()
    }
}
