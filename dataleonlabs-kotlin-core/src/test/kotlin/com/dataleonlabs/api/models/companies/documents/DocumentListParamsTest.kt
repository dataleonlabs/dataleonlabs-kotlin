// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies.documents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListParamsTest {

    @Test
    fun create() {
        DocumentListParams.builder().companyId("company_id").build()
    }

    @Test
    fun pathParams() {
        val params = DocumentListParams.builder().companyId("company_id").build()

        assertThat(params._pathParam(0)).isEqualTo("company_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
