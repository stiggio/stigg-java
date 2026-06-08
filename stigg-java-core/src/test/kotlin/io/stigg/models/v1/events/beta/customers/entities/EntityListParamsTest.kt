// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.beta.customers.entities

import io.stigg.core.http.Headers
import io.stigg.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityListParamsTest {

    @Test
    fun create() {
        EntityListParams.builder()
            .id("id")
            .after("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .before("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .includeArchived(EntityListParams.IncludeArchived.TRUE)
            .limit(1L)
            .typeRefId("typeRefId")
            .xAccountId("X-ACCOUNT-ID")
            .xEnvironmentId("X-ENVIRONMENT-ID")
            .build()
    }

    @Test
    fun pathParams() {
        val params = EntityListParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            EntityListParams.builder()
                .id("id")
                .after("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .before("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeArchived(EntityListParams.IncludeArchived.TRUE)
                .limit(1L)
                .typeRefId("typeRefId")
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
        val params = EntityListParams.builder().id("id").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            EntityListParams.builder()
                .id("id")
                .after("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .before("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeArchived(EntityListParams.IncludeArchived.TRUE)
                .limit(1L)
                .typeRefId("typeRefId")
                .xAccountId("X-ACCOUNT-ID")
                .xEnvironmentId("X-ENVIRONMENT-ID")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("before", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("includeArchived", "true")
                    .put("limit", "1")
                    .put("typeRefId", "typeRefId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EntityListParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
