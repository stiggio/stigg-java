// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportMintScopedTokenParamsTest {

    @Test
    fun create() {
        DataExportMintScopedTokenParams.builder()
            .applicationOrigin("x")
            .destinationType("destinationType")
            .build()
    }

    @Test
    fun body() {
        val params =
            DataExportMintScopedTokenParams.builder()
                .applicationOrigin("x")
                .destinationType("destinationType")
                .build()

        val body = params._body()

        assertThat(body.applicationOrigin()).isEqualTo("x")
        assertThat(body.destinationType()).contains("destinationType")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DataExportMintScopedTokenParams.builder().applicationOrigin("x").build()

        val body = params._body()

        assertThat(body.applicationOrigin()).isEqualTo("x")
    }
}
