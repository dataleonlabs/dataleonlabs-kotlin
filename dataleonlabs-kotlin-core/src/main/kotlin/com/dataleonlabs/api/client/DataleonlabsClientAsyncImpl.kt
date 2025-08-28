// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.client

import com.dataleonlabs.api.core.ClientOptions
import com.dataleonlabs.api.core.getPackageVersion
import com.dataleonlabs.api.services.async.CompanyServiceAsync
import com.dataleonlabs.api.services.async.CompanyServiceAsyncImpl
import com.dataleonlabs.api.services.async.IndividualServiceAsync
import com.dataleonlabs.api.services.async.IndividualServiceAsyncImpl

class DataleonlabsClientAsyncImpl(private val clientOptions: ClientOptions) :
    DataleonlabsClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: DataleonlabsClient by lazy { DataleonlabsClientImpl(clientOptions) }

    private val withRawResponse: DataleonlabsClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val companies: CompanyServiceAsync by lazy {
        CompanyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val individuals: IndividualServiceAsync by lazy {
        IndividualServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): DataleonlabsClient = sync

    override fun withRawResponse(): DataleonlabsClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DataleonlabsClientAsync =
        DataleonlabsClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun companies(): CompanyServiceAsync = companies

    override fun individuals(): IndividualServiceAsync = individuals

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataleonlabsClientAsync.WithRawResponse {

        private val companies: CompanyServiceAsync.WithRawResponse by lazy {
            CompanyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val individuals: IndividualServiceAsync.WithRawResponse by lazy {
            IndividualServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DataleonlabsClientAsync.WithRawResponse =
            DataleonlabsClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun companies(): CompanyServiceAsync.WithRawResponse = companies

        override fun individuals(): IndividualServiceAsync.WithRawResponse = individuals
    }
}
