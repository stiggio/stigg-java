// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.promotionalentitlements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromotionalEntitlementRevokeParamsTest {

    @Test
    fun create() {
        PromotionalEntitlementRevokeParams.builder()
            .customerId("customerId")
            .featureId("featureId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PromotionalEntitlementRevokeParams.builder()
                .customerId("customerId")
                .featureId("featureId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("customerId")
        assertThat(params._pathParam(1)).isEqualTo("featureId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
