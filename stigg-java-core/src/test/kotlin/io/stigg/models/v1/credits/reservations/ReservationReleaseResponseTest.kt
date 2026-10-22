// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.credits.reservations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReservationReleaseResponseTest {

    @Test
    fun create() {
        val reservationReleaseResponse =
            ReservationReleaseResponse.builder()
                .data(
                    ReservationReleaseResponse.Data.builder()
                        .credit(
                            ReservationReleaseResponse.Data.Credit.builder()
                                .currencyId("currencyId")
                                .currentUsage(0.0)
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usageLimit(0.0)
                                .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .reservation(
                            ReservationReleaseResponse.Data.Reservation.builder()
                                .id("id")
                                .amount(1.0)
                                .consumedAmount(0.0)
                                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status(ReservationReleaseResponse.Data.Reservation.Status.ACTIVE)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(reservationReleaseResponse.data())
            .isEqualTo(
                ReservationReleaseResponse.Data.builder()
                    .credit(
                        ReservationReleaseResponse.Data.Credit.builder()
                            .currencyId("currencyId")
                            .currentUsage(0.0)
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .usageLimit(0.0)
                            .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .reservation(
                        ReservationReleaseResponse.Data.Reservation.builder()
                            .id("id")
                            .amount(1.0)
                            .consumedAmount(0.0)
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .status(ReservationReleaseResponse.Data.Reservation.Status.ACTIVE)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reservationReleaseResponse =
            ReservationReleaseResponse.builder()
                .data(
                    ReservationReleaseResponse.Data.builder()
                        .credit(
                            ReservationReleaseResponse.Data.Credit.builder()
                                .currencyId("currencyId")
                                .currentUsage(0.0)
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usageLimit(0.0)
                                .usagePeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .reservation(
                            ReservationReleaseResponse.Data.Reservation.builder()
                                .id("id")
                                .amount(1.0)
                                .consumedAmount(0.0)
                                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status(ReservationReleaseResponse.Data.Reservation.Status.ACTIVE)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedReservationReleaseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reservationReleaseResponse),
                jacksonTypeRef<ReservationReleaseResponse>(),
            )

        assertThat(roundtrippedReservationReleaseResponse).isEqualTo(reservationReleaseResponse)
    }
}
