// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonListChargesResponseTest {

    @Test
    fun create() {
        val addonListChargesResponse =
            AddonListChargesResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .billingCadence(AddonListChargesResponse.BillingCadence.RECURRING)
                .billingModel(AddonListChargesResponse.BillingModel.FLAT_FEE)
                .billingPeriod(AddonListChargesResponse.BillingPeriod.MONTHLY)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .billingCountryCode("billingCountryCode")
                .billingId("billingId")
                .blockSize(0.0)
                .creditGrantCadence(
                    AddonListChargesResponse.CreditGrantCadence.BEGINNING_OF_BILLING_PERIOD
                )
                .creditRate(
                    AddonListChargesResponse.CreditRate.builder()
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
                    AddonListChargesResponse.Price.builder()
                        .amount(0.0)
                        .currency(AddonListChargesResponse.Price.Currency.USD)
                        .build()
                )
                .addTier(
                    AddonListChargesResponse.Tier.builder()
                        .flatPrice(
                            AddonListChargesResponse.Tier.FlatPrice.builder()
                                .amount(0.0)
                                .currency(AddonListChargesResponse.Tier.FlatPrice.Currency.USD)
                                .build()
                        )
                        .unitPrice(
                            AddonListChargesResponse.Tier.UnitPrice.builder()
                                .amount(0.0)
                                .currency(AddonListChargesResponse.Tier.UnitPrice.Currency.USD)
                                .build()
                        )
                        .upTo(0.0)
                        .build()
                )
                .tiersMode(AddonListChargesResponse.TiersMode.VOLUME)
                .topUpCustomCurrencyId("topUpCustomCurrencyId")
                .usedInSubscriptions(true)
                .build()

        assertThat(addonListChargesResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(addonListChargesResponse.billingCadence())
            .isEqualTo(AddonListChargesResponse.BillingCadence.RECURRING)
        assertThat(addonListChargesResponse.billingModel())
            .isEqualTo(AddonListChargesResponse.BillingModel.FLAT_FEE)
        assertThat(addonListChargesResponse.billingPeriod())
            .isEqualTo(AddonListChargesResponse.BillingPeriod.MONTHLY)
        assertThat(addonListChargesResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(addonListChargesResponse.billingCountryCode()).contains("billingCountryCode")
        assertThat(addonListChargesResponse.billingId()).contains("billingId")
        assertThat(addonListChargesResponse.blockSize()).contains(0.0)
        assertThat(addonListChargesResponse.creditGrantCadence())
            .contains(AddonListChargesResponse.CreditGrantCadence.BEGINNING_OF_BILLING_PERIOD)
        assertThat(addonListChargesResponse.creditRate())
            .contains(
                AddonListChargesResponse.CreditRate.builder()
                    .amount(0.0)
                    .currencyId("currencyId")
                    .costFormula("costFormula")
                    .build()
            )
        assertThat(addonListChargesResponse.crmId()).contains("crmId")
        assertThat(addonListChargesResponse.crmLinkUrl()).contains("crmLinkUrl")
        assertThat(addonListChargesResponse.featureId()).contains("featureId")
        assertThat(addonListChargesResponse.maxUnitQuantity()).contains(0.0)
        assertThat(addonListChargesResponse.minUnitQuantity()).contains(0.0)
        assertThat(addonListChargesResponse.price())
            .contains(
                AddonListChargesResponse.Price.builder()
                    .amount(0.0)
                    .currency(AddonListChargesResponse.Price.Currency.USD)
                    .build()
            )
        assertThat(addonListChargesResponse.tiers().getOrNull())
            .containsExactly(
                AddonListChargesResponse.Tier.builder()
                    .flatPrice(
                        AddonListChargesResponse.Tier.FlatPrice.builder()
                            .amount(0.0)
                            .currency(AddonListChargesResponse.Tier.FlatPrice.Currency.USD)
                            .build()
                    )
                    .unitPrice(
                        AddonListChargesResponse.Tier.UnitPrice.builder()
                            .amount(0.0)
                            .currency(AddonListChargesResponse.Tier.UnitPrice.Currency.USD)
                            .build()
                    )
                    .upTo(0.0)
                    .build()
            )
        assertThat(addonListChargesResponse.tiersMode())
            .contains(AddonListChargesResponse.TiersMode.VOLUME)
        assertThat(addonListChargesResponse.topUpCustomCurrencyId())
            .contains("topUpCustomCurrencyId")
        assertThat(addonListChargesResponse.usedInSubscriptions()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonListChargesResponse =
            AddonListChargesResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .billingCadence(AddonListChargesResponse.BillingCadence.RECURRING)
                .billingModel(AddonListChargesResponse.BillingModel.FLAT_FEE)
                .billingPeriod(AddonListChargesResponse.BillingPeriod.MONTHLY)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .billingCountryCode("billingCountryCode")
                .billingId("billingId")
                .blockSize(0.0)
                .creditGrantCadence(
                    AddonListChargesResponse.CreditGrantCadence.BEGINNING_OF_BILLING_PERIOD
                )
                .creditRate(
                    AddonListChargesResponse.CreditRate.builder()
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
                    AddonListChargesResponse.Price.builder()
                        .amount(0.0)
                        .currency(AddonListChargesResponse.Price.Currency.USD)
                        .build()
                )
                .addTier(
                    AddonListChargesResponse.Tier.builder()
                        .flatPrice(
                            AddonListChargesResponse.Tier.FlatPrice.builder()
                                .amount(0.0)
                                .currency(AddonListChargesResponse.Tier.FlatPrice.Currency.USD)
                                .build()
                        )
                        .unitPrice(
                            AddonListChargesResponse.Tier.UnitPrice.builder()
                                .amount(0.0)
                                .currency(AddonListChargesResponse.Tier.UnitPrice.Currency.USD)
                                .build()
                        )
                        .upTo(0.0)
                        .build()
                )
                .tiersMode(AddonListChargesResponse.TiersMode.VOLUME)
                .topUpCustomCurrencyId("topUpCustomCurrencyId")
                .usedInSubscriptions(true)
                .build()

        val roundtrippedAddonListChargesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonListChargesResponse),
                jacksonTypeRef<AddonListChargesResponse>(),
            )

        assertThat(roundtrippedAddonListChargesResponse).isEqualTo(addonListChargesResponse)
    }
}
