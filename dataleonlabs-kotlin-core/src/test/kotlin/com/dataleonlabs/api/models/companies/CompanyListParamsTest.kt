// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies

import com.dataleonlabs.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyListParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end_date", "2019-12-27")
                    .put("limit", "1")
                    .put("offset", "0")
                    .put("source_id", "source_id")
                    .put("start_date", "2019-12-27")
                    .put("state", "VOID")
                    .put("status", "rejected")
                    .put("workspace_id", "workspace_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CompanyListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
