// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies.documents

import com.dataleonlabs.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentUploadParamsTest {

    @Test
    fun create() {
        DocumentUploadParams.builder()
            .companyId("company_id")
            .documentType(DocumentUploadParams.DocumentType.LIASSE_FISCALE)
            .file("some content".byteInputStream())
            .url("https://example.com/sample.pdf")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DocumentUploadParams.builder()
                .companyId("company_id")
                .documentType(DocumentUploadParams.DocumentType.LIASSE_FISCALE)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("company_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DocumentUploadParams.builder()
                .companyId("company_id")
                .documentType(DocumentUploadParams.DocumentType.LIASSE_FISCALE)
                .file("some content".byteInputStream())
                .url("https://example.com/sample.pdf")
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "document_type" to
                            MultipartField.of(DocumentUploadParams.DocumentType.LIASSE_FISCALE),
                        "file" to MultipartField.of("some content".byteInputStream()),
                        "url" to MultipartField.of("https://example.com/sample.pdf"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DocumentUploadParams.builder()
                .companyId("company_id")
                .documentType(DocumentUploadParams.DocumentType.LIASSE_FISCALE)
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "document_type" to
                            MultipartField.of(DocumentUploadParams.DocumentType.LIASSE_FISCALE)
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
