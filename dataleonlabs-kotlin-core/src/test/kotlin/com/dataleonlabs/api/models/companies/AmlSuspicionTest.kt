// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies

import com.dataleonlabs.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AmlSuspicionTest {

    @Test
    fun create() {
        val amlSuspicion =
            AmlSuspicion.builder()
                .caption("Suspicious activity")
                .country("FR")
                .gender("M")
                .relation("linked")
                .schema("v1")
                .score(0.85f)
                .source("https://aml-checker.example.com/api/v1/suspicion/12345")
                .status(AmlSuspicion.Status.PENDING)
                .type(AmlSuspicion.Type.PEP)
                .build()

        assertThat(amlSuspicion.caption()).isEqualTo("Suspicious activity")
        assertThat(amlSuspicion.country()).isEqualTo("FR")
        assertThat(amlSuspicion.gender()).isEqualTo("M")
        assertThat(amlSuspicion.relation()).isEqualTo("linked")
        assertThat(amlSuspicion.schema()).isEqualTo("v1")
        assertThat(amlSuspicion.score()).isEqualTo(0.85f)
        assertThat(amlSuspicion.source())
            .isEqualTo("https://aml-checker.example.com/api/v1/suspicion/12345")
        assertThat(amlSuspicion.status()).isEqualTo(AmlSuspicion.Status.PENDING)
        assertThat(amlSuspicion.type()).isEqualTo(AmlSuspicion.Type.PEP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val amlSuspicion =
            AmlSuspicion.builder()
                .caption("Suspicious activity")
                .country("FR")
                .gender("M")
                .relation("linked")
                .schema("v1")
                .score(0.85f)
                .source("https://aml-checker.example.com/api/v1/suspicion/12345")
                .status(AmlSuspicion.Status.PENDING)
                .type(AmlSuspicion.Type.PEP)
                .build()

        val roundtrippedAmlSuspicion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(amlSuspicion),
                jacksonTypeRef<AmlSuspicion>(),
            )

        assertThat(roundtrippedAmlSuspicion).isEqualTo(amlSuspicion)
    }
}
