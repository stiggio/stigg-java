// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.autorecharge

import io.stigg.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoRechargeGetAutoRechargeParamsTest {

    @Test
    fun create() {
        AutoRechargeGetAutoRechargeParams.builder()
            .currencyId("currencyId")
            .customerId("customerId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AutoRechargeGetAutoRechargeParams.builder()
                .currencyId("currencyId")
                .customerId("customerId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("currencyId", "currencyId")
                    .put("customerId", "customerId")
                    .build()
            )
    }
}
