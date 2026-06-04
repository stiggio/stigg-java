// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport.destinations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DestinationCreateParamsTest {

    @Test
    fun create() {
        DestinationCreateParams.builder().destinationId("x").destinationType("x").build()
    }

    @Test
    fun body() {
        val params =
            DestinationCreateParams.builder().destinationId("x").destinationType("x").build()

        val body = params._body()

        assertThat(body.destinationId()).isEqualTo("x")
        assertThat(body.destinationType()).isEqualTo("x")
    }
}
