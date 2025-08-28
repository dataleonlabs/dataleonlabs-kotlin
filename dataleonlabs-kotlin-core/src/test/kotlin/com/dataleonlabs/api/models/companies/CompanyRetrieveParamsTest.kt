// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies

import com.dataleonlabs.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyRetrieveParamsTest {

    @Test
    fun create() {
        CompanyRetrieveParams.builder()
            .companyId("company_id")
            .document(true)
            .scope("scope")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CompanyRetrieveParams.builder().companyId("company_id").build()

        assertThat(params._pathParam(0)).isEqualTo("company_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CompanyRetrieveParams.builder()
                .companyId("company_id")
                .document(true)
                .scope("scope")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("document", "true").put("scope", "scope").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CompanyRetrieveParams.builder().companyId("company_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
