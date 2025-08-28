// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies

import com.dataleonlabs.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RiskTest {

    @Test
    fun create() {
        val risk = Risk.builder().code("20030").reason("Document mismatch").score(0.92f).build()

        assertThat(risk.code()).isEqualTo("20030")
        assertThat(risk.reason()).isEqualTo("Document mismatch")
        assertThat(risk.score()).isEqualTo(0.92f)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val risk = Risk.builder().code("20030").reason("Document mismatch").score(0.92f).build()

        val roundtrippedRisk =
            jsonMapper.readValue(jsonMapper.writeValueAsString(risk), jacksonTypeRef<Risk>())

        assertThat(roundtrippedRisk).isEqualTo(risk)
    }
}
