// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListOverageChargesResponseTest {

    @Test
    fun create() {
        val planListOverageChargesResponse =
            PlanListOverageChargesResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .billingCadence(PlanListOverageChargesResponse.BillingCadence.RECURRING)
                .billingModel(PlanListOverageChargesResponse.BillingModel.FLAT_FEE)
                .billingPeriod(PlanListOverageChargesResponse.BillingPeriod.MONTHLY)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .billingCountryCode("billingCountryCode")
                .billingId("billingId")
                .blockSize(0.0)
                .creditGrantCadence(
                    PlanListOverageChargesResponse.CreditGrantCadence.BEGINNING_OF_BILLING_PERIOD
                )
                .creditRate(
                    PlanListOverageChargesResponse.CreditRate.builder()
                        .amount(0.0)
                        .currencyId("currencyId")
                        .costFormula("costFormula")
                        .build()
                )
                .crmId("crmId")
                .crmLinkUrl("crmLinkUrl")
                .featureId("featureId")
                .maxUnitQuantity(0.0)
                .minUnitQuantity(0.0)
                .price(
                    PlanListOverageChargesResponse.Price.builder()
                        .amount(0.0)
                        .currency(PlanListOverageChargesResponse.Price.Currency.USD)
                        .build()
                )
                .addTier(
                    PlanListOverageChargesResponse.Tier.builder()
                        .flatPrice(
                            PlanListOverageChargesResponse.Tier.FlatPrice.builder()
                                .amount(0.0)
                                .currency(
                                    PlanListOverageChargesResponse.Tier.FlatPrice.Currency.USD
                                )
                                .build()
                        )
                        .unitPrice(
                            PlanListOverageChargesResponse.Tier.UnitPrice.builder()
                                .amount(0.0)
                                .currency(
                                    PlanListOverageChargesResponse.Tier.UnitPrice.Currency.USD
                                )
                                .build()
                        )
                        .upTo(0.0)
                        .build()
                )
                .tiersMode(PlanListOverageChargesResponse.TiersMode.VOLUME)
                .topUpCustomCurrencyId("topUpCustomCurrencyId")
                .usedInSubscriptions(true)
                .build()

        assertThat(planListOverageChargesResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(planListOverageChargesResponse.billingCadence())
            .isEqualTo(PlanListOverageChargesResponse.BillingCadence.RECURRING)
        assertThat(planListOverageChargesResponse.billingModel())
            .isEqualTo(PlanListOverageChargesResponse.BillingModel.FLAT_FEE)
        assertThat(planListOverageChargesResponse.billingPeriod())
            .isEqualTo(PlanListOverageChargesResponse.BillingPeriod.MONTHLY)
        assertThat(planListOverageChargesResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planListOverageChargesResponse.billingCountryCode())
            .contains("billingCountryCode")
        assertThat(planListOverageChargesResponse.billingId()).contains("billingId")
        assertThat(planListOverageChargesResponse.blockSize()).contains(0.0)
        assertThat(planListOverageChargesResponse.creditGrantCadence())
            .contains(PlanListOverageChargesResponse.CreditGrantCadence.BEGINNING_OF_BILLING_PERIOD)
        assertThat(planListOverageChargesResponse.creditRate())
            .contains(
                PlanListOverageChargesResponse.CreditRate.builder()
                    .amount(0.0)
                    .currencyId("currencyId")
                    .costFormula("costFormula")
                    .build()
            )
        assertThat(planListOverageChargesResponse.crmId()).contains("crmId")
        assertThat(planListOverageChargesResponse.crmLinkUrl()).contains("crmLinkUrl")
        assertThat(planListOverageChargesResponse.featureId()).contains("featureId")
        assertThat(planListOverageChargesResponse.maxUnitQuantity()).contains(0.0)
        assertThat(planListOverageChargesResponse.minUnitQuantity()).contains(0.0)
        assertThat(planListOverageChargesResponse.price())
            .contains(
                PlanListOverageChargesResponse.Price.builder()
                    .amount(0.0)
                    .currency(PlanListOverageChargesResponse.Price.Currency.USD)
                    .build()
            )
        assertThat(planListOverageChargesResponse.tiers().getOrNull())
            .containsExactly(
                PlanListOverageChargesResponse.Tier.builder()
                    .flatPrice(
                        PlanListOverageChargesResponse.Tier.FlatPrice.builder()
                            .amount(0.0)
                            .currency(PlanListOverageChargesResponse.Tier.FlatPrice.Currency.USD)
                            .build()
                    )
                    .unitPrice(
                        PlanListOverageChargesResponse.Tier.UnitPrice.builder()
                            .amount(0.0)
                            .currency(PlanListOverageChargesResponse.Tier.UnitPrice.Currency.USD)
                            .build()
                    )
                    .upTo(0.0)
                    .build()
            )
        assertThat(planListOverageChargesResponse.tiersMode())
            .contains(PlanListOverageChargesResponse.TiersMode.VOLUME)
        assertThat(planListOverageChargesResponse.topUpCustomCurrencyId())
            .contains("topUpCustomCurrencyId")
        assertThat(planListOverageChargesResponse.usedInSubscriptions()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planListOverageChargesResponse =
            PlanListOverageChargesResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .billingCadence(PlanListOverageChargesResponse.BillingCadence.RECURRING)
                .billingModel(PlanListOverageChargesResponse.BillingModel.FLAT_FEE)
                .billingPeriod(PlanListOverageChargesResponse.BillingPeriod.MONTHLY)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .billingCountryCode("billingCountryCode")
                .billingId("billingId")
                .blockSize(0.0)
                .creditGrantCadence(
                    PlanListOverageChargesResponse.CreditGrantCadence.BEGINNING_OF_BILLING_PERIOD
                )
                .creditRate(
                    PlanListOverageChargesResponse.CreditRate.builder()
                        .amount(0.0)
                        .currencyId("currencyId")
                        .costFormula("costFormula")
                        .build()
                )
                .crmId("crmId")
                .crmLinkUrl("crmLinkUrl")
                .featureId("featureId")
                .maxUnitQuantity(0.0)
                .minUnitQuantity(0.0)
                .price(
                    PlanListOverageChargesResponse.Price.builder()
                        .amount(0.0)
                        .currency(PlanListOverageChargesResponse.Price.Currency.USD)
                        .build()
                )
                .addTier(
                    PlanListOverageChargesResponse.Tier.builder()
                        .flatPrice(
                            PlanListOverageChargesResponse.Tier.FlatPrice.builder()
                                .amount(0.0)
                                .currency(
                                    PlanListOverageChargesResponse.Tier.FlatPrice.Currency.USD
                                )
                                .build()
                        )
                        .unitPrice(
                            PlanListOverageChargesResponse.Tier.UnitPrice.builder()
                                .amount(0.0)
                                .currency(
                                    PlanListOverageChargesResponse.Tier.UnitPrice.Currency.USD
                                )
                                .build()
                        )
                        .upTo(0.0)
                        .build()
                )
                .tiersMode(PlanListOverageChargesResponse.TiersMode.VOLUME)
                .topUpCustomCurrencyId("topUpCustomCurrencyId")
                .usedInSubscriptions(true)
                .build()

        val roundtrippedPlanListOverageChargesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planListOverageChargesResponse),
                jacksonTypeRef<PlanListOverageChargesResponse>(),
            )

        assertThat(roundtrippedPlanListOverageChargesResponse)
            .isEqualTo(planListOverageChargesResponse)
    }
}
