// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.client.okhttp.StiggOkHttpClientAsync
import io.stigg.models.v1.credits.CreditGetAutoRechargeParams
import io.stigg.models.v1.credits.CreditGetUsageParams
import io.stigg.models.v1.credits.CreditListLedgerParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CreditServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAutoRecharge() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val creditServiceAsync = client.v1().credits()

        val responseFuture =
            creditServiceAsync.getAutoRecharge(
                CreditGetAutoRechargeParams.builder()
                    .currencyId("currencyId")
                    .customerId("customerId")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getUsage() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val creditServiceAsync = client.v1().credits()

        val responseFuture =
            creditServiceAsync.getUsage(
                CreditGetUsageParams.builder()
                    .customerId("customerId")
                    .after("after")
                    .before("before")
                    .currencyId("currencyId")
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .groupBy("groupBy")
                    .limit(1L)
                    .resourceId("resourceId")
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeRange(CreditGetUsageParams.TimeRange.LAST_DAY)
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLedger() {
        val client = StiggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val creditServiceAsync = client.v1().credits()

        val pageFuture =
            creditServiceAsync.listLedger(
                CreditListLedgerParams.builder().customerId("customerId").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
