// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.credits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditGetUsageResponseTest {

    @Test
    fun create() {
        val creditGetUsageResponse =
            CreditGetUsageResponse.builder()
                .data(
                    CreditGetUsageResponse.Data.builder()
                        .currency(
                            CreditGetUsageResponse.Data.Currency.builder()
                                .currencyId("currencyId")
                                .displayName("displayName")
                                .plural("plural")
                                .singular("singular")
                                .symbol("symbol")
                                .build()
                        )
                        .addSeries(
                            CreditGetUsageResponse.Data.Series.builder()
                                .featureId("featureId")
                                .featureName("featureName")
                                .addPoint(
                                    CreditGetUsageResponse.Data.Series.Point.builder()
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .value(0.0)
                                        .build()
                                )
                                .totalCredits(0.0)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(creditGetUsageResponse.data())
            .isEqualTo(
                CreditGetUsageResponse.Data.builder()
                    .currency(
                        CreditGetUsageResponse.Data.Currency.builder()
                            .currencyId("currencyId")
                            .displayName("displayName")
                            .plural("plural")
                            .singular("singular")
                            .symbol("symbol")
                            .build()
                    )
                    .addSeries(
                        CreditGetUsageResponse.Data.Series.builder()
                            .featureId("featureId")
                            .featureName("featureName")
                            .addPoint(
                                CreditGetUsageResponse.Data.Series.Point.builder()
                                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .value(0.0)
                                    .build()
                            )
                            .totalCredits(0.0)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditGetUsageResponse =
            CreditGetUsageResponse.builder()
                .data(
                    CreditGetUsageResponse.Data.builder()
                        .currency(
                            CreditGetUsageResponse.Data.Currency.builder()
                                .currencyId("currencyId")
                                .displayName("displayName")
                                .plural("plural")
                                .singular("singular")
                                .symbol("symbol")
                                .build()
                        )
                        .addSeries(
                            CreditGetUsageResponse.Data.Series.builder()
                                .featureId("featureId")
                                .featureName("featureName")
                                .addPoint(
                                    CreditGetUsageResponse.Data.Series.Point.builder()
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .value(0.0)
                                        .build()
                                )
                                .totalCredits(0.0)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedCreditGetUsageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditGetUsageResponse),
                jacksonTypeRef<CreditGetUsageResponse>(),
            )

        assertThat(roundtrippedCreditGetUsageResponse).isEqualTo(creditGetUsageResponse)
    }
}
