// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.stigg.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargeListTest {

    @Test
    fun create() {
        val chargeList =
            ChargeList.builder()
                .addData(
                    ChargeList.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .billingCadence(ChargeList.Data.BillingCadence.RECURRING)
                        .billingModel(ChargeList.Data.BillingModel.FLAT_FEE)
                        .billingPeriod(ChargeList.Data.BillingPeriod.MONTHLY)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingCountryCode("billingCountryCode")
                        .billingId("billingId")
                        .blockSize(0.0)
                        .creditGrantCadence(
                            ChargeList.Data.CreditGrantCadence.BEGINNING_OF_BILLING_PERIOD
                        )
                        .creditRate(
                            ChargeList.Data.CreditRate.builder()
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
                            ChargeList.Data.Price.builder()
                                .amount(0.0)
                                .currency(ChargeList.Data.Price.Currency.USD)
                                .build()
                        )
                        .addTier(
                            ChargeList.Data.Tier.builder()
                                .flatPrice(
                                    ChargeList.Data.Tier.FlatPrice.builder()
                                        .amount(0.0)
                                        .currency(ChargeList.Data.Tier.FlatPrice.Currency.USD)
                                        .build()
                                )
                                .unitPrice(
                                    ChargeList.Data.Tier.UnitPrice.builder()
                                        .amount(0.0)
                                        .currency(ChargeList.Data.Tier.UnitPrice.Currency.USD)
                                        .build()
                                )
                                .upTo(0.0)
                                .build()
                        )
                        .tiersMode(ChargeList.Data.TiersMode.VOLUME)
                        .topUpCustomCurrencyId("topUpCustomCurrencyId")
                        .usedInSubscriptions(true)
                        .build()
                )
                .pagination(
                    ChargeList.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(chargeList.data())
            .containsExactly(
                ChargeList.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .billingCadence(ChargeList.Data.BillingCadence.RECURRING)
                    .billingModel(ChargeList.Data.BillingModel.FLAT_FEE)
                    .billingPeriod(ChargeList.Data.BillingPeriod.MONTHLY)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .billingCountryCode("billingCountryCode")
                    .billingId("billingId")
                    .blockSize(0.0)
                    .creditGrantCadence(
                        ChargeList.Data.CreditGrantCadence.BEGINNING_OF_BILLING_PERIOD
                    )
                    .creditRate(
                        ChargeList.Data.CreditRate.builder()
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
                        ChargeList.Data.Price.builder()
                            .amount(0.0)
                            .currency(ChargeList.Data.Price.Currency.USD)
                            .build()
                    )
                    .addTier(
                        ChargeList.Data.Tier.builder()
                            .flatPrice(
                                ChargeList.Data.Tier.FlatPrice.builder()
                                    .amount(0.0)
                                    .currency(ChargeList.Data.Tier.FlatPrice.Currency.USD)
                                    .build()
                            )
                            .unitPrice(
                                ChargeList.Data.Tier.UnitPrice.builder()
                                    .amount(0.0)
                                    .currency(ChargeList.Data.Tier.UnitPrice.Currency.USD)
                                    .build()
                            )
                            .upTo(0.0)
                            .build()
                    )
                    .tiersMode(ChargeList.Data.TiersMode.VOLUME)
                    .topUpCustomCurrencyId("topUpCustomCurrencyId")
                    .usedInSubscriptions(true)
                    .build()
            )
        assertThat(chargeList.pagination())
            .isEqualTo(
                ChargeList.Pagination.builder()
                    .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chargeList =
            ChargeList.builder()
                .addData(
                    ChargeList.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .billingCadence(ChargeList.Data.BillingCadence.RECURRING)
                        .billingModel(ChargeList.Data.BillingModel.FLAT_FEE)
                        .billingPeriod(ChargeList.Data.BillingPeriod.MONTHLY)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingCountryCode("billingCountryCode")
                        .billingId("billingId")
                        .blockSize(0.0)
                        .creditGrantCadence(
                            ChargeList.Data.CreditGrantCadence.BEGINNING_OF_BILLING_PERIOD
                        )
                        .creditRate(
                            ChargeList.Data.CreditRate.builder()
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
                            ChargeList.Data.Price.builder()
                                .amount(0.0)
                                .currency(ChargeList.Data.Price.Currency.USD)
                                .build()
                        )
                        .addTier(
                            ChargeList.Data.Tier.builder()
                                .flatPrice(
                                    ChargeList.Data.Tier.FlatPrice.builder()
                                        .amount(0.0)
                                        .currency(ChargeList.Data.Tier.FlatPrice.Currency.USD)
                                        .build()
                                )
                                .unitPrice(
                                    ChargeList.Data.Tier.UnitPrice.builder()
                                        .amount(0.0)
                                        .currency(ChargeList.Data.Tier.UnitPrice.Currency.USD)
                                        .build()
                                )
                                .upTo(0.0)
                                .build()
                        )
                        .tiersMode(ChargeList.Data.TiersMode.VOLUME)
                        .topUpCustomCurrencyId("topUpCustomCurrencyId")
                        .usedInSubscriptions(true)
                        .build()
                )
                .pagination(
                    ChargeList.Pagination.builder()
                        .next("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .prev("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedChargeList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chargeList),
                jacksonTypeRef<ChargeList>(),
            )

        assertThat(roundtrippedChargeList).isEqualTo(chargeList)
    }
}
