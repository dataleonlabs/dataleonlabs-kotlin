// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.services

import com.dataleonlabs.api.client.DataleonlabsClient
import com.dataleonlabs.api.client.okhttp.DataleonlabsOkHttpClient
import com.dataleonlabs.api.core.JsonValue
import com.dataleonlabs.api.core.http.Headers
import com.dataleonlabs.api.core.jsonMapper
import com.dataleonlabs.api.errors.BadRequestException
import com.dataleonlabs.api.errors.DataleonlabsException
import com.dataleonlabs.api.errors.InternalServerException
import com.dataleonlabs.api.errors.NotFoundException
import com.dataleonlabs.api.errors.PermissionDeniedException
import com.dataleonlabs.api.errors.RateLimitException
import com.dataleonlabs.api.errors.UnauthorizedException
import com.dataleonlabs.api.errors.UnexpectedStatusCodeException
import com.dataleonlabs.api.errors.UnprocessableEntityException
import com.dataleonlabs.api.models.companies.CompanyListParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: DataleonlabsClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            DataleonlabsOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun companiesList400() {
        val companyService = client.companies()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList400WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList401() {
        val companyService = client.companies()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList401WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList403() {
        val companyService = client.companies()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList403WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList404() {
        val companyService = client.companies()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList404WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList422() {
        val companyService = client.companies()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList422WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList429() {
        val companyService = client.companies()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList429WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList500() {
        val companyService = client.companies()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList500WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList999() {
        val companyService = client.companies()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesList999WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesListInvalidJsonBody() {
        val companyService = client.companies()
        stubFor(
            get(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<DataleonlabsException> {
                companyService.list(
                    CompanyListParams.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .limit(1L)
                        .offset(0L)
                        .sourceId("source_id")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .state(CompanyListParams.State.VOID)
                        .status(CompanyListParams.Status.REJECTED)
                        .workspaceId("workspace_id")
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
