// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.services.blocking

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
import com.dataleonlabs.api.services.blocking.companies.DocumentService
import com.google.errorprone.annotations.MustBeClosed

interface CompanyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CompanyService

    fun documents(): DocumentService

    /** Create a new company */
    fun create(
        params: CompanyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company

    /** Get a company by ID */
    fun retrieve(
        companyId: String,
        params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company = retrieve(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CompanyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company

    /** @see retrieve */
    fun retrieve(companyId: String, requestOptions: RequestOptions): Company =
        retrieve(companyId, CompanyRetrieveParams.none(), requestOptions)

    /** Update a company by ID */
    fun update(
        companyId: String,
        params: CompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company = update(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see update */
    fun update(
        params: CompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company

    /** Get all companies */
    fun list(
        params: CompanyListParams = CompanyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Company>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<Company> =
        list(CompanyListParams.none(), requestOptions)

    /** Delete a company by ID */
    fun delete(
        companyId: String,
        params: CompanyDeleteParams = CompanyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see delete */
    fun delete(params: CompanyDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(companyId: String, requestOptions: RequestOptions) =
        delete(companyId, CompanyDeleteParams.none(), requestOptions)

    /** A view of [CompanyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CompanyService.WithRawResponse

        fun documents(): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /companies`, but is otherwise the same as
         * [CompanyService.create].
         */
        @MustBeClosed
        fun create(
            params: CompanyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Company>

        /**
         * Returns a raw HTTP response for `get /companies/{company_id}`, but is otherwise the same
         * as [CompanyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            companyId: String,
            params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Company> =
            retrieve(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CompanyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Company>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(companyId: String, requestOptions: RequestOptions): HttpResponseFor<Company> =
            retrieve(companyId, CompanyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /companies/{company_id}`, but is otherwise the same
         * as [CompanyService.update].
         */
        @MustBeClosed
        fun update(
            companyId: String,
            params: CompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Company> =
            update(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: CompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Company>

        /**
         * Returns a raw HTTP response for `get /companies`, but is otherwise the same as
         * [CompanyService.list].
         */
        @MustBeClosed
        fun list(
            params: CompanyListParams = CompanyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Company>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Company>> =
            list(CompanyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /companies/{company_id}`, but is otherwise the
         * same as [CompanyService.delete].
         */
        @MustBeClosed
        fun delete(
            companyId: String,
            params: CompanyDeleteParams = CompanyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CompanyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(companyId: String, requestOptions: RequestOptions): HttpResponse =
            delete(companyId, CompanyDeleteParams.none(), requestOptions)
    }
}
