// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies

import com.dataleonlabs.api.core.Enum
import com.dataleonlabs.api.core.ExcludeMissing
import com.dataleonlabs.api.core.JsonField
import com.dataleonlabs.api.core.JsonMissing
import com.dataleonlabs.api.core.JsonValue
import com.dataleonlabs.api.core.checkKnown
import com.dataleonlabs.api.core.toImmutable
import com.dataleonlabs.api.errors.DataleonlabsInvalidDataException
import com.dataleonlabs.api.models.companies.documents.GenericDocument
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Company
private constructor(
    private val amlSuspicions: JsonField<List<AmlSuspicion>>,
    private val certificat: JsonField<Certificat>,
    private val checks: JsonField<List<Check>>,
    private val company: JsonField<InnerCompany>,
    private val documents: JsonField<List<GenericDocument>>,
    private val members: JsonField<List<Member>>,
    private val portalUrl: JsonField<String>,
    private val properties: JsonField<List<Property>>,
    private val risk: JsonField<Risk>,
    private val sourceId: JsonField<String>,
    private val technicalData: JsonField<TechnicalData>,
    private val webviewUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("aml_suspicions")
        @ExcludeMissing
        amlSuspicions: JsonField<List<AmlSuspicion>> = JsonMissing.of(),
        @JsonProperty("certificat")
        @ExcludeMissing
        certificat: JsonField<Certificat> = JsonMissing.of(),
        @JsonProperty("checks") @ExcludeMissing checks: JsonField<List<Check>> = JsonMissing.of(),
        @JsonProperty("company")
        @ExcludeMissing
        company: JsonField<InnerCompany> = JsonMissing.of(),
        @JsonProperty("documents")
        @ExcludeMissing
        documents: JsonField<List<GenericDocument>> = JsonMissing.of(),
        @JsonProperty("members")
        @ExcludeMissing
        members: JsonField<List<Member>> = JsonMissing.of(),
        @JsonProperty("portal_url") @ExcludeMissing portalUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<Property>> = JsonMissing.of(),
        @JsonProperty("risk") @ExcludeMissing risk: JsonField<Risk> = JsonMissing.of(),
        @JsonProperty("source_id") @ExcludeMissing sourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("technical_data")
        @ExcludeMissing
        technicalData: JsonField<TechnicalData> = JsonMissing.of(),
        @JsonProperty("webview_url")
        @ExcludeMissing
        webviewUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        amlSuspicions,
        certificat,
        checks,
        company,
        documents,
        members,
        portalUrl,
        properties,
        risk,
        sourceId,
        technicalData,
        webviewUrl,
        mutableMapOf(),
    )

    /**
     * List of AML (Anti-Money Laundering) suspicion entries linked to the company, including their
     * details.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amlSuspicions(): List<AmlSuspicion>? = amlSuspicions.getNullable("aml_suspicions")

    /**
     * Digital certificate associated with the company, if any, including its creation timestamp and
     * filename.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun certificat(): Certificat? = certificat.getNullable("certificat")

    /**
     * List of verification or validation checks applied to the company, including their results and
     * messages.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun checks(): List<Check>? = checks.getNullable("checks")

    /**
     * Main information about the company being registered, including legal name, registration ID,
     * and address.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun company(): InnerCompany? = company.getNullable("company")

    /**
     * All documents submitted or associated with the company, including their metadata and
     * processing status.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documents(): List<GenericDocument>? = documents.getNullable("documents")

    /**
     * List of members or actors associated with the company, including personal and ownership
     * information.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun members(): List<Member>? = members.getNullable("members")

    /**
     * Admin or internal portal URL for viewing the company's details, typically used by internal
     * users.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun portalUrl(): String? = portalUrl.getNullable("portal_url")

    /**
     * Custom key-value metadata fields associated with the company, allowing for flexible data
     * storage.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun properties(): List<Property>? = properties.getNullable("properties")

    /**
     * Risk assessment associated with the company, including a risk code, reason, and confidence
     * score.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun risk(): Risk? = risk.getNullable("risk")

    /**
     * Optional identifier indicating the source of the company record, useful for tracking or
     * integration purposes.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sourceId(): String? = sourceId.getNullable("source_id")

    /**
     * Technical metadata related to the request, such as IP address, QR code settings, and callback
     * URLs.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun technicalData(): TechnicalData? = technicalData.getNullable("technical_data")

    /**
     * Public-facing webview URL for the company’s identification process, allowing external access
     * to the company data.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun webviewUrl(): String? = webviewUrl.getNullable("webview_url")

    /**
     * Returns the raw JSON value of [amlSuspicions].
     *
     * Unlike [amlSuspicions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aml_suspicions")
    @ExcludeMissing
    fun _amlSuspicions(): JsonField<List<AmlSuspicion>> = amlSuspicions

    /**
     * Returns the raw JSON value of [certificat].
     *
     * Unlike [certificat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("certificat")
    @ExcludeMissing
    fun _certificat(): JsonField<Certificat> = certificat

    /**
     * Returns the raw JSON value of [checks].
     *
     * Unlike [checks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("checks") @ExcludeMissing fun _checks(): JsonField<List<Check>> = checks

    /**
     * Returns the raw JSON value of [company].
     *
     * Unlike [company], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company") @ExcludeMissing fun _company(): JsonField<InnerCompany> = company

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documents")
    @ExcludeMissing
    fun _documents(): JsonField<List<GenericDocument>> = documents

    /**
     * Returns the raw JSON value of [members].
     *
     * Unlike [members], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("members") @ExcludeMissing fun _members(): JsonField<List<Member>> = members

    /**
     * Returns the raw JSON value of [portalUrl].
     *
     * Unlike [portalUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portal_url") @ExcludeMissing fun _portalUrl(): JsonField<String> = portalUrl

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<List<Property>> = properties

    /**
     * Returns the raw JSON value of [risk].
     *
     * Unlike [risk], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("risk") @ExcludeMissing fun _risk(): JsonField<Risk> = risk

    /**
     * Returns the raw JSON value of [sourceId].
     *
     * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

    /**
     * Returns the raw JSON value of [technicalData].
     *
     * Unlike [technicalData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("technical_data")
    @ExcludeMissing
    fun _technicalData(): JsonField<TechnicalData> = technicalData

    /**
     * Returns the raw JSON value of [webviewUrl].
     *
     * Unlike [webviewUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webview_url") @ExcludeMissing fun _webviewUrl(): JsonField<String> = webviewUrl

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

        /** Returns a mutable builder for constructing an instance of [Company]. */
        fun builder() = Builder()
    }

    /** A builder for [Company]. */
    class Builder internal constructor() {

        private var amlSuspicions: JsonField<MutableList<AmlSuspicion>>? = null
        private var certificat: JsonField<Certificat> = JsonMissing.of()
        private var checks: JsonField<MutableList<Check>>? = null
        private var company: JsonField<InnerCompany> = JsonMissing.of()
        private var documents: JsonField<MutableList<GenericDocument>>? = null
        private var members: JsonField<MutableList<Member>>? = null
        private var portalUrl: JsonField<String> = JsonMissing.of()
        private var properties: JsonField<MutableList<Property>>? = null
        private var risk: JsonField<Risk> = JsonMissing.of()
        private var sourceId: JsonField<String> = JsonMissing.of()
        private var technicalData: JsonField<TechnicalData> = JsonMissing.of()
        private var webviewUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(company: Company) = apply {
            amlSuspicions = company.amlSuspicions.map { it.toMutableList() }
            certificat = company.certificat
            checks = company.checks.map { it.toMutableList() }
            this.company = company.company
            documents = company.documents.map { it.toMutableList() }
            members = company.members.map { it.toMutableList() }
            portalUrl = company.portalUrl
            properties = company.properties.map { it.toMutableList() }
            risk = company.risk
            sourceId = company.sourceId
            technicalData = company.technicalData
            webviewUrl = company.webviewUrl
            additionalProperties = company.additionalProperties.toMutableMap()
        }

        /**
         * List of AML (Anti-Money Laundering) suspicion entries linked to the company, including
         * their details.
         */
        fun amlSuspicions(amlSuspicions: List<AmlSuspicion>) =
            amlSuspicions(JsonField.of(amlSuspicions))

        /**
         * Sets [Builder.amlSuspicions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amlSuspicions] with a well-typed `List<AmlSuspicion>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun amlSuspicions(amlSuspicions: JsonField<List<AmlSuspicion>>) = apply {
            this.amlSuspicions = amlSuspicions.map { it.toMutableList() }
        }

        /**
         * Adds a single [AmlSuspicion] to [amlSuspicions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAmlSuspicion(amlSuspicion: AmlSuspicion) = apply {
            amlSuspicions =
                (amlSuspicions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("amlSuspicions", it).add(amlSuspicion)
                }
        }

        /**
         * Digital certificate associated with the company, if any, including its creation timestamp
         * and filename.
         */
        fun certificat(certificat: Certificat) = certificat(JsonField.of(certificat))

        /**
         * Sets [Builder.certificat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certificat] with a well-typed [Certificat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun certificat(certificat: JsonField<Certificat>) = apply { this.certificat = certificat }

        /**
         * List of verification or validation checks applied to the company, including their results
         * and messages.
         */
        fun checks(checks: List<Check>) = checks(JsonField.of(checks))

        /**
         * Sets [Builder.checks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checks] with a well-typed `List<Check>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun checks(checks: JsonField<List<Check>>) = apply {
            this.checks = checks.map { it.toMutableList() }
        }

        /**
         * Adds a single [Check] to [checks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCheck(check: Check) = apply {
            checks =
                (checks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("checks", it).add(check)
                }
        }

        /**
         * Main information about the company being registered, including legal name, registration
         * ID, and address.
         */
        fun company(company: InnerCompany) = company(JsonField.of(company))

        /**
         * Sets [Builder.company] to an arbitrary JSON value.
         *
         * You should usually call [Builder.company] with a well-typed [InnerCompany] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun company(company: JsonField<InnerCompany>) = apply { this.company = company }

        /**
         * All documents submitted or associated with the company, including their metadata and
         * processing status.
         */
        fun documents(documents: List<GenericDocument>) = documents(JsonField.of(documents))

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed `List<GenericDocument>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documents(documents: JsonField<List<GenericDocument>>) = apply {
            this.documents = documents.map { it.toMutableList() }
        }

        /**
         * Adds a single [GenericDocument] to [documents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocument(document: GenericDocument) = apply {
            documents =
                (documents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documents", it).add(document)
                }
        }

        /**
         * List of members or actors associated with the company, including personal and ownership
         * information.
         */
        fun members(members: List<Member>) = members(JsonField.of(members))

        /**
         * Sets [Builder.members] to an arbitrary JSON value.
         *
         * You should usually call [Builder.members] with a well-typed `List<Member>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun members(members: JsonField<List<Member>>) = apply {
            this.members = members.map { it.toMutableList() }
        }

        /**
         * Adds a single [Member] to [members].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMember(member: Member) = apply {
            members =
                (members ?: JsonField.of(mutableListOf())).also {
                    checkKnown("members", it).add(member)
                }
        }

        /**
         * Admin or internal portal URL for viewing the company's details, typically used by
         * internal users.
         */
        fun portalUrl(portalUrl: String) = portalUrl(JsonField.of(portalUrl))

        /**
         * Sets [Builder.portalUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun portalUrl(portalUrl: JsonField<String>) = apply { this.portalUrl = portalUrl }

        /**
         * Custom key-value metadata fields associated with the company, allowing for flexible data
         * storage.
         */
        fun properties(properties: List<Property>) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed `List<Property>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<List<Property>>) = apply {
            this.properties = properties.map { it.toMutableList() }
        }

        /**
         * Adds a single [Property] to [properties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProperty(property: Property) = apply {
            properties =
                (properties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("properties", it).add(property)
                }
        }

        /**
         * Risk assessment associated with the company, including a risk code, reason, and
         * confidence score.
         */
        fun risk(risk: Risk) = risk(JsonField.of(risk))

        /**
         * Sets [Builder.risk] to an arbitrary JSON value.
         *
         * You should usually call [Builder.risk] with a well-typed [Risk] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun risk(risk: JsonField<Risk>) = apply { this.risk = risk }

        /**
         * Optional identifier indicating the source of the company record, useful for tracking or
         * integration purposes.
         */
        fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

        /**
         * Technical metadata related to the request, such as IP address, QR code settings, and
         * callback URLs.
         */
        fun technicalData(technicalData: TechnicalData) = technicalData(JsonField.of(technicalData))

        /**
         * Sets [Builder.technicalData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.technicalData] with a well-typed [TechnicalData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun technicalData(technicalData: JsonField<TechnicalData>) = apply {
            this.technicalData = technicalData
        }

        /**
         * Public-facing webview URL for the company’s identification process, allowing external
         * access to the company data.
         */
        fun webviewUrl(webviewUrl: String) = webviewUrl(JsonField.of(webviewUrl))

        /**
         * Sets [Builder.webviewUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webviewUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webviewUrl(webviewUrl: JsonField<String>) = apply { this.webviewUrl = webviewUrl }

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
         * Returns an immutable instance of [Company].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Company =
            Company(
                (amlSuspicions ?: JsonMissing.of()).map { it.toImmutable() },
                certificat,
                (checks ?: JsonMissing.of()).map { it.toImmutable() },
                company,
                (documents ?: JsonMissing.of()).map { it.toImmutable() },
                (members ?: JsonMissing.of()).map { it.toImmutable() },
                portalUrl,
                (properties ?: JsonMissing.of()).map { it.toImmutable() },
                risk,
                sourceId,
                technicalData,
                webviewUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Company = apply {
        if (validated) {
            return@apply
        }

        amlSuspicions()?.forEach { it.validate() }
        certificat()?.validate()
        checks()?.forEach { it.validate() }
        company()?.validate()
        documents()?.forEach { it.validate() }
        members()?.forEach { it.validate() }
        portalUrl()
        properties()?.forEach { it.validate() }
        risk()?.validate()
        sourceId()
        technicalData()?.validate()
        webviewUrl()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (amlSuspicions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (certificat.asKnown()?.validity() ?: 0) +
            (checks.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (company.asKnown()?.validity() ?: 0) +
            (documents.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (members.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (portalUrl.asKnown() == null) 0 else 1) +
            (properties.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (risk.asKnown()?.validity() ?: 0) +
            (if (sourceId.asKnown() == null) 0 else 1) +
            (technicalData.asKnown()?.validity() ?: 0) +
            (if (webviewUrl.asKnown() == null) 0 else 1)

    /**
     * Main information about the company being registered, including legal name, registration ID,
     * and address.
     */
    class InnerCompany
    private constructor(
        private val address: JsonField<String>,
        private val closureDate: JsonField<LocalDate>,
        private val commercialName: JsonField<String>,
        private val contact: JsonField<Contact>,
        private val country: JsonField<String>,
        private val email: JsonField<String>,
        private val employees: JsonField<Long>,
        private val employerIdentificationNumber: JsonField<String>,
        private val insolvencyExists: JsonField<Boolean>,
        private val insolvencyOngoing: JsonField<Boolean>,
        private val legalForm: JsonField<String>,
        private val name: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val registrationDate: JsonField<LocalDate>,
        private val registrationId: JsonField<String>,
        private val shareCapital: JsonField<String>,
        private val status: JsonField<String>,
        private val taxIdentificationNumber: JsonField<String>,
        private val type: JsonField<String>,
        private val websiteUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
            @JsonProperty("closure_date")
            @ExcludeMissing
            closureDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("commercial_name")
            @ExcludeMissing
            commercialName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contact") @ExcludeMissing contact: JsonField<Contact> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("employees")
            @ExcludeMissing
            employees: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("employer_identification_number")
            @ExcludeMissing
            employerIdentificationNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("insolvency_exists")
            @ExcludeMissing
            insolvencyExists: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("insolvency_ongoing")
            @ExcludeMissing
            insolvencyOngoing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("legal_form")
            @ExcludeMissing
            legalForm: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registration_date")
            @ExcludeMissing
            registrationDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("registration_id")
            @ExcludeMissing
            registrationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("share_capital")
            @ExcludeMissing
            shareCapital: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_identification_number")
            @ExcludeMissing
            taxIdentificationNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("website_url")
            @ExcludeMissing
            websiteUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            address,
            closureDate,
            commercialName,
            contact,
            country,
            email,
            employees,
            employerIdentificationNumber,
            insolvencyExists,
            insolvencyOngoing,
            legalForm,
            name,
            phoneNumber,
            registrationDate,
            registrationId,
            shareCapital,
            status,
            taxIdentificationNumber,
            type,
            websiteUrl,
            mutableMapOf(),
        )

        /**
         * Full registered address of the company.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun address(): String? = address.getNullable("address")

        /**
         * Closure date of the company, if applicable.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun closureDate(): LocalDate? = closureDate.getNullable("closure_date")

        /**
         * Trade or commercial name of the company.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun commercialName(): String? = commercialName.getNullable("commercial_name")

        /**
         * Contact information for the company, including email, phone number, and address.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun contact(): Contact? = contact.getNullable("contact")

        /**
         * Country code where the company is registered.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun country(): String? = country.getNullable("country")

        /**
         * Contact email address for the company.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun email(): String? = email.getNullable("email")

        /**
         * Number of employees in the company.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun employees(): Long? = employees.getNullable("employees")

        /**
         * Employer Identification Number (EIN) or equivalent.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun employerIdentificationNumber(): String? =
            employerIdentificationNumber.getNullable("employer_identification_number")

        /**
         * Indicates whether an insolvency procedure exists for the company.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun insolvencyExists(): Boolean? = insolvencyExists.getNullable("insolvency_exists")

        /**
         * Indicates whether an insolvency procedure is ongoing for the company.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun insolvencyOngoing(): Boolean? = insolvencyOngoing.getNullable("insolvency_ongoing")

        /**
         * Legal form or structure of the company (e.g., LLC, SARL).
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun legalForm(): String? = legalForm.getNullable("legal_form")

        /**
         * Legal registered name of the company.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Contact phone number for the company, including country code.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

        /**
         * Date when the company was officially registered.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun registrationDate(): LocalDate? = registrationDate.getNullable("registration_date")

        /**
         * Official company registration number or ID.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun registrationId(): String? = registrationId.getNullable("registration_id")

        /**
         * Total share capital of the company, including currency.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun shareCapital(): String? = shareCapital.getNullable("share_capital")

        /**
         * Current status of the company (e.g., active, inactive).
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): String? = status.getNullable("status")

        /**
         * Tax identification number for the company.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxIdentificationNumber(): String? =
            taxIdentificationNumber.getNullable("tax_identification_number")

        /**
         * Type of company within the workspace, e.g., main or affiliated.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): String? = type.getNullable("type")

        /**
         * Official website URL of the company.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun websiteUrl(): String? = websiteUrl.getNullable("website_url")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

        /**
         * Returns the raw JSON value of [closureDate].
         *
         * Unlike [closureDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("closure_date")
        @ExcludeMissing
        fun _closureDate(): JsonField<LocalDate> = closureDate

        /**
         * Returns the raw JSON value of [commercialName].
         *
         * Unlike [commercialName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("commercial_name")
        @ExcludeMissing
        fun _commercialName(): JsonField<String> = commercialName

        /**
         * Returns the raw JSON value of [contact].
         *
         * Unlike [contact], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contact") @ExcludeMissing fun _contact(): JsonField<Contact> = contact

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [employees].
         *
         * Unlike [employees], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("employees") @ExcludeMissing fun _employees(): JsonField<Long> = employees

        /**
         * Returns the raw JSON value of [employerIdentificationNumber].
         *
         * Unlike [employerIdentificationNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("employer_identification_number")
        @ExcludeMissing
        fun _employerIdentificationNumber(): JsonField<String> = employerIdentificationNumber

        /**
         * Returns the raw JSON value of [insolvencyExists].
         *
         * Unlike [insolvencyExists], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("insolvency_exists")
        @ExcludeMissing
        fun _insolvencyExists(): JsonField<Boolean> = insolvencyExists

        /**
         * Returns the raw JSON value of [insolvencyOngoing].
         *
         * Unlike [insolvencyOngoing], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("insolvency_ongoing")
        @ExcludeMissing
        fun _insolvencyOngoing(): JsonField<Boolean> = insolvencyOngoing

        /**
         * Returns the raw JSON value of [legalForm].
         *
         * Unlike [legalForm], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("legal_form") @ExcludeMissing fun _legalForm(): JsonField<String> = legalForm

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [registrationDate].
         *
         * Unlike [registrationDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("registration_date")
        @ExcludeMissing
        fun _registrationDate(): JsonField<LocalDate> = registrationDate

        /**
         * Returns the raw JSON value of [registrationId].
         *
         * Unlike [registrationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("registration_id")
        @ExcludeMissing
        fun _registrationId(): JsonField<String> = registrationId

        /**
         * Returns the raw JSON value of [shareCapital].
         *
         * Unlike [shareCapital], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("share_capital")
        @ExcludeMissing
        fun _shareCapital(): JsonField<String> = shareCapital

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [taxIdentificationNumber].
         *
         * Unlike [taxIdentificationNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("tax_identification_number")
        @ExcludeMissing
        fun _taxIdentificationNumber(): JsonField<String> = taxIdentificationNumber

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [websiteUrl].
         *
         * Unlike [websiteUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("website_url")
        @ExcludeMissing
        fun _websiteUrl(): JsonField<String> = websiteUrl

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

            /** Returns a mutable builder for constructing an instance of [InnerCompany]. */
            fun builder() = Builder()
        }

        /** A builder for [InnerCompany]. */
        class Builder internal constructor() {

            private var address: JsonField<String> = JsonMissing.of()
            private var closureDate: JsonField<LocalDate> = JsonMissing.of()
            private var commercialName: JsonField<String> = JsonMissing.of()
            private var contact: JsonField<Contact> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var employees: JsonField<Long> = JsonMissing.of()
            private var employerIdentificationNumber: JsonField<String> = JsonMissing.of()
            private var insolvencyExists: JsonField<Boolean> = JsonMissing.of()
            private var insolvencyOngoing: JsonField<Boolean> = JsonMissing.of()
            private var legalForm: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var registrationDate: JsonField<LocalDate> = JsonMissing.of()
            private var registrationId: JsonField<String> = JsonMissing.of()
            private var shareCapital: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var taxIdentificationNumber: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var websiteUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(innerCompany: InnerCompany) = apply {
                address = innerCompany.address
                closureDate = innerCompany.closureDate
                commercialName = innerCompany.commercialName
                contact = innerCompany.contact
                country = innerCompany.country
                email = innerCompany.email
                employees = innerCompany.employees
                employerIdentificationNumber = innerCompany.employerIdentificationNumber
                insolvencyExists = innerCompany.insolvencyExists
                insolvencyOngoing = innerCompany.insolvencyOngoing
                legalForm = innerCompany.legalForm
                name = innerCompany.name
                phoneNumber = innerCompany.phoneNumber
                registrationDate = innerCompany.registrationDate
                registrationId = innerCompany.registrationId
                shareCapital = innerCompany.shareCapital
                status = innerCompany.status
                taxIdentificationNumber = innerCompany.taxIdentificationNumber
                type = innerCompany.type
                websiteUrl = innerCompany.websiteUrl
                additionalProperties = innerCompany.additionalProperties.toMutableMap()
            }

            /** Full registered address of the company. */
            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            /** Closure date of the company, if applicable. */
            fun closureDate(closureDate: LocalDate) = closureDate(JsonField.of(closureDate))

            /**
             * Sets [Builder.closureDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.closureDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun closureDate(closureDate: JsonField<LocalDate>) = apply {
                this.closureDate = closureDate
            }

            /** Trade or commercial name of the company. */
            fun commercialName(commercialName: String) =
                commercialName(JsonField.of(commercialName))

            /**
             * Sets [Builder.commercialName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commercialName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commercialName(commercialName: JsonField<String>) = apply {
                this.commercialName = commercialName
            }

            /** Contact information for the company, including email, phone number, and address. */
            fun contact(contact: Contact) = contact(JsonField.of(contact))

            /**
             * Sets [Builder.contact] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contact] with a well-typed [Contact] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contact(contact: JsonField<Contact>) = apply { this.contact = contact }

            /** Country code where the company is registered. */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** Contact email address for the company. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Number of employees in the company. */
            fun employees(employees: Long) = employees(JsonField.of(employees))

            /**
             * Sets [Builder.employees] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employees] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun employees(employees: JsonField<Long>) = apply { this.employees = employees }

            /** Employer Identification Number (EIN) or equivalent. */
            fun employerIdentificationNumber(employerIdentificationNumber: String) =
                employerIdentificationNumber(JsonField.of(employerIdentificationNumber))

            /**
             * Sets [Builder.employerIdentificationNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employerIdentificationNumber] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun employerIdentificationNumber(employerIdentificationNumber: JsonField<String>) =
                apply {
                    this.employerIdentificationNumber = employerIdentificationNumber
                }

            /** Indicates whether an insolvency procedure exists for the company. */
            fun insolvencyExists(insolvencyExists: Boolean) =
                insolvencyExists(JsonField.of(insolvencyExists))

            /**
             * Sets [Builder.insolvencyExists] to an arbitrary JSON value.
             *
             * You should usually call [Builder.insolvencyExists] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun insolvencyExists(insolvencyExists: JsonField<Boolean>) = apply {
                this.insolvencyExists = insolvencyExists
            }

            /** Indicates whether an insolvency procedure is ongoing for the company. */
            fun insolvencyOngoing(insolvencyOngoing: Boolean) =
                insolvencyOngoing(JsonField.of(insolvencyOngoing))

            /**
             * Sets [Builder.insolvencyOngoing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.insolvencyOngoing] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun insolvencyOngoing(insolvencyOngoing: JsonField<Boolean>) = apply {
                this.insolvencyOngoing = insolvencyOngoing
            }

            /** Legal form or structure of the company (e.g., LLC, SARL). */
            fun legalForm(legalForm: String) = legalForm(JsonField.of(legalForm))

            /**
             * Sets [Builder.legalForm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalForm] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legalForm(legalForm: JsonField<String>) = apply { this.legalForm = legalForm }

            /** Legal registered name of the company. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Contact phone number for the company, including country code. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Date when the company was officially registered. */
            fun registrationDate(registrationDate: LocalDate) =
                registrationDate(JsonField.of(registrationDate))

            /**
             * Sets [Builder.registrationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registrationDate] with a well-typed [LocalDate]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun registrationDate(registrationDate: JsonField<LocalDate>) = apply {
                this.registrationDate = registrationDate
            }

            /** Official company registration number or ID. */
            fun registrationId(registrationId: String) =
                registrationId(JsonField.of(registrationId))

            /**
             * Sets [Builder.registrationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registrationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registrationId(registrationId: JsonField<String>) = apply {
                this.registrationId = registrationId
            }

            /** Total share capital of the company, including currency. */
            fun shareCapital(shareCapital: String) = shareCapital(JsonField.of(shareCapital))

            /**
             * Sets [Builder.shareCapital] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shareCapital] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shareCapital(shareCapital: JsonField<String>) = apply {
                this.shareCapital = shareCapital
            }

            /** Current status of the company (e.g., active, inactive). */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** Tax identification number for the company. */
            fun taxIdentificationNumber(taxIdentificationNumber: String) =
                taxIdentificationNumber(JsonField.of(taxIdentificationNumber))

            /**
             * Sets [Builder.taxIdentificationNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxIdentificationNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun taxIdentificationNumber(taxIdentificationNumber: JsonField<String>) = apply {
                this.taxIdentificationNumber = taxIdentificationNumber
            }

            /** Type of company within the workspace, e.g., main or affiliated. */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** Official website URL of the company. */
            fun websiteUrl(websiteUrl: String) = websiteUrl(JsonField.of(websiteUrl))

            /**
             * Sets [Builder.websiteUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.websiteUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun websiteUrl(websiteUrl: JsonField<String>) = apply { this.websiteUrl = websiteUrl }

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
             * Returns an immutable instance of [InnerCompany].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InnerCompany =
                InnerCompany(
                    address,
                    closureDate,
                    commercialName,
                    contact,
                    country,
                    email,
                    employees,
                    employerIdentificationNumber,
                    insolvencyExists,
                    insolvencyOngoing,
                    legalForm,
                    name,
                    phoneNumber,
                    registrationDate,
                    registrationId,
                    shareCapital,
                    status,
                    taxIdentificationNumber,
                    type,
                    websiteUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InnerCompany = apply {
            if (validated) {
                return@apply
            }

            address()
            closureDate()
            commercialName()
            contact()?.validate()
            country()
            email()
            employees()
            employerIdentificationNumber()
            insolvencyExists()
            insolvencyOngoing()
            legalForm()
            name()
            phoneNumber()
            registrationDate()
            registrationId()
            shareCapital()
            status()
            taxIdentificationNumber()
            type()
            websiteUrl()
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
        internal fun validity(): Int =
            (if (address.asKnown() == null) 0 else 1) +
                (if (closureDate.asKnown() == null) 0 else 1) +
                (if (commercialName.asKnown() == null) 0 else 1) +
                (contact.asKnown()?.validity() ?: 0) +
                (if (country.asKnown() == null) 0 else 1) +
                (if (email.asKnown() == null) 0 else 1) +
                (if (employees.asKnown() == null) 0 else 1) +
                (if (employerIdentificationNumber.asKnown() == null) 0 else 1) +
                (if (insolvencyExists.asKnown() == null) 0 else 1) +
                (if (insolvencyOngoing.asKnown() == null) 0 else 1) +
                (if (legalForm.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (if (registrationDate.asKnown() == null) 0 else 1) +
                (if (registrationId.asKnown() == null) 0 else 1) +
                (if (shareCapital.asKnown() == null) 0 else 1) +
                (if (status.asKnown() == null) 0 else 1) +
                (if (taxIdentificationNumber.asKnown() == null) 0 else 1) +
                (if (type.asKnown() == null) 0 else 1) +
                (if (websiteUrl.asKnown() == null) 0 else 1)

        /** Contact information for the company, including email, phone number, and address. */
        class Contact
        private constructor(
            private val department: JsonField<String>,
            private val email: JsonField<String>,
            private val firstName: JsonField<String>,
            private val lastName: JsonField<String>,
            private val phoneNumber: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("department")
                @ExcludeMissing
                department: JsonField<String> = JsonMissing.of(),
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("first_name")
                @ExcludeMissing
                firstName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("last_name")
                @ExcludeMissing
                lastName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone_number")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
            ) : this(department, email, firstName, lastName, phoneNumber, mutableMapOf())

            /**
             * Department of the contact person.
             *
             * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun department(): String? = department.getNullable("department")

            /**
             * Email address of the contact person.
             *
             * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun email(): String? = email.getNullable("email")

            /**
             * First name of the contact person.
             *
             * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun firstName(): String? = firstName.getNullable("first_name")

            /**
             * Last name of the contact person.
             *
             * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lastName(): String? = lastName.getNullable("last_name")

            /**
             * Phone number of the contact person.
             *
             * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

            /**
             * Returns the raw JSON value of [department].
             *
             * Unlike [department], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("department")
            @ExcludeMissing
            fun _department(): JsonField<String> = department

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * Returns the raw JSON value of [firstName].
             *
             * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("first_name")
            @ExcludeMissing
            fun _firstName(): JsonField<String> = firstName

            /**
             * Returns the raw JSON value of [lastName].
             *
             * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

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

                /** Returns a mutable builder for constructing an instance of [Contact]. */
                fun builder() = Builder()
            }

            /** A builder for [Contact]. */
            class Builder internal constructor() {

                private var department: JsonField<String> = JsonMissing.of()
                private var email: JsonField<String> = JsonMissing.of()
                private var firstName: JsonField<String> = JsonMissing.of()
                private var lastName: JsonField<String> = JsonMissing.of()
                private var phoneNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(contact: Contact) = apply {
                    department = contact.department
                    email = contact.email
                    firstName = contact.firstName
                    lastName = contact.lastName
                    phoneNumber = contact.phoneNumber
                    additionalProperties = contact.additionalProperties.toMutableMap()
                }

                /** Department of the contact person. */
                fun department(department: String) = department(JsonField.of(department))

                /**
                 * Sets [Builder.department] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.department] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun department(department: JsonField<String>) = apply {
                    this.department = department
                }

                /** Email address of the contact person. */
                fun email(email: String) = email(JsonField.of(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                /** First name of the contact person. */
                fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                /**
                 * Sets [Builder.firstName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.firstName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

                /** Last name of the contact person. */
                fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                /**
                 * Sets [Builder.lastName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                /** Phone number of the contact person. */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Contact].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Contact =
                    Contact(
                        department,
                        email,
                        firstName,
                        lastName,
                        phoneNumber,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Contact = apply {
                if (validated) {
                    return@apply
                }

                department()
                email()
                firstName()
                lastName()
                phoneNumber()
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
            internal fun validity(): Int =
                (if (department.asKnown() == null) 0 else 1) +
                    (if (email.asKnown() == null) 0 else 1) +
                    (if (firstName.asKnown() == null) 0 else 1) +
                    (if (lastName.asKnown() == null) 0 else 1) +
                    (if (phoneNumber.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Contact &&
                    department == other.department &&
                    email == other.email &&
                    firstName == other.firstName &&
                    lastName == other.lastName &&
                    phoneNumber == other.phoneNumber &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    department,
                    email,
                    firstName,
                    lastName,
                    phoneNumber,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Contact{department=$department, email=$email, firstName=$firstName, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InnerCompany &&
                address == other.address &&
                closureDate == other.closureDate &&
                commercialName == other.commercialName &&
                contact == other.contact &&
                country == other.country &&
                email == other.email &&
                employees == other.employees &&
                employerIdentificationNumber == other.employerIdentificationNumber &&
                insolvencyExists == other.insolvencyExists &&
                insolvencyOngoing == other.insolvencyOngoing &&
                legalForm == other.legalForm &&
                name == other.name &&
                phoneNumber == other.phoneNumber &&
                registrationDate == other.registrationDate &&
                registrationId == other.registrationId &&
                shareCapital == other.shareCapital &&
                status == other.status &&
                taxIdentificationNumber == other.taxIdentificationNumber &&
                type == other.type &&
                websiteUrl == other.websiteUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address,
                closureDate,
                commercialName,
                contact,
                country,
                email,
                employees,
                employerIdentificationNumber,
                insolvencyExists,
                insolvencyOngoing,
                legalForm,
                name,
                phoneNumber,
                registrationDate,
                registrationId,
                shareCapital,
                status,
                taxIdentificationNumber,
                type,
                websiteUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InnerCompany{address=$address, closureDate=$closureDate, commercialName=$commercialName, contact=$contact, country=$country, email=$email, employees=$employees, employerIdentificationNumber=$employerIdentificationNumber, insolvencyExists=$insolvencyExists, insolvencyOngoing=$insolvencyOngoing, legalForm=$legalForm, name=$name, phoneNumber=$phoneNumber, registrationDate=$registrationDate, registrationId=$registrationId, shareCapital=$shareCapital, status=$status, taxIdentificationNumber=$taxIdentificationNumber, type=$type, websiteUrl=$websiteUrl, additionalProperties=$additionalProperties}"
    }

    /** Represents a member or actor of a company, including personal and ownership information. */
    class Member
    private constructor(
        private val id: JsonField<String>,
        private val address: JsonField<String>,
        private val birthday: JsonField<OffsetDateTime>,
        private val birthplace: JsonField<String>,
        private val country: JsonField<String>,
        private val documents: JsonField<List<GenericDocument>>,
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val isBeneficialOwner: JsonField<Boolean>,
        private val isDelegator: JsonField<Boolean>,
        private val lastName: JsonField<String>,
        private val livenessVerification: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val ownershipPercentage: JsonField<Long>,
        private val phoneNumber: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val registrationId: JsonField<String>,
        private val relation: JsonField<String>,
        private val roles: JsonField<String>,
        private val source: JsonField<Source>,
        private val state: JsonField<String>,
        private val status: JsonField<String>,
        private val type: JsonField<Type>,
        private val workspaceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
            @JsonProperty("birthday")
            @ExcludeMissing
            birthday: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("birthplace")
            @ExcludeMissing
            birthplace: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("documents")
            @ExcludeMissing
            documents: JsonField<List<GenericDocument>> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_beneficial_owner")
            @ExcludeMissing
            isBeneficialOwner: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("is_delegator")
            @ExcludeMissing
            isDelegator: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("liveness_verification")
            @ExcludeMissing
            livenessVerification: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ownership_percentage")
            @ExcludeMissing
            ownershipPercentage: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registration_id")
            @ExcludeMissing
            registrationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("relation")
            @ExcludeMissing
            relation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("roles") @ExcludeMissing roles: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("workspace_id")
            @ExcludeMissing
            workspaceId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            address,
            birthday,
            birthplace,
            country,
            documents,
            email,
            firstName,
            isBeneficialOwner,
            isDelegator,
            lastName,
            livenessVerification,
            name,
            ownershipPercentage,
            phoneNumber,
            postalCode,
            registrationId,
            relation,
            roles,
            source,
            state,
            status,
            type,
            workspaceId,
            mutableMapOf(),
        )

        /**
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun id(): String? = id.getNullable("id")

        /**
         * Address of the member, which may include street, city, postal code, and country.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun address(): String? = address.getNullable("address")

        /**
         * Birthday (available only if type = person)
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun birthday(): OffsetDateTime? = birthday.getNullable("birthday")

        /**
         * Birthplace (available only if type = person)
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun birthplace(): String? = birthplace.getNullable("birthplace")

        /**
         * ISO 3166-1 alpha-2 country code of the member's address (e.g., "FR" for France).
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun country(): String? = country.getNullable("country")

        /**
         * List of documents associated with the member, including their metadata and processing
         * status.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun documents(): List<GenericDocument>? = documents.getNullable("documents")

        /**
         * Email address of the member, which may be used for communication or verification
         * purposes.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun email(): String? = email.getNullable("email")

        /**
         * First name (available only if type = person)
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun firstName(): String? = firstName.getNullable("first_name")

        /**
         * Indicates whether the member is a beneficial owner of the company, meaning they have
         * significant control or ownership.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun isBeneficialOwner(): Boolean? = isBeneficialOwner.getNullable("is_beneficial_owner")

        /**
         * Indicates whether the member is a delegator, meaning they have authority to act on behalf
         * of the company.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun isDelegator(): Boolean? = isDelegator.getNullable("is_delegator")

        /**
         * Last name (available only if type = person)
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lastName(): String? = lastName.getNullable("last_name")

        /**
         * Indicates whether liveness verification was performed for the member, typically in the
         * context of identity checks.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun livenessVerification(): Boolean? =
            livenessVerification.getNullable("liveness_verification")

        /**
         * Company name (available only if type = company)
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Percentage of ownership the member has in the company, expressed as an integer between 0
         * and 100.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ownershipPercentage(): Long? = ownershipPercentage.getNullable("ownership_percentage")

        /**
         * Contact phone number of the member, including country code and area code.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

        /**
         * Postal code of the member's address, typically a numeric or alphanumeric code.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun postalCode(): String? = postalCode.getNullable("postal_code")

        /**
         * Official registration identifier of the member, such as a national ID or company
         * registration number.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun registrationId(): String? = registrationId.getNullable("registration_id")

        /**
         * Type of relationship the member has with the company, such as "shareholder", "director",
         * or "beneficial_owner".
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun relation(): String? = relation.getNullable("relation")

        /**
         * Role of the member within the company, such as "legal_representative", "director", or
         * "manager".
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun roles(): String? = roles.getNullable("roles")

        /**
         * Source of the data (e.g., government, user, company)
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun source(): Source? = source.getNullable("source")

        /**
         * Current state of the member in the workflow, such as "WAITING", "STARTED", "RUNNING", or
         * "PROCESSED".
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun state(): String? = state.getNullable("state")

        /**
         * Status of the member in the system, indicating whether they are approved, pending, or
         * rejected. Possible values include "approved", "need_review", "rejected".
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): String? = status.getNullable("status")

        /**
         * Member type (person or company)
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): Type? = type.getNullable("type")

        /**
         * Identifier of the workspace to which the member belongs, used for organizational
         * purposes.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun workspaceId(): String? = workspaceId.getNullable("workspace_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

        /**
         * Returns the raw JSON value of [birthday].
         *
         * Unlike [birthday], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("birthday")
        @ExcludeMissing
        fun _birthday(): JsonField<OffsetDateTime> = birthday

        /**
         * Returns the raw JSON value of [birthplace].
         *
         * Unlike [birthplace], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("birthplace")
        @ExcludeMissing
        fun _birthplace(): JsonField<String> = birthplace

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [documents].
         *
         * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("documents")
        @ExcludeMissing
        fun _documents(): JsonField<List<GenericDocument>> = documents

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [isBeneficialOwner].
         *
         * Unlike [isBeneficialOwner], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_beneficial_owner")
        @ExcludeMissing
        fun _isBeneficialOwner(): JsonField<Boolean> = isBeneficialOwner

        /**
         * Returns the raw JSON value of [isDelegator].
         *
         * Unlike [isDelegator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_delegator")
        @ExcludeMissing
        fun _isDelegator(): JsonField<Boolean> = isDelegator

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [livenessVerification].
         *
         * Unlike [livenessVerification], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("liveness_verification")
        @ExcludeMissing
        fun _livenessVerification(): JsonField<Boolean> = livenessVerification

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [ownershipPercentage].
         *
         * Unlike [ownershipPercentage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ownership_percentage")
        @ExcludeMissing
        fun _ownershipPercentage(): JsonField<Long> = ownershipPercentage

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [registrationId].
         *
         * Unlike [registrationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("registration_id")
        @ExcludeMissing
        fun _registrationId(): JsonField<String> = registrationId

        /**
         * Returns the raw JSON value of [relation].
         *
         * Unlike [relation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("relation") @ExcludeMissing fun _relation(): JsonField<String> = relation

        /**
         * Returns the raw JSON value of [roles].
         *
         * Unlike [roles], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("roles") @ExcludeMissing fun _roles(): JsonField<String> = roles

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [workspaceId].
         *
         * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("workspace_id")
        @ExcludeMissing
        fun _workspaceId(): JsonField<String> = workspaceId

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

            /** Returns a mutable builder for constructing an instance of [Member]. */
            fun builder() = Builder()
        }

        /** A builder for [Member]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var address: JsonField<String> = JsonMissing.of()
            private var birthday: JsonField<OffsetDateTime> = JsonMissing.of()
            private var birthplace: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var documents: JsonField<MutableList<GenericDocument>>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var isBeneficialOwner: JsonField<Boolean> = JsonMissing.of()
            private var isDelegator: JsonField<Boolean> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var livenessVerification: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var ownershipPercentage: JsonField<Long> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var registrationId: JsonField<String> = JsonMissing.of()
            private var relation: JsonField<String> = JsonMissing.of()
            private var roles: JsonField<String> = JsonMissing.of()
            private var source: JsonField<Source> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var workspaceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(member: Member) = apply {
                id = member.id
                address = member.address
                birthday = member.birthday
                birthplace = member.birthplace
                country = member.country
                documents = member.documents.map { it.toMutableList() }
                email = member.email
                firstName = member.firstName
                isBeneficialOwner = member.isBeneficialOwner
                isDelegator = member.isDelegator
                lastName = member.lastName
                livenessVerification = member.livenessVerification
                name = member.name
                ownershipPercentage = member.ownershipPercentage
                phoneNumber = member.phoneNumber
                postalCode = member.postalCode
                registrationId = member.registrationId
                relation = member.relation
                roles = member.roles
                source = member.source
                state = member.state
                status = member.status
                type = member.type
                workspaceId = member.workspaceId
                additionalProperties = member.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Address of the member, which may include street, city, postal code, and country. */
            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            /** Birthday (available only if type = person) */
            fun birthday(birthday: OffsetDateTime) = birthday(JsonField.of(birthday))

            /**
             * Sets [Builder.birthday] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthday] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthday(birthday: JsonField<OffsetDateTime>) = apply { this.birthday = birthday }

            /** Birthplace (available only if type = person) */
            fun birthplace(birthplace: String) = birthplace(JsonField.of(birthplace))

            /**
             * Sets [Builder.birthplace] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthplace] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthplace(birthplace: JsonField<String>) = apply { this.birthplace = birthplace }

            /** ISO 3166-1 alpha-2 country code of the member's address (e.g., "FR" for France). */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /**
             * List of documents associated with the member, including their metadata and processing
             * status.
             */
            fun documents(documents: List<GenericDocument>) = documents(JsonField.of(documents))

            /**
             * Sets [Builder.documents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documents] with a well-typed `List<GenericDocument>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun documents(documents: JsonField<List<GenericDocument>>) = apply {
                this.documents = documents.map { it.toMutableList() }
            }

            /**
             * Adds a single [GenericDocument] to [documents].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDocument(document: GenericDocument) = apply {
                documents =
                    (documents ?: JsonField.of(mutableListOf())).also {
                        checkKnown("documents", it).add(document)
                    }
            }

            /**
             * Email address of the member, which may be used for communication or verification
             * purposes.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** First name (available only if type = person) */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /**
             * Indicates whether the member is a beneficial owner of the company, meaning they have
             * significant control or ownership.
             */
            fun isBeneficialOwner(isBeneficialOwner: Boolean) =
                isBeneficialOwner(JsonField.of(isBeneficialOwner))

            /**
             * Sets [Builder.isBeneficialOwner] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isBeneficialOwner] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isBeneficialOwner(isBeneficialOwner: JsonField<Boolean>) = apply {
                this.isBeneficialOwner = isBeneficialOwner
            }

            /**
             * Indicates whether the member is a delegator, meaning they have authority to act on
             * behalf of the company.
             */
            fun isDelegator(isDelegator: Boolean) = isDelegator(JsonField.of(isDelegator))

            /**
             * Sets [Builder.isDelegator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isDelegator] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isDelegator(isDelegator: JsonField<Boolean>) = apply {
                this.isDelegator = isDelegator
            }

            /** Last name (available only if type = person) */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /**
             * Indicates whether liveness verification was performed for the member, typically in
             * the context of identity checks.
             */
            fun livenessVerification(livenessVerification: Boolean) =
                livenessVerification(JsonField.of(livenessVerification))

            /**
             * Sets [Builder.livenessVerification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.livenessVerification] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun livenessVerification(livenessVerification: JsonField<Boolean>) = apply {
                this.livenessVerification = livenessVerification
            }

            /** Company name (available only if type = company) */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Percentage of ownership the member has in the company, expressed as an integer
             * between 0 and 100.
             */
            fun ownershipPercentage(ownershipPercentage: Long) =
                ownershipPercentage(JsonField.of(ownershipPercentage))

            /**
             * Sets [Builder.ownershipPercentage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ownershipPercentage] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ownershipPercentage(ownershipPercentage: JsonField<Long>) = apply {
                this.ownershipPercentage = ownershipPercentage
            }

            /** Contact phone number of the member, including country code and area code. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Postal code of the member's address, typically a numeric or alphanumeric code. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /**
             * Official registration identifier of the member, such as a national ID or company
             * registration number.
             */
            fun registrationId(registrationId: String) =
                registrationId(JsonField.of(registrationId))

            /**
             * Sets [Builder.registrationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registrationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registrationId(registrationId: JsonField<String>) = apply {
                this.registrationId = registrationId
            }

            /**
             * Type of relationship the member has with the company, such as "shareholder",
             * "director", or "beneficial_owner".
             */
            fun relation(relation: String) = relation(JsonField.of(relation))

            /**
             * Sets [Builder.relation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relation] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun relation(relation: JsonField<String>) = apply { this.relation = relation }

            /**
             * Role of the member within the company, such as "legal_representative", "director", or
             * "manager".
             */
            fun roles(roles: String) = roles(JsonField.of(roles))

            /**
             * Sets [Builder.roles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roles] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roles(roles: JsonField<String>) = apply { this.roles = roles }

            /** Source of the data (e.g., government, user, company) */
            fun source(source: Source) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [Source] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<Source>) = apply { this.source = source }

            /**
             * Current state of the member in the workflow, such as "WAITING", "STARTED", "RUNNING",
             * or "PROCESSED".
             */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /**
             * Status of the member in the system, indicating whether they are approved, pending, or
             * rejected. Possible values include "approved", "need_review", "rejected".
             */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** Member type (person or company) */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Identifier of the workspace to which the member belongs, used for organizational
             * purposes.
             */
            fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

            /**
             * Sets [Builder.workspaceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workspaceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun workspaceId(workspaceId: JsonField<String>) = apply {
                this.workspaceId = workspaceId
            }

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
             * Returns an immutable instance of [Member].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Member =
                Member(
                    id,
                    address,
                    birthday,
                    birthplace,
                    country,
                    (documents ?: JsonMissing.of()).map { it.toImmutable() },
                    email,
                    firstName,
                    isBeneficialOwner,
                    isDelegator,
                    lastName,
                    livenessVerification,
                    name,
                    ownershipPercentage,
                    phoneNumber,
                    postalCode,
                    registrationId,
                    relation,
                    roles,
                    source,
                    state,
                    status,
                    type,
                    workspaceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Member = apply {
            if (validated) {
                return@apply
            }

            id()
            address()
            birthday()
            birthplace()
            country()
            documents()?.forEach { it.validate() }
            email()
            firstName()
            isBeneficialOwner()
            isDelegator()
            lastName()
            livenessVerification()
            name()
            ownershipPercentage()
            phoneNumber()
            postalCode()
            registrationId()
            relation()
            roles()
            source()?.validate()
            state()
            status()
            type()?.validate()
            workspaceId()
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
        internal fun validity(): Int =
            (if (id.asKnown() == null) 0 else 1) +
                (if (address.asKnown() == null) 0 else 1) +
                (if (birthday.asKnown() == null) 0 else 1) +
                (if (birthplace.asKnown() == null) 0 else 1) +
                (if (country.asKnown() == null) 0 else 1) +
                (documents.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (email.asKnown() == null) 0 else 1) +
                (if (firstName.asKnown() == null) 0 else 1) +
                (if (isBeneficialOwner.asKnown() == null) 0 else 1) +
                (if (isDelegator.asKnown() == null) 0 else 1) +
                (if (lastName.asKnown() == null) 0 else 1) +
                (if (livenessVerification.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (ownershipPercentage.asKnown() == null) 0 else 1) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (if (postalCode.asKnown() == null) 0 else 1) +
                (if (registrationId.asKnown() == null) 0 else 1) +
                (if (relation.asKnown() == null) 0 else 1) +
                (if (roles.asKnown() == null) 0 else 1) +
                (source.asKnown()?.validity() ?: 0) +
                (if (state.asKnown() == null) 0 else 1) +
                (if (status.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (if (workspaceId.asKnown() == null) 0 else 1)

        /** Source of the data (e.g., government, user, company) */
        class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val GOUVE = of("gouve")

                val USER = of("user")

                val COMPANY = of("company")

                fun of(value: String) = Source(JsonField.of(value))
            }

            /** An enum containing [Source]'s known values. */
            enum class Known {
                GOUVE,
                USER,
                COMPANY,
            }

            /**
             * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Source] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                GOUVE,
                USER,
                COMPANY,
                /**
                 * An enum member indicating that [Source] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    GOUVE -> Value.GOUVE
                    USER -> Value.USER
                    COMPANY -> Value.COMPANY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws DataleonlabsInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    GOUVE -> Known.GOUVE
                    USER -> Known.USER
                    COMPANY -> Known.COMPANY
                    else -> throw DataleonlabsInvalidDataException("Unknown Source: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws DataleonlabsInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw DataleonlabsInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): Source = apply {
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

                return other is Source && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Member type (person or company) */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val PERSON = of("person")

                val COMPANY = of("company")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PERSON,
                COMPANY,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PERSON,
                COMPANY,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PERSON -> Value.PERSON
                    COMPANY -> Value.COMPANY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws DataleonlabsInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    PERSON -> Known.PERSON
                    COMPANY -> Known.COMPANY
                    else -> throw DataleonlabsInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws DataleonlabsInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw DataleonlabsInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Member &&
                id == other.id &&
                address == other.address &&
                birthday == other.birthday &&
                birthplace == other.birthplace &&
                country == other.country &&
                documents == other.documents &&
                email == other.email &&
                firstName == other.firstName &&
                isBeneficialOwner == other.isBeneficialOwner &&
                isDelegator == other.isDelegator &&
                lastName == other.lastName &&
                livenessVerification == other.livenessVerification &&
                name == other.name &&
                ownershipPercentage == other.ownershipPercentage &&
                phoneNumber == other.phoneNumber &&
                postalCode == other.postalCode &&
                registrationId == other.registrationId &&
                relation == other.relation &&
                roles == other.roles &&
                source == other.source &&
                state == other.state &&
                status == other.status &&
                type == other.type &&
                workspaceId == other.workspaceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                address,
                birthday,
                birthplace,
                country,
                documents,
                email,
                firstName,
                isBeneficialOwner,
                isDelegator,
                lastName,
                livenessVerification,
                name,
                ownershipPercentage,
                phoneNumber,
                postalCode,
                registrationId,
                relation,
                roles,
                source,
                state,
                status,
                type,
                workspaceId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Member{id=$id, address=$address, birthday=$birthday, birthplace=$birthplace, country=$country, documents=$documents, email=$email, firstName=$firstName, isBeneficialOwner=$isBeneficialOwner, isDelegator=$isDelegator, lastName=$lastName, livenessVerification=$livenessVerification, name=$name, ownershipPercentage=$ownershipPercentage, phoneNumber=$phoneNumber, postalCode=$postalCode, registrationId=$registrationId, relation=$relation, roles=$roles, source=$source, state=$state, status=$status, type=$type, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Company &&
            amlSuspicions == other.amlSuspicions &&
            certificat == other.certificat &&
            checks == other.checks &&
            company == other.company &&
            documents == other.documents &&
            members == other.members &&
            portalUrl == other.portalUrl &&
            properties == other.properties &&
            risk == other.risk &&
            sourceId == other.sourceId &&
            technicalData == other.technicalData &&
            webviewUrl == other.webviewUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amlSuspicions,
            certificat,
            checks,
            company,
            documents,
            members,
            portalUrl,
            properties,
            risk,
            sourceId,
            technicalData,
            webviewUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Company{amlSuspicions=$amlSuspicions, certificat=$certificat, checks=$checks, company=$company, documents=$documents, members=$members, portalUrl=$portalUrl, properties=$properties, risk=$risk, sourceId=$sourceId, technicalData=$technicalData, webviewUrl=$webviewUrl, additionalProperties=$additionalProperties}"
}
