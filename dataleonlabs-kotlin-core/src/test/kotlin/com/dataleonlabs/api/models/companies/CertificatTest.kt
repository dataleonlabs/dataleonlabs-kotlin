// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies

import com.dataleonlabs.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CertificatTest {

    @Test
    fun create() {
        val certificat =
            Certificat.builder()
                .id("cert_123")
                .createdAt(OffsetDateTime.parse("2025-05-01T12:00:00Z"))
                .filename("certificate.pdf")
                .build()

        assertThat(certificat.id()).isEqualTo("cert_123")
        assertThat(certificat.createdAt()).isEqualTo(OffsetDateTime.parse("2025-05-01T12:00:00Z"))
        assertThat(certificat.filename()).isEqualTo("certificate.pdf")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val certificat =
            Certificat.builder()
                .id("cert_123")
                .createdAt(OffsetDateTime.parse("2025-05-01T12:00:00Z"))
                .filename("certificate.pdf")
                .build()

        val roundtrippedCertificat =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(certificat),
                jacksonTypeRef<Certificat>(),
            )

        assertThat(roundtrippedCertificat).isEqualTo(certificat)
    }
}
