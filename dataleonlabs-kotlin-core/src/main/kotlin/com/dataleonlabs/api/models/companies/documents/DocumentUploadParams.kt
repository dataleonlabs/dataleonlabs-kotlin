// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies.documents

import com.dataleonlabs.api.core.Enum
import com.dataleonlabs.api.core.ExcludeMissing
import com.dataleonlabs.api.core.JsonField
import com.dataleonlabs.api.core.JsonValue
import com.dataleonlabs.api.core.MultipartField
import com.dataleonlabs.api.core.Params
import com.dataleonlabs.api.core.checkRequired
import com.dataleonlabs.api.core.http.Headers
import com.dataleonlabs.api.core.http.QueryParams
import com.dataleonlabs.api.core.toImmutable
import com.dataleonlabs.api.errors.DataleonlabsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import kotlin.io.path.inputStream
import kotlin.io.path.name

/** Upload documents to an company */
class DocumentUploadParams
private constructor(
    private val companyId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun companyId(): String? = companyId

    /**
     * Filter by document type for upload (must be one of the allowed values)
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentType(): DocumentType = body.documentType()

    /**
     * File to upload (required)
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun file(): InputStream? = body.file()

    /**
     * URL of the file to upload (either `file` or `url` is required)
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun url(): String? = body.url()

    /**
     * Returns the raw multipart value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _documentType(): MultipartField<DocumentType> = body._documentType()

    /**
     * Returns the raw multipart value of [file].
     *
     * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _file(): MultipartField<InputStream> = body._file()

    /**
     * Returns the raw multipart value of [url].
     *
     * Unlike [url], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _url(): MultipartField<String> = body._url()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentUploadParams].
         *
         * The following fields are required:
         * ```kotlin
         * .documentType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DocumentUploadParams]. */
    class Builder internal constructor() {

        private var companyId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(documentUploadParams: DocumentUploadParams) = apply {
            companyId = documentUploadParams.companyId
            body = documentUploadParams.body.toBuilder()
            additionalHeaders = documentUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentUploadParams.additionalQueryParams.toBuilder()
        }

        fun companyId(companyId: String?) = apply { this.companyId = companyId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [documentType]
         * - [file]
         * - [url]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Filter by document type for upload (must be one of the allowed values) */
        fun documentType(documentType: DocumentType) = apply { body.documentType(documentType) }

        /**
         * Sets [Builder.documentType] to an arbitrary multipart value.
         *
         * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentType(documentType: MultipartField<DocumentType>) = apply {
            body.documentType(documentType)
        }

        /** File to upload (required) */
        fun file(file: InputStream) = apply { body.file(file) }

        /**
         * Sets [Builder.file] to an arbitrary multipart value.
         *
         * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun file(file: MultipartField<InputStream>) = apply { body.file(file) }

        /** File to upload (required) */
        fun file(file: ByteArray) = apply { body.file(file) }

        /** File to upload (required) */
        fun file(path: Path) = apply { body.file(path) }

        /** URL of the file to upload (either `file` or `url` is required) */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary multipart value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: MultipartField<String>) = apply { body.url(url) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [DocumentUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .documentType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentUploadParams =
            DocumentUploadParams(
                companyId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("document_type" to _documentType(), "file" to _file(), "url" to _url()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> companyId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val documentType: MultipartField<DocumentType>,
        private val file: MultipartField<InputStream>,
        private val url: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * Filter by document type for upload (must be one of the allowed values)
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentType(): DocumentType = documentType.value.getRequired("document_type")

        /**
         * File to upload (required)
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun file(): InputStream? = file.value.getNullable("file")

        /**
         * URL of the file to upload (either `file` or `url` is required)
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun url(): String? = url.value.getNullable("url")

        /**
         * Returns the raw multipart value of [documentType].
         *
         * Unlike [documentType], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun _documentType(): MultipartField<DocumentType> = documentType

        /**
         * Returns the raw multipart value of [file].
         *
         * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

        /**
         * Returns the raw multipart value of [url].
         *
         * Unlike [url], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): MultipartField<String> = url

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .documentType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var documentType: MultipartField<DocumentType>? = null
            private var file: MultipartField<InputStream> = MultipartField.of(null)
            private var url: MultipartField<String> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                documentType = body.documentType
                file = body.file
                url = body.url
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Filter by document type for upload (must be one of the allowed values) */
            fun documentType(documentType: DocumentType) =
                documentType(MultipartField.of(documentType))

            /**
             * Sets [Builder.documentType] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentType(documentType: MultipartField<DocumentType>) = apply {
                this.documentType = documentType
            }

            /** File to upload (required) */
            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary multipart value.
             *
             * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            /** File to upload (required) */
            fun file(file: ByteArray) = file(file.inputStream())

            /** File to upload (required) */
            fun file(path: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** URL of the file to upload (either `file` or `url` is required) */
            fun url(url: String) = url(MultipartField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary multipart value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: MultipartField<String>) = apply { this.url = url }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .documentType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("documentType", documentType),
                    file,
                    url,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            documentType().validate()
            file()
            url()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DataleonlabsInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                documentType == other.documentType &&
                file == other.file &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(documentType, file, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{documentType=$documentType, file=$file, url=$url, additionalProperties=$additionalProperties}"
    }

    /** Filter by document type for upload (must be one of the allowed values) */
    class DocumentType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val LIASSE_FISCALE = of("liasse_fiscale")

            val AMORTISED_LOAN_SCHEDULE = of("amortised_loan_schedule")

            val INVOICE = of("invoice")

            val RECEIPT = of("receipt")

            val COMPANY_STATUTS = of("company_statuts")

            val REGISTRATION_COMPANY_CERTIFICATE = of("registration_company_certificate")

            val KBIS = of("kbis")

            val RIB = of("rib")

            val LIVRET_FAMILLE = of("livret_famille")

            val BIRTH_CERTIFICATE = of("birth_certificate")

            val PAYSLIP = of("payslip")

            val SOCIAL_SECURITY_CARD = of("social_security_card")

            val VEHICLE_REGISTRATION_CERTIFICATE = of("vehicle_registration_certificate")

            val CARTE_GRISE = of("carte_grise")

            val CRIMINAL_RECORD_EXTRACT = of("criminal_record_extract")

            val PROOF_OF_ADDRESS = of("proof_of_address")

            val IDENTITY_CARD_FRONT = of("identity_card_front")

            val IDENTITY_CARD_BACK = of("identity_card_back")

            val DRIVER_LICENSE_FRONT = of("driver_license_front")

            val DRIVER_LICENSE_BACK = of("driver_license_back")

            val IDENTITY_DOCUMENT = of("identity_document")

            val DRIVER_LICENSE = of("driver_license")

            val PASSPORT = of("passport")

            val TAX = of("tax")

            val CERTIFICATE_OF_INCORPORATION = of("certificate_of_incorporation")

            val CERTIFICATE_OF_GOOD_STANDING = of("certificate_of_good_standing")

            val LCB_FT_LAB_AML_POLICIES = of("lcb_ft_lab_aml_policies")

            val NIU_ENTREPRISE = of("niu_entreprise")

            val FINANCIAL_STATEMENTS = of("financial_statements")

            val RCCM = of("rccm")

            val PROOF_OF_SOURCE_FUNDS = of("proof_of_source_funds")

            val ORGANIZATIONAL_CHART = of("organizational_chart")

            val RISK_POLICIES = of("risk_policies")

            fun of(value: String) = DocumentType(JsonField.of(value))
        }

        /** An enum containing [DocumentType]'s known values. */
        enum class Known {
            LIASSE_FISCALE,
            AMORTISED_LOAN_SCHEDULE,
            INVOICE,
            RECEIPT,
            COMPANY_STATUTS,
            REGISTRATION_COMPANY_CERTIFICATE,
            KBIS,
            RIB,
            LIVRET_FAMILLE,
            BIRTH_CERTIFICATE,
            PAYSLIP,
            SOCIAL_SECURITY_CARD,
            VEHICLE_REGISTRATION_CERTIFICATE,
            CARTE_GRISE,
            CRIMINAL_RECORD_EXTRACT,
            PROOF_OF_ADDRESS,
            IDENTITY_CARD_FRONT,
            IDENTITY_CARD_BACK,
            DRIVER_LICENSE_FRONT,
            DRIVER_LICENSE_BACK,
            IDENTITY_DOCUMENT,
            DRIVER_LICENSE,
            PASSPORT,
            TAX,
            CERTIFICATE_OF_INCORPORATION,
            CERTIFICATE_OF_GOOD_STANDING,
            LCB_FT_LAB_AML_POLICIES,
            NIU_ENTREPRISE,
            FINANCIAL_STATEMENTS,
            RCCM,
            PROOF_OF_SOURCE_FUNDS,
            ORGANIZATIONAL_CHART,
            RISK_POLICIES,
        }

        /**
         * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DocumentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LIASSE_FISCALE,
            AMORTISED_LOAN_SCHEDULE,
            INVOICE,
            RECEIPT,
            COMPANY_STATUTS,
            REGISTRATION_COMPANY_CERTIFICATE,
            KBIS,
            RIB,
            LIVRET_FAMILLE,
            BIRTH_CERTIFICATE,
            PAYSLIP,
            SOCIAL_SECURITY_CARD,
            VEHICLE_REGISTRATION_CERTIFICATE,
            CARTE_GRISE,
            CRIMINAL_RECORD_EXTRACT,
            PROOF_OF_ADDRESS,
            IDENTITY_CARD_FRONT,
            IDENTITY_CARD_BACK,
            DRIVER_LICENSE_FRONT,
            DRIVER_LICENSE_BACK,
            IDENTITY_DOCUMENT,
            DRIVER_LICENSE,
            PASSPORT,
            TAX,
            CERTIFICATE_OF_INCORPORATION,
            CERTIFICATE_OF_GOOD_STANDING,
            LCB_FT_LAB_AML_POLICIES,
            NIU_ENTREPRISE,
            FINANCIAL_STATEMENTS,
            RCCM,
            PROOF_OF_SOURCE_FUNDS,
            ORGANIZATIONAL_CHART,
            RISK_POLICIES,
            /**
             * An enum member indicating that [DocumentType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LIASSE_FISCALE -> Value.LIASSE_FISCALE
                AMORTISED_LOAN_SCHEDULE -> Value.AMORTISED_LOAN_SCHEDULE
                INVOICE -> Value.INVOICE
                RECEIPT -> Value.RECEIPT
                COMPANY_STATUTS -> Value.COMPANY_STATUTS
                REGISTRATION_COMPANY_CERTIFICATE -> Value.REGISTRATION_COMPANY_CERTIFICATE
                KBIS -> Value.KBIS
                RIB -> Value.RIB
                LIVRET_FAMILLE -> Value.LIVRET_FAMILLE
                BIRTH_CERTIFICATE -> Value.BIRTH_CERTIFICATE
                PAYSLIP -> Value.PAYSLIP
                SOCIAL_SECURITY_CARD -> Value.SOCIAL_SECURITY_CARD
                VEHICLE_REGISTRATION_CERTIFICATE -> Value.VEHICLE_REGISTRATION_CERTIFICATE
                CARTE_GRISE -> Value.CARTE_GRISE
                CRIMINAL_RECORD_EXTRACT -> Value.CRIMINAL_RECORD_EXTRACT
                PROOF_OF_ADDRESS -> Value.PROOF_OF_ADDRESS
                IDENTITY_CARD_FRONT -> Value.IDENTITY_CARD_FRONT
                IDENTITY_CARD_BACK -> Value.IDENTITY_CARD_BACK
                DRIVER_LICENSE_FRONT -> Value.DRIVER_LICENSE_FRONT
                DRIVER_LICENSE_BACK -> Value.DRIVER_LICENSE_BACK
                IDENTITY_DOCUMENT -> Value.IDENTITY_DOCUMENT
                DRIVER_LICENSE -> Value.DRIVER_LICENSE
                PASSPORT -> Value.PASSPORT
                TAX -> Value.TAX
                CERTIFICATE_OF_INCORPORATION -> Value.CERTIFICATE_OF_INCORPORATION
                CERTIFICATE_OF_GOOD_STANDING -> Value.CERTIFICATE_OF_GOOD_STANDING
                LCB_FT_LAB_AML_POLICIES -> Value.LCB_FT_LAB_AML_POLICIES
                NIU_ENTREPRISE -> Value.NIU_ENTREPRISE
                FINANCIAL_STATEMENTS -> Value.FINANCIAL_STATEMENTS
                RCCM -> Value.RCCM
                PROOF_OF_SOURCE_FUNDS -> Value.PROOF_OF_SOURCE_FUNDS
                ORGANIZATIONAL_CHART -> Value.ORGANIZATIONAL_CHART
                RISK_POLICIES -> Value.RISK_POLICIES
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DataleonlabsInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LIASSE_FISCALE -> Known.LIASSE_FISCALE
                AMORTISED_LOAN_SCHEDULE -> Known.AMORTISED_LOAN_SCHEDULE
                INVOICE -> Known.INVOICE
                RECEIPT -> Known.RECEIPT
                COMPANY_STATUTS -> Known.COMPANY_STATUTS
                REGISTRATION_COMPANY_CERTIFICATE -> Known.REGISTRATION_COMPANY_CERTIFICATE
                KBIS -> Known.KBIS
                RIB -> Known.RIB
                LIVRET_FAMILLE -> Known.LIVRET_FAMILLE
                BIRTH_CERTIFICATE -> Known.BIRTH_CERTIFICATE
                PAYSLIP -> Known.PAYSLIP
                SOCIAL_SECURITY_CARD -> Known.SOCIAL_SECURITY_CARD
                VEHICLE_REGISTRATION_CERTIFICATE -> Known.VEHICLE_REGISTRATION_CERTIFICATE
                CARTE_GRISE -> Known.CARTE_GRISE
                CRIMINAL_RECORD_EXTRACT -> Known.CRIMINAL_RECORD_EXTRACT
                PROOF_OF_ADDRESS -> Known.PROOF_OF_ADDRESS
                IDENTITY_CARD_FRONT -> Known.IDENTITY_CARD_FRONT
                IDENTITY_CARD_BACK -> Known.IDENTITY_CARD_BACK
                DRIVER_LICENSE_FRONT -> Known.DRIVER_LICENSE_FRONT
                DRIVER_LICENSE_BACK -> Known.DRIVER_LICENSE_BACK
                IDENTITY_DOCUMENT -> Known.IDENTITY_DOCUMENT
                DRIVER_LICENSE -> Known.DRIVER_LICENSE
                PASSPORT -> Known.PASSPORT
                TAX -> Known.TAX
                CERTIFICATE_OF_INCORPORATION -> Known.CERTIFICATE_OF_INCORPORATION
                CERTIFICATE_OF_GOOD_STANDING -> Known.CERTIFICATE_OF_GOOD_STANDING
                LCB_FT_LAB_AML_POLICIES -> Known.LCB_FT_LAB_AML_POLICIES
                NIU_ENTREPRISE -> Known.NIU_ENTREPRISE
                FINANCIAL_STATEMENTS -> Known.FINANCIAL_STATEMENTS
                RCCM -> Known.RCCM
                PROOF_OF_SOURCE_FUNDS -> Known.PROOF_OF_SOURCE_FUNDS
                ORGANIZATIONAL_CHART -> Known.ORGANIZATIONAL_CHART
                RISK_POLICIES -> Known.RISK_POLICIES
                else -> throw DataleonlabsInvalidDataException("Unknown DocumentType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DataleonlabsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DataleonlabsInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): DocumentType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DataleonlabsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DocumentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentUploadParams &&
            companyId == other.companyId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(companyId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DocumentUploadParams{companyId=$companyId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
