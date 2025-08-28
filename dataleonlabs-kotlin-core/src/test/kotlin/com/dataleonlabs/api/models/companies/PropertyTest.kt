// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies

import com.dataleonlabs.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyTest {

    @Test
    fun create() {
        val property =
            Property.builder().name("property_name").type("string").value("property_value").build()

        assertThat(property.name()).isEqualTo("property_name")
        assertThat(property.type()).isEqualTo("string")
        assertThat(property.value()).isEqualTo("property_value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val property =
            Property.builder().name("property_name").type("string").value("property_value").build()

        val roundtrippedProperty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(property),
                jacksonTypeRef<Property>(),
            )

        assertThat(roundtrippedProperty).isEqualTo(property)
    }
}
