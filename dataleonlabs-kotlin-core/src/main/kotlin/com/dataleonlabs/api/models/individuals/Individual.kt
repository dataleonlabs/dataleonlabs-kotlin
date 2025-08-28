// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.individuals

import com.dataleonlabs.api.core.ExcludeMissing
import com.dataleonlabs.api.core.JsonField
import com.dataleonlabs.api.core.JsonMissing
import com.dataleonlabs.api.core.JsonValue
import com.dataleonlabs.api.core.checkKnown
import com.dataleonlabs.api.core.toImmutable
import com.dataleonlabs.api.errors.DataleonlabsInvalidDataException
import com.dataleonlabs.api.models.companies.AmlSuspicion
import com.dataleonlabs.api.models.companies.Certificat
import com.dataleonlabs.api.models.companies.Check
import com.dataleonlabs.api.models.companies.Property
import com.dataleonlabs.api.models.companies.Risk
import com.dataleonlabs.api.models.companies.TechnicalData
import com.dataleonlabs.api.models.companies.documents.GenericDocument
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Represents a single individual record, including identification, status, and associated metadata.
 */
class Individual
private constructor(
    private val id: JsonField<String>,
    private val amlSuspicions: JsonField<List<AmlSuspicion>>,
    private val authUrl: JsonField<String>,
    private val certificat: JsonField<Certificat>,
    private val checks: JsonField<List<Check>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val documents: JsonField<List<GenericDocument>>,
    private val identityCard: JsonField<IdentityCard>,
    private val number: JsonField<Long>,
    private val person: JsonField<Person>,
    private val portalUrl: JsonField<String>,
    private val properties: JsonField<List<Property>>,
    private val risk: JsonField<Risk>,
    private val sourceId: JsonField<String>,
    private val state: JsonField<String>,
    private val status: JsonField<String>,
    private val tags: JsonField<List<Tag>>,
    private val technicalData: JsonField<TechnicalData>,
    private val webviewUrl: JsonField<String>,
    private val workspaceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aml_suspicions")
        @ExcludeMissing
        amlSuspicions: JsonField<List<AmlSuspicion>> = JsonMissing.of(),
        @JsonProperty("auth_url") @ExcludeMissing authUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("certificat")
        @ExcludeMissing
        certificat: JsonField<Certificat> = JsonMissing.of(),
        @JsonProperty("checks") @ExcludeMissing checks: JsonField<List<Check>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("documents")
        @ExcludeMissing
        documents: JsonField<List<GenericDocument>> = JsonMissing.of(),
        @JsonProperty("identity_card")
        @ExcludeMissing
        identityCard: JsonField<IdentityCard> = JsonMissing.of(),
        @JsonProperty("number") @ExcludeMissing number: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("person") @ExcludeMissing person: JsonField<Person> = JsonMissing.of(),
        @JsonProperty("portal_url") @ExcludeMissing portalUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<List<Property>> = JsonMissing.of(),
        @JsonProperty("risk") @ExcludeMissing risk: JsonField<Risk> = JsonMissing.of(),
        @JsonProperty("source_id") @ExcludeMissing sourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<Tag>> = JsonMissing.of(),
        @JsonProperty("technical_data")
        @ExcludeMissing
        technicalData: JsonField<TechnicalData> = JsonMissing.of(),
        @JsonProperty("webview_url")
        @ExcludeMissing
        webviewUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workspace_id")
        @ExcludeMissing
        workspaceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        amlSuspicions,
        authUrl,
        certificat,
        checks,
        createdAt,
        documents,
        identityCard,
        number,
        person,
        portalUrl,
        properties,
        risk,
        sourceId,
        state,
        status,
        tags,
        technicalData,
        webviewUrl,
        workspaceId,
        mutableMapOf(),
    )

    /**
     * Unique identifier of the individual.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * List of AML (Anti-Money Laundering) suspicion entries linked to the individual.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amlSuspicions(): List<AmlSuspicion>? = amlSuspicions.getNullable("aml_suspicions")

    /**
     * URL to authenticate the individual, usually for document signing or onboarding.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun authUrl(): String? = authUrl.getNullable("auth_url")

    /**
     * Digital certificate associated with the individual, if any.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun certificat(): Certificat? = certificat.getNullable("certificat")

    /**
     * List of verification or validation checks applied to the individual.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun checks(): List<Check>? = checks.getNullable("checks")

    /**
     * Timestamp of the individual's creation in ISO 8601 format.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

    /**
     * All documents submitted or associated with the individual.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documents(): List<GenericDocument>? = documents.getNullable("documents")

    /**
     * Reference to the individual's identity document.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun identityCard(): IdentityCard? = identityCard.getNullable("identity_card")

    /**
     * Internal sequential number or reference for the individual.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun number(): Long? = number.getNullable("number")

    /**
     * Personal details of the individual, such as name, date of birth, and contact info.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun person(): Person? = person.getNullable("person")

    /**
     * Admin or internal portal URL for viewing the individual's details.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun portalUrl(): String? = portalUrl.getNullable("portal_url")

    /**
     * Custom key-value metadata fields associated with the individual.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun properties(): List<Property>? = properties.getNullable("properties")

    /**
     * Risk assessment associated with the individual.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun risk(): Risk? = risk.getNullable("risk")

    /**
     * Optional identifier indicating the source of the individual record.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sourceId(): String? = sourceId.getNullable("source_id")

    /**
     * Current operational state in the workflow (e.g., WAITING, IN_PROGRESS, COMPLETED).
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun state(): String? = state.getNullable("state")

    /**
     * Overall processing status of the individual (e.g., rejected, need_review, approved).
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): String? = status.getNullable("status")

    /**
     * List of tags assigned to the individual for categorization or metadata purposes.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tags(): List<Tag>? = tags.getNullable("tags")

    /**
     * Technical metadata related to the request (e.g., QR code settings, language).
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun technicalData(): TechnicalData? = technicalData.getNullable("technical_data")

    /**
     * Public-facing webview URL for the individual’s identification process.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun webviewUrl(): String? = webviewUrl.getNullable("webview_url")

    /**
     * Identifier of the workspace to which the individual belongs.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun workspaceId(): String? = workspaceId.getNullable("workspace_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amlSuspicions].
     *
     * Unlike [amlSuspicions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aml_suspicions")
    @ExcludeMissing
    fun _amlSuspicions(): JsonField<List<AmlSuspicion>> = amlSuspicions

    /**
     * Returns the raw JSON value of [authUrl].
     *
     * Unlike [authUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth_url") @ExcludeMissing fun _authUrl(): JsonField<String> = authUrl

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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documents")
    @ExcludeMissing
    fun _documents(): JsonField<List<GenericDocument>> = documents

    /**
     * Returns the raw JSON value of [identityCard].
     *
     * Unlike [identityCard], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identity_card")
    @ExcludeMissing
    fun _identityCard(): JsonField<IdentityCard> = identityCard

    /**
     * Returns the raw JSON value of [number].
     *
     * Unlike [number], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<Long> = number

    /**
     * Returns the raw JSON value of [person].
     *
     * Unlike [person], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("person") @ExcludeMissing fun _person(): JsonField<Person> = person

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
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<Tag>> = tags

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

        /** Returns a mutable builder for constructing an instance of [Individual]. */
        fun builder() = Builder()
    }

    /** A builder for [Individual]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var amlSuspicions: JsonField<MutableList<AmlSuspicion>>? = null
        private var authUrl: JsonField<String> = JsonMissing.of()
        private var certificat: JsonField<Certificat> = JsonMissing.of()
        private var checks: JsonField<MutableList<Check>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var documents: JsonField<MutableList<GenericDocument>>? = null
        private var identityCard: JsonField<IdentityCard> = JsonMissing.of()
        private var number: JsonField<Long> = JsonMissing.of()
        private var person: JsonField<Person> = JsonMissing.of()
        private var portalUrl: JsonField<String> = JsonMissing.of()
        private var properties: JsonField<MutableList<Property>>? = null
        private var risk: JsonField<Risk> = JsonMissing.of()
        private var sourceId: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<Tag>>? = null
        private var technicalData: JsonField<TechnicalData> = JsonMissing.of()
        private var webviewUrl: JsonField<String> = JsonMissing.of()
        private var workspaceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(individual: Individual) = apply {
            id = individual.id
            amlSuspicions = individual.amlSuspicions.map { it.toMutableList() }
            authUrl = individual.authUrl
            certificat = individual.certificat
            checks = individual.checks.map { it.toMutableList() }
            createdAt = individual.createdAt
            documents = individual.documents.map { it.toMutableList() }
            identityCard = individual.identityCard
            number = individual.number
            person = individual.person
            portalUrl = individual.portalUrl
            properties = individual.properties.map { it.toMutableList() }
            risk = individual.risk
            sourceId = individual.sourceId
            state = individual.state
            status = individual.status
            tags = individual.tags.map { it.toMutableList() }
            technicalData = individual.technicalData
            webviewUrl = individual.webviewUrl
            workspaceId = individual.workspaceId
            additionalProperties = individual.additionalProperties.toMutableMap()
        }

        /** Unique identifier of the individual. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** List of AML (Anti-Money Laundering) suspicion entries linked to the individual. */
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

        /** URL to authenticate the individual, usually for document signing or onboarding. */
        fun authUrl(authUrl: String) = authUrl(JsonField.of(authUrl))

        /**
         * Sets [Builder.authUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun authUrl(authUrl: JsonField<String>) = apply { this.authUrl = authUrl }

        /** Digital certificate associated with the individual, if any. */
        fun certificat(certificat: Certificat) = certificat(JsonField.of(certificat))

        /**
         * Sets [Builder.certificat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certificat] with a well-typed [Certificat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun certificat(certificat: JsonField<Certificat>) = apply { this.certificat = certificat }

        /** List of verification or validation checks applied to the individual. */
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

        /** Timestamp of the individual's creation in ISO 8601 format. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** All documents submitted or associated with the individual. */
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

        /** Reference to the individual's identity document. */
        fun identityCard(identityCard: IdentityCard) = identityCard(JsonField.of(identityCard))

        /**
         * Sets [Builder.identityCard] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identityCard] with a well-typed [IdentityCard] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun identityCard(identityCard: JsonField<IdentityCard>) = apply {
            this.identityCard = identityCard
        }

        /** Internal sequential number or reference for the individual. */
        fun number(number: Long) = number(JsonField.of(number))

        /**
         * Sets [Builder.number] to an arbitrary JSON value.
         *
         * You should usually call [Builder.number] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun number(number: JsonField<Long>) = apply { this.number = number }

        /** Personal details of the individual, such as name, date of birth, and contact info. */
        fun person(person: Person) = person(JsonField.of(person))

        /**
         * Sets [Builder.person] to an arbitrary JSON value.
         *
         * You should usually call [Builder.person] with a well-typed [Person] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun person(person: JsonField<Person>) = apply { this.person = person }

        /** Admin or internal portal URL for viewing the individual's details. */
        fun portalUrl(portalUrl: String) = portalUrl(JsonField.of(portalUrl))

        /**
         * Sets [Builder.portalUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun portalUrl(portalUrl: JsonField<String>) = apply { this.portalUrl = portalUrl }

        /** Custom key-value metadata fields associated with the individual. */
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

        /** Risk assessment associated with the individual. */
        fun risk(risk: Risk) = risk(JsonField.of(risk))

        /**
         * Sets [Builder.risk] to an arbitrary JSON value.
         *
         * You should usually call [Builder.risk] with a well-typed [Risk] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun risk(risk: JsonField<Risk>) = apply { this.risk = risk }

        /** Optional identifier indicating the source of the individual record. */
        fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

        /** Current operational state in the workflow (e.g., WAITING, IN_PROGRESS, COMPLETED). */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** Overall processing status of the individual (e.g., rejected, need_review, approved). */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** List of tags assigned to the individual for categorization or metadata purposes. */
        fun tags(tags: List<Tag>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<Tag>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tags(tags: JsonField<List<Tag>>) = apply { this.tags = tags.map { it.toMutableList() } }

        /**
         * Adds a single [Tag] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: Tag) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /** Technical metadata related to the request (e.g., QR code settings, language). */
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

        /** Public-facing webview URL for the individual’s identification process. */
        fun webviewUrl(webviewUrl: String) = webviewUrl(JsonField.of(webviewUrl))

        /**
         * Sets [Builder.webviewUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webviewUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webviewUrl(webviewUrl: JsonField<String>) = apply { this.webviewUrl = webviewUrl }

        /** Identifier of the workspace to which the individual belongs. */
        fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

        /**
         * Sets [Builder.workspaceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspaceId(workspaceId: JsonField<String>) = apply { this.workspaceId = workspaceId }

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
         * Returns an immutable instance of [Individual].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Individual =
            Individual(
                id,
                (amlSuspicions ?: JsonMissing.of()).map { it.toImmutable() },
                authUrl,
                certificat,
                (checks ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                (documents ?: JsonMissing.of()).map { it.toImmutable() },
                identityCard,
                number,
                person,
                portalUrl,
                (properties ?: JsonMissing.of()).map { it.toImmutable() },
                risk,
                sourceId,
                state,
                status,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                technicalData,
                webviewUrl,
                workspaceId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Individual = apply {
        if (validated) {
            return@apply
        }

        id()
        amlSuspicions()?.forEach { it.validate() }
        authUrl()
        certificat()?.validate()
        checks()?.forEach { it.validate() }
        createdAt()
        documents()?.forEach { it.validate() }
        identityCard()?.validate()
        number()
        person()?.validate()
        portalUrl()
        properties()?.forEach { it.validate() }
        risk()?.validate()
        sourceId()
        state()
        status()
        tags()?.forEach { it.validate() }
        technicalData()?.validate()
        webviewUrl()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (amlSuspicions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (authUrl.asKnown() == null) 0 else 1) +
            (certificat.asKnown()?.validity() ?: 0) +
            (checks.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (documents.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (identityCard.asKnown()?.validity() ?: 0) +
            (if (number.asKnown() == null) 0 else 1) +
            (person.asKnown()?.validity() ?: 0) +
            (if (portalUrl.asKnown() == null) 0 else 1) +
            (properties.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (risk.asKnown()?.validity() ?: 0) +
            (if (sourceId.asKnown() == null) 0 else 1) +
            (if (state.asKnown() == null) 0 else 1) +
            (if (status.asKnown() == null) 0 else 1) +
            (tags.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (technicalData.asKnown()?.validity() ?: 0) +
            (if (webviewUrl.asKnown() == null) 0 else 1) +
            (if (workspaceId.asKnown() == null) 0 else 1)

    /** Reference to the individual's identity document. */
    class IdentityCard
    private constructor(
        private val id: JsonField<String>,
        private val backDocumentSignedUrl: JsonField<String>,
        private val birthPlace: JsonField<String>,
        private val birthday: JsonField<String>,
        private val country: JsonField<String>,
        private val expirationDate: JsonField<String>,
        private val firstName: JsonField<String>,
        private val frontDocumentSignedUrl: JsonField<String>,
        private val gender: JsonField<String>,
        private val issueDate: JsonField<String>,
        private val lastName: JsonField<String>,
        private val mrzLine1: JsonField<String>,
        private val mrzLine2: JsonField<String>,
        private val mrzLine3: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("back_document_signed_url")
            @ExcludeMissing
            backDocumentSignedUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("birth_place")
            @ExcludeMissing
            birthPlace: JsonField<String> = JsonMissing.of(),
            @JsonProperty("birthday")
            @ExcludeMissing
            birthday: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiration_date")
            @ExcludeMissing
            expirationDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("front_document_signed_url")
            @ExcludeMissing
            frontDocumentSignedUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gender") @ExcludeMissing gender: JsonField<String> = JsonMissing.of(),
            @JsonProperty("issue_date")
            @ExcludeMissing
            issueDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mrz_line_1")
            @ExcludeMissing
            mrzLine1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mrz_line_2")
            @ExcludeMissing
            mrzLine2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mrz_line_3")
            @ExcludeMissing
            mrzLine3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            backDocumentSignedUrl,
            birthPlace,
            birthday,
            country,
            expirationDate,
            firstName,
            frontDocumentSignedUrl,
            gender,
            issueDate,
            lastName,
            mrzLine1,
            mrzLine2,
            mrzLine3,
            type,
            mutableMapOf(),
        )

        /**
         * Unique identifier for the document.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun id(): String? = id.getNullable("id")

        /**
         * Signed URL linking to the back image of the document.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun backDocumentSignedUrl(): String? =
            backDocumentSignedUrl.getNullable("back_document_signed_url")

        /**
         * Place of birth as indicated on the document.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun birthPlace(): String? = birthPlace.getNullable("birth_place")

        /**
         * Date of birth in DD/MM/YYYY format as shown on the document.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun birthday(): String? = birthday.getNullable("birthday")

        /**
         * Country code issuing the document (ISO 3166-1 alpha-2).
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun country(): String? = country.getNullable("country")

        /**
         * Expiration date of the document, in YYYY-MM-DD format.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expirationDate(): String? = expirationDate.getNullable("expiration_date")

        /**
         * First name as shown on the document.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun firstName(): String? = firstName.getNullable("first_name")

        /**
         * Signed URL linking to the front image of the document.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun frontDocumentSignedUrl(): String? =
            frontDocumentSignedUrl.getNullable("front_document_signed_url")

        /**
         * Gender indicated on the document (e.g., "M" or "F").
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun gender(): String? = gender.getNullable("gender")

        /**
         * Date when the document was issued, in YYYY-MM-DD format.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun issueDate(): String? = issueDate.getNullable("issue_date")

        /**
         * Last name as shown on the document.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lastName(): String? = lastName.getNullable("last_name")

        /**
         * First line of the Machine Readable Zone (MRZ) on the document.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun mrzLine1(): String? = mrzLine1.getNullable("mrz_line_1")

        /**
         * Second line of the MRZ on the document.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun mrzLine2(): String? = mrzLine2.getNullable("mrz_line_2")

        /**
         * Third line of the MRZ if applicable; otherwise null.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun mrzLine3(): String? = mrzLine3.getNullable("mrz_line_3")

        /**
         * Type of document (e.g., passport, identity card).
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): String? = type.getNullable("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [backDocumentSignedUrl].
         *
         * Unlike [backDocumentSignedUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("back_document_signed_url")
        @ExcludeMissing
        fun _backDocumentSignedUrl(): JsonField<String> = backDocumentSignedUrl

        /**
         * Returns the raw JSON value of [birthPlace].
         *
         * Unlike [birthPlace], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("birth_place")
        @ExcludeMissing
        fun _birthPlace(): JsonField<String> = birthPlace

        /**
         * Returns the raw JSON value of [birthday].
         *
         * Unlike [birthday], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("birthday") @ExcludeMissing fun _birthday(): JsonField<String> = birthday

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [expirationDate].
         *
         * Unlike [expirationDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expiration_date")
        @ExcludeMissing
        fun _expirationDate(): JsonField<String> = expirationDate

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [frontDocumentSignedUrl].
         *
         * Unlike [frontDocumentSignedUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("front_document_signed_url")
        @ExcludeMissing
        fun _frontDocumentSignedUrl(): JsonField<String> = frontDocumentSignedUrl

        /**
         * Returns the raw JSON value of [gender].
         *
         * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<String> = gender

        /**
         * Returns the raw JSON value of [issueDate].
         *
         * Unlike [issueDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("issue_date") @ExcludeMissing fun _issueDate(): JsonField<String> = issueDate

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [mrzLine1].
         *
         * Unlike [mrzLine1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mrz_line_1") @ExcludeMissing fun _mrzLine1(): JsonField<String> = mrzLine1

        /**
         * Returns the raw JSON value of [mrzLine2].
         *
         * Unlike [mrzLine2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mrz_line_2") @ExcludeMissing fun _mrzLine2(): JsonField<String> = mrzLine2

        /**
         * Returns the raw JSON value of [mrzLine3].
         *
         * Unlike [mrzLine3], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mrz_line_3") @ExcludeMissing fun _mrzLine3(): JsonField<String> = mrzLine3

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

            /** Returns a mutable builder for constructing an instance of [IdentityCard]. */
            fun builder() = Builder()
        }

        /** A builder for [IdentityCard]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var backDocumentSignedUrl: JsonField<String> = JsonMissing.of()
            private var birthPlace: JsonField<String> = JsonMissing.of()
            private var birthday: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var expirationDate: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var frontDocumentSignedUrl: JsonField<String> = JsonMissing.of()
            private var gender: JsonField<String> = JsonMissing.of()
            private var issueDate: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var mrzLine1: JsonField<String> = JsonMissing.of()
            private var mrzLine2: JsonField<String> = JsonMissing.of()
            private var mrzLine3: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(identityCard: IdentityCard) = apply {
                id = identityCard.id
                backDocumentSignedUrl = identityCard.backDocumentSignedUrl
                birthPlace = identityCard.birthPlace
                birthday = identityCard.birthday
                country = identityCard.country
                expirationDate = identityCard.expirationDate
                firstName = identityCard.firstName
                frontDocumentSignedUrl = identityCard.frontDocumentSignedUrl
                gender = identityCard.gender
                issueDate = identityCard.issueDate
                lastName = identityCard.lastName
                mrzLine1 = identityCard.mrzLine1
                mrzLine2 = identityCard.mrzLine2
                mrzLine3 = identityCard.mrzLine3
                type = identityCard.type
                additionalProperties = identityCard.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the document. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Signed URL linking to the back image of the document. */
            fun backDocumentSignedUrl(backDocumentSignedUrl: String) =
                backDocumentSignedUrl(JsonField.of(backDocumentSignedUrl))

            /**
             * Sets [Builder.backDocumentSignedUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.backDocumentSignedUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun backDocumentSignedUrl(backDocumentSignedUrl: JsonField<String>) = apply {
                this.backDocumentSignedUrl = backDocumentSignedUrl
            }

            /** Place of birth as indicated on the document. */
            fun birthPlace(birthPlace: String) = birthPlace(JsonField.of(birthPlace))

            /**
             * Sets [Builder.birthPlace] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthPlace] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthPlace(birthPlace: JsonField<String>) = apply { this.birthPlace = birthPlace }

            /** Date of birth in DD/MM/YYYY format as shown on the document. */
            fun birthday(birthday: String) = birthday(JsonField.of(birthday))

            /**
             * Sets [Builder.birthday] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthday] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthday(birthday: JsonField<String>) = apply { this.birthday = birthday }

            /** Country code issuing the document (ISO 3166-1 alpha-2). */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** Expiration date of the document, in YYYY-MM-DD format. */
            fun expirationDate(expirationDate: String) =
                expirationDate(JsonField.of(expirationDate))

            /**
             * Sets [Builder.expirationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expirationDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expirationDate(expirationDate: JsonField<String>) = apply {
                this.expirationDate = expirationDate
            }

            /** First name as shown on the document. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** Signed URL linking to the front image of the document. */
            fun frontDocumentSignedUrl(frontDocumentSignedUrl: String) =
                frontDocumentSignedUrl(JsonField.of(frontDocumentSignedUrl))

            /**
             * Sets [Builder.frontDocumentSignedUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frontDocumentSignedUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun frontDocumentSignedUrl(frontDocumentSignedUrl: JsonField<String>) = apply {
                this.frontDocumentSignedUrl = frontDocumentSignedUrl
            }

            /** Gender indicated on the document (e.g., "M" or "F"). */
            fun gender(gender: String) = gender(JsonField.of(gender))

            /**
             * Sets [Builder.gender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gender] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gender(gender: JsonField<String>) = apply { this.gender = gender }

            /** Date when the document was issued, in YYYY-MM-DD format. */
            fun issueDate(issueDate: String) = issueDate(JsonField.of(issueDate))

            /**
             * Sets [Builder.issueDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issueDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issueDate(issueDate: JsonField<String>) = apply { this.issueDate = issueDate }

            /** Last name as shown on the document. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** First line of the Machine Readable Zone (MRZ) on the document. */
            fun mrzLine1(mrzLine1: String) = mrzLine1(JsonField.of(mrzLine1))

            /**
             * Sets [Builder.mrzLine1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mrzLine1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mrzLine1(mrzLine1: JsonField<String>) = apply { this.mrzLine1 = mrzLine1 }

            /** Second line of the MRZ on the document. */
            fun mrzLine2(mrzLine2: String) = mrzLine2(JsonField.of(mrzLine2))

            /**
             * Sets [Builder.mrzLine2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mrzLine2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mrzLine2(mrzLine2: JsonField<String>) = apply { this.mrzLine2 = mrzLine2 }

            /** Third line of the MRZ if applicable; otherwise null. */
            fun mrzLine3(mrzLine3: String?) = mrzLine3(JsonField.ofNullable(mrzLine3))

            /**
             * Sets [Builder.mrzLine3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mrzLine3] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mrzLine3(mrzLine3: JsonField<String>) = apply { this.mrzLine3 = mrzLine3 }

            /** Type of document (e.g., passport, identity card). */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [IdentityCard].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): IdentityCard =
                IdentityCard(
                    id,
                    backDocumentSignedUrl,
                    birthPlace,
                    birthday,
                    country,
                    expirationDate,
                    firstName,
                    frontDocumentSignedUrl,
                    gender,
                    issueDate,
                    lastName,
                    mrzLine1,
                    mrzLine2,
                    mrzLine3,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): IdentityCard = apply {
            if (validated) {
                return@apply
            }

            id()
            backDocumentSignedUrl()
            birthPlace()
            birthday()
            country()
            expirationDate()
            firstName()
            frontDocumentSignedUrl()
            gender()
            issueDate()
            lastName()
            mrzLine1()
            mrzLine2()
            mrzLine3()
            type()
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
                (if (backDocumentSignedUrl.asKnown() == null) 0 else 1) +
                (if (birthPlace.asKnown() == null) 0 else 1) +
                (if (birthday.asKnown() == null) 0 else 1) +
                (if (country.asKnown() == null) 0 else 1) +
                (if (expirationDate.asKnown() == null) 0 else 1) +
                (if (firstName.asKnown() == null) 0 else 1) +
                (if (frontDocumentSignedUrl.asKnown() == null) 0 else 1) +
                (if (gender.asKnown() == null) 0 else 1) +
                (if (issueDate.asKnown() == null) 0 else 1) +
                (if (lastName.asKnown() == null) 0 else 1) +
                (if (mrzLine1.asKnown() == null) 0 else 1) +
                (if (mrzLine2.asKnown() == null) 0 else 1) +
                (if (mrzLine3.asKnown() == null) 0 else 1) +
                (if (type.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IdentityCard &&
                id == other.id &&
                backDocumentSignedUrl == other.backDocumentSignedUrl &&
                birthPlace == other.birthPlace &&
                birthday == other.birthday &&
                country == other.country &&
                expirationDate == other.expirationDate &&
                firstName == other.firstName &&
                frontDocumentSignedUrl == other.frontDocumentSignedUrl &&
                gender == other.gender &&
                issueDate == other.issueDate &&
                lastName == other.lastName &&
                mrzLine1 == other.mrzLine1 &&
                mrzLine2 == other.mrzLine2 &&
                mrzLine3 == other.mrzLine3 &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                backDocumentSignedUrl,
                birthPlace,
                birthday,
                country,
                expirationDate,
                firstName,
                frontDocumentSignedUrl,
                gender,
                issueDate,
                lastName,
                mrzLine1,
                mrzLine2,
                mrzLine3,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IdentityCard{id=$id, backDocumentSignedUrl=$backDocumentSignedUrl, birthPlace=$birthPlace, birthday=$birthday, country=$country, expirationDate=$expirationDate, firstName=$firstName, frontDocumentSignedUrl=$frontDocumentSignedUrl, gender=$gender, issueDate=$issueDate, lastName=$lastName, mrzLine1=$mrzLine1, mrzLine2=$mrzLine2, mrzLine3=$mrzLine3, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Personal details of the individual, such as name, date of birth, and contact info. */
    class Person
    private constructor(
        private val birthday: JsonField<String>,
        private val email: JsonField<String>,
        private val faceImageSignedUrl: JsonField<String>,
        private val firstName: JsonField<String>,
        private val fullName: JsonField<String>,
        private val gender: JsonField<String>,
        private val lastName: JsonField<String>,
        private val maidenName: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("birthday")
            @ExcludeMissing
            birthday: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("face_image_signed_url")
            @ExcludeMissing
            faceImageSignedUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("full_name")
            @ExcludeMissing
            fullName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gender") @ExcludeMissing gender: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maiden_name")
            @ExcludeMissing
            maidenName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            birthday,
            email,
            faceImageSignedUrl,
            firstName,
            fullName,
            gender,
            lastName,
            maidenName,
            phoneNumber,
            mutableMapOf(),
        )

        /**
         * Date of birth, formatted as DD/MM/YYYY.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun birthday(): String? = birthday.getNullable("birthday")

        /**
         * Email address of the individual.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun email(): String? = email.getNullable("email")

        /**
         * Signed URL linking to the person’s face image.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun faceImageSignedUrl(): String? = faceImageSignedUrl.getNullable("face_image_signed_url")

        /**
         * First (given) name of the person.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun firstName(): String? = firstName.getNullable("first_name")

        /**
         * Full name of the person, typically concatenation of first and last names.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fullName(): String? = fullName.getNullable("full_name")

        /**
         * Gender of the individual (e.g., "M" for male, "F" for female).
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun gender(): String? = gender.getNullable("gender")

        /**
         * Last (family) name of the person.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lastName(): String? = lastName.getNullable("last_name")

        /**
         * Maiden name of the person, if applicable.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maidenName(): String? = maidenName.getNullable("maiden_name")

        /**
         * Contact phone number including country code.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

        /**
         * Returns the raw JSON value of [birthday].
         *
         * Unlike [birthday], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("birthday") @ExcludeMissing fun _birthday(): JsonField<String> = birthday

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [faceImageSignedUrl].
         *
         * Unlike [faceImageSignedUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("face_image_signed_url")
        @ExcludeMissing
        fun _faceImageSignedUrl(): JsonField<String> = faceImageSignedUrl

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [fullName].
         *
         * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("full_name") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

        /**
         * Returns the raw JSON value of [gender].
         *
         * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<String> = gender

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [maidenName].
         *
         * Unlike [maidenName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maiden_name")
        @ExcludeMissing
        fun _maidenName(): JsonField<String> = maidenName

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
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

            /** Returns a mutable builder for constructing an instance of [Person]. */
            fun builder() = Builder()
        }

        /** A builder for [Person]. */
        class Builder internal constructor() {

            private var birthday: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var faceImageSignedUrl: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var fullName: JsonField<String> = JsonMissing.of()
            private var gender: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var maidenName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(person: Person) = apply {
                birthday = person.birthday
                email = person.email
                faceImageSignedUrl = person.faceImageSignedUrl
                firstName = person.firstName
                fullName = person.fullName
                gender = person.gender
                lastName = person.lastName
                maidenName = person.maidenName
                phoneNumber = person.phoneNumber
                additionalProperties = person.additionalProperties.toMutableMap()
            }

            /** Date of birth, formatted as DD/MM/YYYY. */
            fun birthday(birthday: String) = birthday(JsonField.of(birthday))

            /**
             * Sets [Builder.birthday] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthday] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthday(birthday: JsonField<String>) = apply { this.birthday = birthday }

            /** Email address of the individual. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Signed URL linking to the person’s face image. */
            fun faceImageSignedUrl(faceImageSignedUrl: String) =
                faceImageSignedUrl(JsonField.of(faceImageSignedUrl))

            /**
             * Sets [Builder.faceImageSignedUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.faceImageSignedUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun faceImageSignedUrl(faceImageSignedUrl: JsonField<String>) = apply {
                this.faceImageSignedUrl = faceImageSignedUrl
            }

            /** First (given) name of the person. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** Full name of the person, typically concatenation of first and last names. */
            fun fullName(fullName: String) = fullName(JsonField.of(fullName))

            /**
             * Sets [Builder.fullName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fullName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

            /** Gender of the individual (e.g., "M" for male, "F" for female). */
            fun gender(gender: String) = gender(JsonField.of(gender))

            /**
             * Sets [Builder.gender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gender] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gender(gender: JsonField<String>) = apply { this.gender = gender }

            /** Last (family) name of the person. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** Maiden name of the person, if applicable. */
            fun maidenName(maidenName: String) = maidenName(JsonField.of(maidenName))

            /**
             * Sets [Builder.maidenName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maidenName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maidenName(maidenName: JsonField<String>) = apply { this.maidenName = maidenName }

            /** Contact phone number including country code. */
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
             * Returns an immutable instance of [Person].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Person =
                Person(
                    birthday,
                    email,
                    faceImageSignedUrl,
                    firstName,
                    fullName,
                    gender,
                    lastName,
                    maidenName,
                    phoneNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Person = apply {
            if (validated) {
                return@apply
            }

            birthday()
            email()
            faceImageSignedUrl()
            firstName()
            fullName()
            gender()
            lastName()
            maidenName()
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
            (if (birthday.asKnown() == null) 0 else 1) +
                (if (email.asKnown() == null) 0 else 1) +
                (if (faceImageSignedUrl.asKnown() == null) 0 else 1) +
                (if (firstName.asKnown() == null) 0 else 1) +
                (if (fullName.asKnown() == null) 0 else 1) +
                (if (gender.asKnown() == null) 0 else 1) +
                (if (lastName.asKnown() == null) 0 else 1) +
                (if (maidenName.asKnown() == null) 0 else 1) +
                (if (phoneNumber.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Person &&
                birthday == other.birthday &&
                email == other.email &&
                faceImageSignedUrl == other.faceImageSignedUrl &&
                firstName == other.firstName &&
                fullName == other.fullName &&
                gender == other.gender &&
                lastName == other.lastName &&
                maidenName == other.maidenName &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                birthday,
                email,
                faceImageSignedUrl,
                firstName,
                fullName,
                gender,
                lastName,
                maidenName,
                phoneNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Person{birthday=$birthday, email=$email, faceImageSignedUrl=$faceImageSignedUrl, firstName=$firstName, fullName=$fullName, gender=$gender, lastName=$lastName, maidenName=$maidenName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    /**
     * Represents a key-value metadata tag that can be associated with entities such as individuals
     * or companies.
     */
    class Tag
    private constructor(
        private val key: JsonField<String>,
        private val private_: JsonField<Boolean>,
        private val type: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("private")
            @ExcludeMissing
            private_: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(key, private_, type, value, mutableMapOf())

        /**
         * Name of the tag used to identify the metadata field.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun key(): String? = key.getNullable("key")

        /**
         * Indicates whether the tag is private (not visible to external users).
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun private_(): Boolean? = private_.getNullable("private")

        /**
         * Data type of the tag value (e.g., "string", "number", "boolean").
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): String? = type.getNullable("type")

        /**
         * Value assigned to the tag.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun value(): String? = value.getNullable("value")

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [private_].
         *
         * Unlike [private_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("private") @ExcludeMissing fun _private_(): JsonField<Boolean> = private_

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

            /** Returns a mutable builder for constructing an instance of [Tag]. */
            fun builder() = Builder()
        }

        /** A builder for [Tag]. */
        class Builder internal constructor() {

            private var key: JsonField<String> = JsonMissing.of()
            private var private_: JsonField<Boolean> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tag: Tag) = apply {
                key = tag.key
                private_ = tag.private_
                type = tag.type
                value = tag.value
                additionalProperties = tag.additionalProperties.toMutableMap()
            }

            /** Name of the tag used to identify the metadata field. */
            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            /** Indicates whether the tag is private (not visible to external users). */
            fun private_(private_: Boolean) = private_(JsonField.of(private_))

            /**
             * Sets [Builder.private_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.private_] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun private_(private_: JsonField<Boolean>) = apply { this.private_ = private_ }

            /** Data type of the tag value (e.g., "string", "number", "boolean"). */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** Value assigned to the tag. */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [Tag].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Tag = Tag(key, private_, type, value, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Tag = apply {
            if (validated) {
                return@apply
            }

            key()
            private_()
            type()
            value()
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
            (if (key.asKnown() == null) 0 else 1) +
                (if (private_.asKnown() == null) 0 else 1) +
                (if (type.asKnown() == null) 0 else 1) +
                (if (value.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tag &&
                key == other.key &&
                private_ == other.private_ &&
                type == other.type &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(key, private_, type, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tag{key=$key, private_=$private_, type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Individual &&
            id == other.id &&
            amlSuspicions == other.amlSuspicions &&
            authUrl == other.authUrl &&
            certificat == other.certificat &&
            checks == other.checks &&
            createdAt == other.createdAt &&
            documents == other.documents &&
            identityCard == other.identityCard &&
            number == other.number &&
            person == other.person &&
            portalUrl == other.portalUrl &&
            properties == other.properties &&
            risk == other.risk &&
            sourceId == other.sourceId &&
            state == other.state &&
            status == other.status &&
            tags == other.tags &&
            technicalData == other.technicalData &&
            webviewUrl == other.webviewUrl &&
            workspaceId == other.workspaceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amlSuspicions,
            authUrl,
            certificat,
            checks,
            createdAt,
            documents,
            identityCard,
            number,
            person,
            portalUrl,
            properties,
            risk,
            sourceId,
            state,
            status,
            tags,
            technicalData,
            webviewUrl,
            workspaceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Individual{id=$id, amlSuspicions=$amlSuspicions, authUrl=$authUrl, certificat=$certificat, checks=$checks, createdAt=$createdAt, documents=$documents, identityCard=$identityCard, number=$number, person=$person, portalUrl=$portalUrl, properties=$properties, risk=$risk, sourceId=$sourceId, state=$state, status=$status, tags=$tags, technicalData=$technicalData, webviewUrl=$webviewUrl, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
}
