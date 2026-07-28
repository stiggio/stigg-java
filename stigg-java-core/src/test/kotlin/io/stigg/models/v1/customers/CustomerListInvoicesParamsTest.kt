// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListInvoicesParamsTest {

    @Test
    fun create() {
        CustomerListInvoicesParams.builder()
            .id("id")
            .after("after")
            .before("before")
            .contractExternalId("contractExternalId")
            .issuedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .issuedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(1L)
            .orderBy(CustomerListInvoicesParams.OrderBy.ISSUE_DATE)
            .orderDir(CustomerListInvoicesParams.OrderDir.ASC)
            .stateIn("stateIn")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CustomerListInvoicesParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CustomerListInvoicesParams.builder()
                .id("id")
                .after("after")
                .before("before")
                .contractExternalId("contractExternalId")
                .issuedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .issuedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(1L)
                .orderBy(CustomerListInvoicesParams.OrderBy.ISSUE_DATE)
                .orderDir(CustomerListInvoicesParams.OrderDir.ASC)
                .stateIn("stateIn")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-ACCOUNT-ID", "X-ACCOUNT-ID")
                    .put("X-ENVIRONMENT-ID", "X-ENVIRONMENT-ID")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = CustomerListInvoicesParams.builder().id("id").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            CustomerListInvoicesParams.builder()
                .id("id")
                .after("after")
                .before("before")
                .contractExternalId("contractExternalId")
                .issuedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .issuedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(1L)
                .orderBy(CustomerListInvoicesParams.OrderBy.ISSUE_DATE)
                .orderDir(CustomerListInvoicesParams.OrderDir.ASC)
                .stateIn("stateIn")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("before", "before")
                    .put("contractExternalId", "contractExternalId")
                    .put("issuedAfter", "2019-12-27T18:11:19.117Z")
                    .put("issuedBefore", "2019-12-27T18:11:19.117Z")
                    .put("limit", "1")
                    .put("orderBy", "issueDate")
                    .put("orderDir", "ASC")
                    .put("stateIn", "stateIn")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerListInvoicesParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
