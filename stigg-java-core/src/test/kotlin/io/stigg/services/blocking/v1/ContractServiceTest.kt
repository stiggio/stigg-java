// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import io.stigg.client.okhttp.StiggOkHttpClient
import io.stigg.core.JsonValue
import io.stigg.models.v1.contracts.ContractCreateParams
import io.stigg.models.v1.contracts.ContractDeleteParams
import io.stigg.models.v1.contracts.ContractRetrieveParams
import io.stigg.models.v1.contracts.ContractUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContractServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val contractService = client.v1().contracts()

        val contract =
            contractService.create(
                ContractCreateParams.builder()
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .customerId("customerId")
                    .addSubscription(
                        ContractCreateParams.Subscription.builder()
                            .existingSubscriptionId("existingSubscriptionId")
                            .newSubscription(
                                ContractCreateParams.Subscription.NewSubscription.builder()
                                    .customerId("customerId")
                                    .planId("planId")
                                    .id("id")
                                    .addAddon(
                                        ContractCreateParams.Subscription.NewSubscription.Addon
                                            .builder()
                                            .id("id")
                                            .quantity(0L)
                                            .build()
                                    )
                                    .appliedCoupon(
                                        ContractCreateParams.Subscription.NewSubscription
                                            .AppliedCoupon
                                            .builder()
                                            .billingCouponId("billingCouponId")
                                            .configuration(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .AppliedCoupon
                                                    .Configuration
                                                    .builder()
                                                    .startDate(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .build()
                                            )
                                            .couponId("couponId")
                                            .discount(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .AppliedCoupon
                                                    .Discount
                                                    .builder()
                                                    .addAmountsOff(
                                                        ContractCreateParams.Subscription
                                                            .NewSubscription
                                                            .AppliedCoupon
                                                            .Discount
                                                            .AmountsOff
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                ContractCreateParams.Subscription
                                                                    .NewSubscription
                                                                    .AppliedCoupon
                                                                    .Discount
                                                                    .AmountsOff
                                                                    .Currency
                                                                    .USD
                                                            )
                                                            .build()
                                                    )
                                                    .description("description")
                                                    .durationInMonths(1.0)
                                                    .name("name")
                                                    .percentOff(1.0)
                                                    .build()
                                            )
                                            .promotionCode("promotionCode")
                                            .build()
                                    )
                                    .awaitPaymentConfirmation(true)
                                    .billingCountryCode("billingCountryCode")
                                    .billingCycleAnchor(
                                        ContractCreateParams.Subscription.NewSubscription
                                            .BillingCycleAnchor
                                            .UNCHANGED
                                    )
                                    .billingId("billingId")
                                    .billingInformation(
                                        ContractCreateParams.Subscription.NewSubscription
                                            .BillingInformation
                                            .builder()
                                            .billingAddress(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .BillingInformation
                                                    .BillingAddress
                                                    .builder()
                                                    .city("city")
                                                    .country("country")
                                                    .line1("line1")
                                                    .line2("line2")
                                                    .postalCode("postalCode")
                                                    .state("state")
                                                    .build()
                                            )
                                            .chargeOnBehalfOfAccount("chargeOnBehalfOfAccount")
                                            .integrationId("integrationId")
                                            .invoiceDaysUntilDue(0.0)
                                            .isBackdated(true)
                                            .isInvoicePaid(true)
                                            .metadata(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .BillingInformation
                                                    .Metadata
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .prorationBehavior(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .BillingInformation
                                                    .ProrationBehavior
                                                    .INVOICE_IMMEDIATELY
                                            )
                                            .addTaxId(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .BillingInformation
                                                    .TaxId
                                                    .builder()
                                                    .type("type")
                                                    .value("value")
                                                    .build()
                                            )
                                            .taxPercentage(0.0)
                                            .addTaxRateId("string")
                                            .build()
                                    )
                                    .billingPeriod(
                                        ContractCreateParams.Subscription.NewSubscription
                                            .BillingPeriod
                                            .MONTHLY
                                    )
                                    .budget(
                                        ContractCreateParams.Subscription.NewSubscription.Budget
                                            .builder()
                                            .hasSoftLimit(true)
                                            .limit(0.0)
                                            .build()
                                    )
                                    .cancellationDate(
                                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                    )
                                    .addCharge(
                                        ContractCreateParams.Subscription.NewSubscription.Charge
                                            .builder()
                                            .id("id")
                                            .quantity(0.0)
                                            .type(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .Charge
                                                    .Type
                                                    .FEATURE
                                            )
                                            .build()
                                    )
                                    .checkoutOptions(
                                        ContractCreateParams.Subscription.NewSubscription
                                            .CheckoutOptions
                                            .builder()
                                            .cancelUrl("https://example.com")
                                            .successUrl("https://example.com")
                                            .allowPromoCodes(true)
                                            .allowTaxIdCollection(true)
                                            .collectBillingAddress(true)
                                            .collectPhoneNumber(true)
                                            .referenceId("referenceId")
                                            .build()
                                    )
                                    .addEntitlement(
                                        ContractCreateParams.Subscription.NewSubscription
                                            .Entitlement
                                            .Feature
                                            .builder()
                                            .id("id")
                                            .hasSoftLimit(true)
                                            .hasUnlimitedUsage(true)
                                            .monthlyResetPeriodConfiguration(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .Entitlement
                                                    .Feature
                                                    .MonthlyResetPeriodConfiguration
                                                    .builder()
                                                    .accordingTo(
                                                        ContractCreateParams.Subscription
                                                            .NewSubscription
                                                            .Entitlement
                                                            .Feature
                                                            .MonthlyResetPeriodConfiguration
                                                            .AccordingTo
                                                            .SUBSCRIPTION_START
                                                    )
                                                    .build()
                                            )
                                            .resetPeriod(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .Entitlement
                                                    .Feature
                                                    .ResetPeriod
                                                    .YEAR
                                            )
                                            .usageLimit(0L)
                                            .weeklyResetPeriodConfiguration(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .Entitlement
                                                    .Feature
                                                    .WeeklyResetPeriodConfiguration
                                                    .builder()
                                                    .accordingTo(
                                                        ContractCreateParams.Subscription
                                                            .NewSubscription
                                                            .Entitlement
                                                            .Feature
                                                            .WeeklyResetPeriodConfiguration
                                                            .AccordingTo
                                                            .SUBSCRIPTION_START
                                                    )
                                                    .build()
                                            )
                                            .yearlyResetPeriodConfiguration(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .Entitlement
                                                    .Feature
                                                    .YearlyResetPeriodConfiguration
                                                    .builder()
                                                    .accordingTo(
                                                        ContractCreateParams.Subscription
                                                            .NewSubscription
                                                            .Entitlement
                                                            .Feature
                                                            .YearlyResetPeriodConfiguration
                                                            .AccordingTo
                                                            .SUBSCRIPTION_START
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        ContractCreateParams.Subscription.NewSubscription.Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .minimumSpend(
                                        ContractCreateParams.Subscription.NewSubscription
                                            .MinimumSpend
                                            .builder()
                                            .amount(0.0)
                                            .currency(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .MinimumSpend
                                                    .Currency
                                                    .USD
                                            )
                                            .build()
                                    )
                                    .payingCustomerId("payingCustomerId")
                                    .paymentCollectionMethod(
                                        ContractCreateParams.Subscription.NewSubscription
                                            .PaymentCollectionMethod
                                            .CHARGE
                                    )
                                    .addPriceOverride(
                                        ContractCreateParams.Subscription.NewSubscription
                                            .PriceOverride
                                            .builder()
                                            .addonId("addonId")
                                            .amount(0.0)
                                            .baseCharge(true)
                                            .billingCountryCode("billingCountryCode")
                                            .blockSize(0.0)
                                            .creditGrantCadence(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .PriceOverride
                                                    .CreditGrantCadence
                                                    .BEGINNING_OF_BILLING_PERIOD
                                            )
                                            .creditRate(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .PriceOverride
                                                    .CreditRate
                                                    .builder()
                                                    .amount(1.0)
                                                    .currencyId("currencyId")
                                                    .costFormula("costFormula")
                                                    .build()
                                            )
                                            .currency(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .PriceOverride
                                                    .Currency
                                                    .USD
                                            )
                                            .featureId("featureId")
                                            .addTier(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .PriceOverride
                                                    .Tier
                                                    .builder()
                                                    .flatPrice(
                                                        ContractCreateParams.Subscription
                                                            .NewSubscription
                                                            .PriceOverride
                                                            .Tier
                                                            .FlatPrice
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                ContractCreateParams.Subscription
                                                                    .NewSubscription
                                                                    .PriceOverride
                                                                    .Tier
                                                                    .FlatPrice
                                                                    .Currency
                                                                    .USD
                                                            )
                                                            .build()
                                                    )
                                                    .unitPrice(
                                                        ContractCreateParams.Subscription
                                                            .NewSubscription
                                                            .PriceOverride
                                                            .Tier
                                                            .UnitPrice
                                                            .builder()
                                                            .amount(0.0)
                                                            .currency(
                                                                ContractCreateParams.Subscription
                                                                    .NewSubscription
                                                                    .PriceOverride
                                                                    .Tier
                                                                    .UnitPrice
                                                                    .Currency
                                                                    .USD
                                                            )
                                                            .build()
                                                    )
                                                    .upTo(0.0)
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .resourceId("resourceId")
                                    .salesforceId("salesforceId")
                                    .scheduleStrategy(
                                        ContractCreateParams.Subscription.NewSubscription
                                            .ScheduleStrategy
                                            .END_OF_BILLING_PERIOD
                                    )
                                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .trialOverrideConfiguration(
                                        ContractCreateParams.Subscription.NewSubscription
                                            .TrialOverrideConfiguration
                                            .builder()
                                            .isTrial(true)
                                            .trialEndBehavior(
                                                ContractCreateParams.Subscription.NewSubscription
                                                    .TrialOverrideConfiguration
                                                    .TrialEndBehavior
                                                    .CONVERT_TO_PAID
                                            )
                                            .trialEndDate(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                    .unitQuantity(0L)
                                    .build()
                            )
                            .build()
                    )
                    .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .poNumber("poNumber")
                    .setupBilling(true)
                    .build()
            )

        contract.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val contractService = client.v1().contracts()

        val contract =
            contractService.retrieve(
                ContractRetrieveParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        contract.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val contractService = client.v1().contracts()

        val contract =
            contractService.update(
                ContractUpdateParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .activationEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .activationStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .poNumber("poNumber")
                    .setupBilling(true)
                    .addSubscriptionId("NxI")
                    .build()
            )

        contract.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val contractService = client.v1().contracts()

        val page = contractService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = StiggOkHttpClient.builder().apiKey("My API Key").build()
        val contractService = client.v1().contracts()

        val contract =
            contractService.delete(
                ContractDeleteParams.builder()
                    .id("x")
                    .xAccountId("X-ACCOUNT-ID")
                    .xEnvironmentId("X-ENVIRONMENT-ID")
                    .build()
            )

        contract.validate()
    }
}
