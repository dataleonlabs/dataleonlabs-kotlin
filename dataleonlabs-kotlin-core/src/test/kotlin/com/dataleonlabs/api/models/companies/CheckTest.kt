// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies

import com.dataleonlabs.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckTest {

    @Test
    fun create() {
        val check =
            Check.builder()
                .masked(false)
                .message("Name matched successfully")
                .name("name_match")
                .validate(true)
                .weight(1L)
                .build()

        assertThat(check.masked()).isEqualTo(false)
        assertThat(check.message()).isEqualTo("Name matched successfully")
        assertThat(check.name()).isEqualTo("name_match")
        assertThat(check.validate()).isEqualTo(true)
        assertThat(check.weight()).isEqualTo(1L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val check =
            Check.builder()
                .masked(false)
                .message("Name matched successfully")
                .name("name_match")
                .validate(true)
                .weight(1L)
                .build()

        val roundtrippedCheck =
            jsonMapper.readValue(jsonMapper.writeValueAsString(check), jacksonTypeRef<Check>())

        assertThat(roundtrippedCheck).isEqualTo(check)
    }
}
