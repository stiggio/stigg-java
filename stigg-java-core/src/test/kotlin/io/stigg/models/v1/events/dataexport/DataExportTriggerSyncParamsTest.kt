// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportTriggerSyncParamsTest {

    @Test
    fun create() {
        DataExportTriggerSyncParams.builder().destinationId("destinationId").build()
    }

    @Test
    fun body() {
        val params = DataExportTriggerSyncParams.builder().destinationId("destinationId").build()

        val body = params._body()

        assertThat(body.destinationId()).contains("destinationId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DataExportTriggerSyncParams.builder().build()

        val body = params._body()
    }
}
