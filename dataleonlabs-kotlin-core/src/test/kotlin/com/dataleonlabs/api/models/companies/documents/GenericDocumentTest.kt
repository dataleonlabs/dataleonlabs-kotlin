// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies.documents

import com.dataleonlabs.api.core.JsonValue
import com.dataleonlabs.api.core.jsonMapper
import com.dataleonlabs.api.models.companies.Check
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GenericDocumentTest {

    @Test
    fun create() {
        val genericDocument =
            GenericDocument.builder()
                .id("doc_123")
                .addCheck(
                    Check.builder()
                        .masked(false)
                        .message("Name matched successfully")
                        .name("name_match")
                        .validate(true)
                        .weight(1L)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2025-05-01T12:00:00Z"))
                .documentType("generic")
                .name("generic_doc")
                .signedUrl("https://cdn.example.com/doc.pdf")
                .state("SUBMITTED")
                .status("approved")
                .addTable(
                    GenericDocument.Table.builder()
                        .addOperation(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .addValue(
                    GenericDocument.Value.builder()
                        .confidence(0.95)
                        .name("Full Name")
                        .addValue(100L)
                        .addValue(200L)
                        .build()
                )
                .build()

        assertThat(genericDocument.id()).isEqualTo("doc_123")
        assertThat(genericDocument.checks())
            .containsExactly(
                Check.builder()
                    .masked(false)
                    .message("Name matched successfully")
                    .name("name_match")
                    .validate(true)
                    .weight(1L)
                    .build()
            )
        assertThat(genericDocument.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-05-01T12:00:00Z"))
        assertThat(genericDocument.documentType()).isEqualTo("generic")
        assertThat(genericDocument.name()).isEqualTo("generic_doc")
        assertThat(genericDocument.signedUrl()).isEqualTo("https://cdn.example.com/doc.pdf")
        assertThat(genericDocument.state()).isEqualTo("SUBMITTED")
        assertThat(genericDocument.status()).isEqualTo("approved")
        assertThat(genericDocument.tables())
            .containsExactly(
                GenericDocument.Table.builder()
                    .addOperation(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(genericDocument.values())
            .containsExactly(
                GenericDocument.Value.builder()
                    .confidence(0.95)
                    .name("Full Name")
                    .addValue(100L)
                    .addValue(200L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val genericDocument =
            GenericDocument.builder()
                .id("doc_123")
                .addCheck(
                    Check.builder()
                        .masked(false)
                        .message("Name matched successfully")
                        .name("name_match")
                        .validate(true)
                        .weight(1L)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2025-05-01T12:00:00Z"))
                .documentType("generic")
                .name("generic_doc")
                .signedUrl("https://cdn.example.com/doc.pdf")
                .state("SUBMITTED")
                .status("approved")
                .addTable(
                    GenericDocument.Table.builder()
                        .addOperation(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .addValue(
                    GenericDocument.Value.builder()
                        .confidence(0.95)
                        .name("Full Name")
                        .addValue(100L)
                        .addValue(200L)
                        .build()
                )
                .build()

        val roundtrippedGenericDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(genericDocument),
                jacksonTypeRef<GenericDocument>(),
            )

        assertThat(roundtrippedGenericDocument).isEqualTo(genericDocument)
    }
}
