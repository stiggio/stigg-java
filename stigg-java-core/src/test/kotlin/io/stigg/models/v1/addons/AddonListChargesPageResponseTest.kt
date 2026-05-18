// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonListChargesPageResponseTest {

    @Test
    fun create() {
        val addonListChargesPageResponse =
            AddonListChargesPageResponse.builder()
                .addData(
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
                                        .currency(
                                            AddonListChargesResponse.Tier.FlatPrice.Currency.USD
                                        )
                                        .build()
                                )
                                .unitPrice(
                                    AddonListChargesResponse.Tier.UnitPrice.builder()
                                        .amount(0.0)
                                        .currency(
                                            AddonListChargesResponse.Tier.UnitPrice.Currency.USD
                                        )
                                        .build()
                                )
                                .upTo(0.0)
                                .build()
                        )
                        .tiersMode(AddonListChargesResponse.TiersMode.VOLUME)
                        .topUpCustomCurrencyId("topUpCustomCurrencyId")
                        .usedInSubscriptions(true)
                        .build()
                )
                .pagination(
                    AddonListChargesPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(addonListChargesPageResponse.data())
            .containsExactly(
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
            )
        assertThat(addonListChargesPageResponse.pagination())
            .isEqualTo(
                AddonListChargesPageResponse.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonListChargesPageResponse =
            AddonListChargesPageResponse.builder()
                .addData(
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
                                        .currency(
                                            AddonListChargesResponse.Tier.FlatPrice.Currency.USD
                                        )
                                        .build()
                                )
                                .unitPrice(
                                    AddonListChargesResponse.Tier.UnitPrice.builder()
                                        .amount(0.0)
                                        .currency(
                                            AddonListChargesResponse.Tier.UnitPrice.Currency.USD
                                        )
                                        .build()
                                )
                                .upTo(0.0)
                                .build()
                        )
                        .tiersMode(AddonListChargesResponse.TiersMode.VOLUME)
                        .topUpCustomCurrencyId("topUpCustomCurrencyId")
                        .usedInSubscriptions(true)
                        .build()
                )
                .pagination(
                    AddonListChargesPageResponse.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedAddonListChargesPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonListChargesPageResponse),
                jacksonTypeRef<AddonListChargesPageResponse>(),
            )

        assertThat(roundtrippedAddonListChargesPageResponse).isEqualTo(addonListChargesPageResponse)
    }
}
