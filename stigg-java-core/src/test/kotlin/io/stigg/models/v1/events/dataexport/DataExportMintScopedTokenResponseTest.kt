// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.dataexport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.JsonValue
import io.stigg.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportMintScopedTokenResponseTest {

    @Test
    fun create() {
        val dataExportMintScopedTokenResponse =
            DataExportMintScopedTokenResponse.builder()
                .data(
                    DataExportMintScopedTokenResponse.Data.builder()
                        .token("token")
                        .expiresAt("expiresAt")
                        .providerMetadata(
                            DataExportMintScopedTokenResponse.Data.ProviderMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(dataExportMintScopedTokenResponse.data())
            .isEqualTo(
                DataExportMintScopedTokenResponse.Data.builder()
                    .token("token")
                    .expiresAt("expiresAt")
                    .providerMetadata(
                        DataExportMintScopedTokenResponse.Data.ProviderMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportMintScopedTokenResponse =
            DataExportMintScopedTokenResponse.builder()
                .data(
                    DataExportMintScopedTokenResponse.Data.builder()
                        .token("token")
                        .expiresAt("expiresAt")
                        .providerMetadata(
                            DataExportMintScopedTokenResponse.Data.ProviderMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedDataExportMintScopedTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportMintScopedTokenResponse),
                jacksonTypeRef<DataExportMintScopedTokenResponse>(),
            )

        assertThat(roundtrippedDataExportMintScopedTokenResponse)
            .isEqualTo(dataExportMintScopedTokenResponse)
    }
}
