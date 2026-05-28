// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListChargesPageResponseTest {

    @Test
    fun create() {
        val planListChargesPageResponse =
            PlanListChargesPageResponse.builder()
                .addData(
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
                                        .currency(
                                            PlanListChargesResponse.Tier.FlatPrice.Currency.USD
                                        )
                                        .build()
                                )
                                .unitPrice(
                                    PlanListChargesResponse.Tier.UnitPrice.builder()
                                        .amount(0.0)
                                        .currency(
                                            PlanListChargesResponse.Tier.UnitPrice.Currency.USD
                                        )
                                        .build()
                                )
                                .upTo(0.0)
                                .build()
                        )
                        .tiersMode(PlanListChargesResponse.TiersMode.VOLUME)
                        .topUpCustomCurrencyId("topUpCustomCurrencyId")
                        .usedInSubscriptions(true)
                        .build()
                )
                .pagination(
                    PlanListChargesPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(planListChargesPageResponse.data())
            .containsExactly(
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
            )
        assertThat(planListChargesPageResponse.pagination())
            .isEqualTo(
                PlanListChargesPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planListChargesPageResponse =
            PlanListChargesPageResponse.builder()
                .addData(
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
                                        .currency(
                                            PlanListChargesResponse.Tier.FlatPrice.Currency.USD
                                        )
                                        .build()
                                )
                                .unitPrice(
                                    PlanListChargesResponse.Tier.UnitPrice.builder()
                                        .amount(0.0)
                                        .currency(
                                            PlanListChargesResponse.Tier.UnitPrice.Currency.USD
                                        )
                                        .build()
                                )
                                .upTo(0.0)
                                .build()
                        )
                        .tiersMode(PlanListChargesResponse.TiersMode.VOLUME)
                        .topUpCustomCurrencyId("topUpCustomCurrencyId")
                        .usedInSubscriptions(true)
                        .build()
                )
                .pagination(
                    PlanListChargesPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedPlanListChargesPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planListChargesPageResponse),
                jacksonTypeRef<PlanListChargesPageResponse>(),
            )

        assertThat(roundtrippedPlanListChargesPageResponse).isEqualTo(planListChargesPageResponse)
    }
}
