// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.individuals.documents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListParamsTest {

    @Test
    fun create() {
        DocumentListParams.builder().individualId("individual_id").build()
    }

    @Test
    fun pathParams() {
        val params = DocumentListParams.builder().individualId("individual_id").build()

        assertThat(params._pathParam(0)).isEqualTo("individual_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
