// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.events.credits.CreditGetAutoRechargeParams
import io.stigg.models.v1.events.credits.CreditGetUsageParams
import io.stigg.models.v1.events.credits.CreditListLedgerParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CreditServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAutoRecharge() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val creditServiceAsync = client.v1().events().credits()

        val responseFuture =
            creditServiceAsync.getAutoRecharge(
                CreditGetAutoRechargeParams.builder()
                    .currencyId("currencyId")
                    .customerId("customerId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getUsage() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val creditServiceAsync = client.v1().events().credits()

        val responseFuture =
            creditServiceAsync.getUsage(
                CreditGetUsageParams.builder()
                    .customerId("customerId")
                    .currencyId("currencyId")
                    .resourceId("resourceId")
                    .timeRange(CreditGetUsageParams.TimeRange.LAST_DAY)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLedger() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val creditServiceAsync = client.v1().events().credits()

        val pageFuture =
            creditServiceAsync.listLedger(
                CreditListLedgerParams.builder().customerId("customerId").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
