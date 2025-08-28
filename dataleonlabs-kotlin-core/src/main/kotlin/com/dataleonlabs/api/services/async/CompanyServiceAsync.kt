// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.services.async

import com.dataleonlabs.api.core.ClientOptions
import com.dataleonlabs.api.core.RequestOptions
import com.dataleonlabs.api.core.http.HttpResponse
import com.dataleonlabs.api.core.http.HttpResponseFor
import com.dataleonlabs.api.models.companies.Company
import com.dataleonlabs.api.models.companies.CompanyCreateParams
import com.dataleonlabs.api.models.companies.CompanyDeleteParams
import com.dataleonlabs.api.models.companies.CompanyListParams
import com.dataleonlabs.api.models.companies.CompanyRetrieveParams
import com.dataleonlabs.api.models.companies.CompanyUpdateParams
import com.dataleonlabs.api.services.async.companies.DocumentServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface CompanyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CompanyServiceAsync

    fun documents(): DocumentServiceAsync

    /** Create a new company */
    suspend fun create(
        params: CompanyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company

    /** Get a company by ID */
    suspend fun retrieve(
        companyId: String,
        params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company = retrieve(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CompanyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company

    /** @see retrieve */
    suspend fun retrieve(companyId: String, requestOptions: RequestOptions): Company =
        retrieve(companyId, CompanyRetrieveParams.none(), requestOptions)

    /** Update a company by ID */
    suspend fun update(
        companyId: String,
        params: CompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company = update(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: CompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company

    /** Get all companies */
    suspend fun list(
        params: CompanyListParams = CompanyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Company>

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): List<Company> =
        list(CompanyListParams.none(), requestOptions)

    /** Delete a company by ID */
    suspend fun delete(
        companyId: String,
        params: CompanyDeleteParams = CompanyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: CompanyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(companyId: String, requestOptions: RequestOptions) =
        delete(companyId, CompanyDeleteParams.none(), requestOptions)

    /**
     * A view of [CompanyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CompanyServiceAsync.WithRawResponse

        fun documents(): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /companies`, but is otherwise the same as
         * [CompanyServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CompanyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Company>

        /**
         * Returns a raw HTTP response for `get /companies/{company_id}`, but is otherwise the same
         * as [CompanyServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            companyId: String,
            params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Company> =
            retrieve(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CompanyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Company>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            companyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Company> =
            retrieve(companyId, CompanyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /companies/{company_id}`, but is otherwise the same
         * as [CompanyServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            companyId: String,
            params: CompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Company> =
            update(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: CompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Company>

        /**
         * Returns a raw HTTP response for `get /companies`, but is otherwise the same as
         * [CompanyServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CompanyListParams = CompanyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Company>>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<Company>> =
            list(CompanyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /companies/{company_id}`, but is otherwise the
         * same as [CompanyServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            companyId: String,
            params: CompanyDeleteParams = CompanyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: CompanyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(companyId: String, requestOptions: RequestOptions): HttpResponse =
            delete(companyId, CompanyDeleteParams.none(), requestOptions)
    }
}
