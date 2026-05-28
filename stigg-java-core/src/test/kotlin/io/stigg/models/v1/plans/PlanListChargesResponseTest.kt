// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListChargesResponseTest {

    @Test
    fun create() {
        val planListChargesResponse =
            PlanListChargesResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .billingCadence(PlanListChargesResponse.BillingCadence.RECURRING)
                .billingModel(PlanListChargesResponse.BillingModel.FLAT_FEE)
                .billingPeriod(PlanListChargesResponse.BillingPeriod.MONTHLY)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .billingCountryCode("billingCountryCode")
                .billingId("billingId")
                .blockSize(0.0)
                .creditGrantCadence(
                    PlanListChargesResponse.CreditGrantCadence.BEGINNING_OF_BILLING_PERIOD
                )
                .creditRate(
                    PlanListChargesResponse.CreditRate.builder()
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
                    PlanListChargesResponse.Price.builder()
                        .amount(0.0)
                        .currency(PlanListChargesResponse.Price.Currency.USD)
                        .build()
                )
                .addTier(
                    PlanListChargesResponse.Tier.builder()
                        .flatPrice(
                            PlanListChargesResponse.Tier.FlatPrice.builder()
                                .amount(0.0)
                                .currency(PlanListChargesResponse.Tier.FlatPrice.Currency.USD)
                                .build()
                        )
                        .unitPrice(
                            PlanListChargesResponse.Tier.UnitPrice.builder()
                                .amount(0.0)
                                .currency(PlanListChargesResponse.Tier.UnitPrice.Currency.USD)
                                .build()
                        )
                        .upTo(0.0)
                        .build()
                )
                .tiersMode(PlanListChargesResponse.TiersMode.VOLUME)
                .topUpCustomCurrencyId("topUpCustomCurrencyId")
                .usedInSubscriptions(true)
                .build()

        assertThat(planListChargesResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(planListChargesResponse.billingCadence())
            .isEqualTo(PlanListChargesResponse.BillingCadence.RECURRING)
        assertThat(planListChargesResponse.billingModel())
            .isEqualTo(PlanListChargesResponse.BillingModel.FLAT_FEE)
        assertThat(planListChargesResponse.billingPeriod())
            .isEqualTo(PlanListChargesResponse.BillingPeriod.MONTHLY)
        assertThat(planListChargesResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planListChargesResponse.billingCountryCode()).contains("billingCountryCode")
        assertThat(planListChargesResponse.billingId()).contains("billingId")
        assertThat(planListChargesResponse.blockSize()).contains(0.0)
        assertThat(planListChargesResponse.creditGrantCadence())
            .contains(PlanListChargesResponse.CreditGrantCadence.BEGINNING_OF_BILLING_PERIOD)
        assertThat(planListChargesResponse.creditRate())
            .contains(
                PlanListChargesResponse.CreditRate.builder()
                    .amount(0.0)
                    .currencyId("currencyId")
                    .costFormula("costFormula")
                    .build()
            )
        assertThat(planListChargesResponse.crmId()).contains("crmId")
        assertThat(planListChargesResponse.crmLinkUrl()).contains("crmLinkUrl")
        assertThat(planListChargesResponse.featureId()).contains("featureId")
        assertThat(planListChargesResponse.maxUnitQuantity()).contains(0.0)
        assertThat(planListChargesResponse.minUnitQuantity()).contains(0.0)
        assertThat(planListChargesResponse.price())
            .contains(
                PlanListChargesResponse.Price.builder()
                    .amount(0.0)
                    .currency(PlanListChargesResponse.Price.Currency.USD)
                    .build()
            )
        assertThat(planListChargesResponse.tiers().getOrNull())
            .containsExactly(
                PlanListChargesResponse.Tier.builder()
                    .flatPrice(
                        PlanListChargesResponse.Tier.FlatPrice.builder()
                            .amount(0.0)
                            .currency(PlanListChargesResponse.Tier.FlatPrice.Currency.USD)
                            .build()
                    )
                    .unitPrice(
                        PlanListChargesResponse.Tier.UnitPrice.builder()
                            .amount(0.0)
                            .currency(PlanListChargesResponse.Tier.UnitPrice.Currency.USD)
                            .build()
                    )
                    .upTo(0.0)
                    .build()
            )
        assertThat(planListChargesResponse.tiersMode())
            .contains(PlanListChargesResponse.TiersMode.VOLUME)
        assertThat(planListChargesResponse.topUpCustomCurrencyId())
            .contains("topUpCustomCurrencyId")
        assertThat(planListChargesResponse.usedInSubscriptions()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planListChargesResponse =
            PlanListChargesResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .billingCadence(PlanListChargesResponse.BillingCadence.RECURRING)
                .billingModel(PlanListChargesResponse.BillingModel.FLAT_FEE)
                .billingPeriod(PlanListChargesResponse.BillingPeriod.MONTHLY)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .billingCountryCode("billingCountryCode")
                .billingId("billingId")
                .blockSize(0.0)
                .creditGrantCadence(
                    PlanListChargesResponse.CreditGrantCadence.BEGINNING_OF_BILLING_PERIOD
                )
                .creditRate(
                    PlanListChargesResponse.CreditRate.builder()
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
                    PlanListChargesResponse.Price.builder()
                        .amount(0.0)
                        .currency(PlanListChargesResponse.Price.Currency.USD)
                        .build()
                )
                .addTier(
                    PlanListChargesResponse.Tier.builder()
                        .flatPrice(
                            PlanListChargesResponse.Tier.FlatPrice.builder()
                                .amount(0.0)
                                .currency(PlanListChargesResponse.Tier.FlatPrice.Currency.USD)
                                .build()
                        )
                        .unitPrice(
                            PlanListChargesResponse.Tier.UnitPrice.builder()
                                .amount(0.0)
                                .currency(PlanListChargesResponse.Tier.UnitPrice.Currency.USD)
                                .build()
                        )
                        .upTo(0.0)
                        .build()
                )
                .tiersMode(PlanListChargesResponse.TiersMode.VOLUME)
                .topUpCustomCurrencyId("topUpCustomCurrencyId")
                .usedInSubscriptions(true)
                .build()

        val roundtrippedPlanListChargesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planListChargesResponse),
                jacksonTypeRef<PlanListChargesResponse>(),
            )

        assertThat(roundtrippedPlanListChargesResponse).isEqualTo(planListChargesResponse)
    }
}
