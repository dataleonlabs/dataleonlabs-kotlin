// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies.documents

import com.dataleonlabs.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentResponseTest {

    @Test
    fun create() {
        val documentResponse =
            DocumentResponse.builder()
                .addDocument(
                    DocumentResponse.Document.builder()
                        .id("123456")
                        .documentType("identity_document_card")
                        .filename("document.pdf")
                        .name("Identity Document Card Back")
                        .signedUrl(
                            "https://storage.googleapis.com/bucket-name/document.pdf?signature=..."
                        )
                        .state("PROCESSED")
                        .status("approved")
                        .workspaceId("wk_123")
                        .build()
                )
                .totalDocument(3L)
                .build()

        assertThat(documentResponse.documents())
            .containsExactly(
                DocumentResponse.Document.builder()
                    .id("123456")
                    .documentType("identity_document_card")
                    .filename("document.pdf")
                    .name("Identity Document Card Back")
                    .signedUrl(
                        "https://storage.googleapis.com/bucket-name/document.pdf?signature=..."
                    )
                    .state("PROCESSED")
                    .status("approved")
                    .workspaceId("wk_123")
                    .build()
            )
        assertThat(documentResponse.totalDocument()).isEqualTo(3L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentResponse =
            DocumentResponse.builder()
                .addDocument(
                    DocumentResponse.Document.builder()
                        .id("123456")
                        .documentType("identity_document_card")
                        .filename("document.pdf")
                        .name("Identity Document Card Back")
                        .signedUrl(
                            "https://storage.googleapis.com/bucket-name/document.pdf?signature=..."
                        )
                        .state("PROCESSED")
                        .status("approved")
                        .workspaceId("wk_123")
                        .build()
                )
                .totalDocument(3L)
                .build()

        val roundtrippedDocumentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentResponse),
                jacksonTypeRef<DocumentResponse>(),
            )

        assertThat(roundtrippedDocumentResponse).isEqualTo(documentResponse)
    }
}
