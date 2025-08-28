// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.client

import com.dataleonlabs.api.core.ClientOptions
import com.dataleonlabs.api.core.getPackageVersion
import com.dataleonlabs.api.services.blocking.CompanyService
import com.dataleonlabs.api.services.blocking.CompanyServiceImpl
import com.dataleonlabs.api.services.blocking.IndividualService
import com.dataleonlabs.api.services.blocking.IndividualServiceImpl

class DataleonlabsClientImpl(private val clientOptions: ClientOptions) : DataleonlabsClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: DataleonlabsClientAsync by lazy {
        DataleonlabsClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: DataleonlabsClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val companies: CompanyService by lazy { CompanyServiceImpl(clientOptionsWithUserAgent) }

    private val individuals: IndividualService by lazy {
        IndividualServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): DataleonlabsClientAsync = async

    override fun withRawResponse(): DataleonlabsClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DataleonlabsClient =
        DataleonlabsClientImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun companies(): CompanyService = companies

    override fun individuals(): IndividualService = individuals

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataleonlabsClient.WithRawResponse {

        private val companies: CompanyService.WithRawResponse by lazy {
            CompanyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val individuals: IndividualService.WithRawResponse by lazy {
            IndividualServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DataleonlabsClient.WithRawResponse =
            DataleonlabsClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun companies(): CompanyService.WithRawResponse = companies

        override fun individuals(): IndividualService.WithRawResponse = individuals
    }
}
