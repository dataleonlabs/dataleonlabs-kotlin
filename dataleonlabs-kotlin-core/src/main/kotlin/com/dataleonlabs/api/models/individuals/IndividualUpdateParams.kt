// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.individuals

import com.dataleonlabs.api.core.Enum
import com.dataleonlabs.api.core.ExcludeMissing
import com.dataleonlabs.api.core.JsonField
import com.dataleonlabs.api.core.JsonMissing
import com.dataleonlabs.api.core.JsonValue
import com.dataleonlabs.api.core.Params
import com.dataleonlabs.api.core.checkRequired
import com.dataleonlabs.api.core.http.Headers
import com.dataleonlabs.api.core.http.QueryParams
import com.dataleonlabs.api.errors.DataleonlabsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Update an individual by ID */
class IndividualUpdateParams
private constructor(
    private val individualId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun individualId(): String? = individualId

    /**
     * Unique identifier of the workspace where the individual is being registered.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun workspaceId(): String = body.workspaceId()

    /**
     * Personal information about the individual.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun person(): Person? = body.person()

    /**
     * Optional identifier for tracking the source system or integration from your system.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sourceId(): String? = body.sourceId()

    /**
     * Technical metadata related to the request or processing.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun technicalData(): TechnicalData? = body.technicalData()

    /**
     * Returns the raw JSON value of [workspaceId].
     *
     * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _workspaceId(): JsonField<String> = body._workspaceId()

    /**
     * Returns the raw JSON value of [person].
     *
     * Unlike [person], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _person(): JsonField<Person> = body._person()

    /**
     * Returns the raw JSON value of [sourceId].
     *
     * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sourceId(): JsonField<String> = body._sourceId()

    /**
     * Returns the raw JSON value of [technicalData].
     *
     * Unlike [technicalData], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _technicalData(): JsonField<TechnicalData> = body._technicalData()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IndividualUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .workspaceId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IndividualUpdateParams]. */
    class Builder internal constructor() {

        private var individualId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(individualUpdateParams: IndividualUpdateParams) = apply {
            individualId = individualUpdateParams.individualId
            body = individualUpdateParams.body.toBuilder()
            additionalHeaders = individualUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = individualUpdateParams.additionalQueryParams.toBuilder()
        }

        fun individualId(individualId: String?) = apply { this.individualId = individualId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [workspaceId]
         * - [person]
         * - [sourceId]
         * - [technicalData]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Unique identifier of the workspace where the individual is being registered. */
        fun workspaceId(workspaceId: String) = apply { body.workspaceId(workspaceId) }

        /**
         * Sets [Builder.workspaceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspaceId(workspaceId: JsonField<String>) = apply { body.workspaceId(workspaceId) }

        /** Personal information about the individual. */
        fun person(person: Person) = apply { body.person(person) }

        /**
         * Sets [Builder.person] to an arbitrary JSON value.
         *
         * You should usually call [Builder.person] with a well-typed [Person] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun person(person: JsonField<Person>) = apply { body.person(person) }

        /** Optional identifier for tracking the source system or integration from your system. */
        fun sourceId(sourceId: String) = apply { body.sourceId(sourceId) }

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { body.sourceId(sourceId) }

        /** Technical metadata related to the request or processing. */
        fun technicalData(technicalData: TechnicalData) = apply {
            body.technicalData(technicalData)
        }

        /**
         * Sets [Builder.technicalData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.technicalData] with a well-typed [TechnicalData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun technicalData(technicalData: JsonField<TechnicalData>) = apply {
            body.technicalData(technicalData)
        }

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
         * Returns an immutable instance of [IndividualUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .workspaceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IndividualUpdateParams =
            IndividualUpdateParams(
                individualId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> individualId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val workspaceId: JsonField<String>,
        private val person: JsonField<Person>,
        private val sourceId: JsonField<String>,
        private val technicalData: JsonField<TechnicalData>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("workspace_id")
            @ExcludeMissing
            workspaceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("person") @ExcludeMissing person: JsonField<Person> = JsonMissing.of(),
            @JsonProperty("source_id")
            @ExcludeMissing
            sourceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("technical_data")
            @ExcludeMissing
            technicalData: JsonField<TechnicalData> = JsonMissing.of(),
        ) : this(workspaceId, person, sourceId, technicalData, mutableMapOf())

        /**
         * Unique identifier of the workspace where the individual is being registered.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun workspaceId(): String = workspaceId.getRequired("workspace_id")

        /**
         * Personal information about the individual.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun person(): Person? = person.getNullable("person")

        /**
         * Optional identifier for tracking the source system or integration from your system.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sourceId(): String? = sourceId.getNullable("source_id")

        /**
         * Technical metadata related to the request or processing.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun technicalData(): TechnicalData? = technicalData.getNullable("technical_data")

        /**
         * Returns the raw JSON value of [workspaceId].
         *
         * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("workspace_id")
        @ExcludeMissing
        fun _workspaceId(): JsonField<String> = workspaceId

        /**
         * Returns the raw JSON value of [person].
         *
         * Unlike [person], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("person") @ExcludeMissing fun _person(): JsonField<Person> = person

        /**
         * Returns the raw JSON value of [sourceId].
         *
         * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

        /**
         * Returns the raw JSON value of [technicalData].
         *
         * Unlike [technicalData], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("technical_data")
        @ExcludeMissing
        fun _technicalData(): JsonField<TechnicalData> = technicalData

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
             * .workspaceId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var workspaceId: JsonField<String>? = null
            private var person: JsonField<Person> = JsonMissing.of()
            private var sourceId: JsonField<String> = JsonMissing.of()
            private var technicalData: JsonField<TechnicalData> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                workspaceId = body.workspaceId
                person = body.person
                sourceId = body.sourceId
                technicalData = body.technicalData
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Unique identifier of the workspace where the individual is being registered. */
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

            /** Personal information about the individual. */
            fun person(person: Person) = person(JsonField.of(person))

            /**
             * Sets [Builder.person] to an arbitrary JSON value.
             *
             * You should usually call [Builder.person] with a well-typed [Person] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun person(person: JsonField<Person>) = apply { this.person = person }

            /**
             * Optional identifier for tracking the source system or integration from your system.
             */
            fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

            /**
             * Sets [Builder.sourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

            /** Technical metadata related to the request or processing. */
            fun technicalData(technicalData: TechnicalData) =
                technicalData(JsonField.of(technicalData))

            /**
             * Sets [Builder.technicalData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.technicalData] with a well-typed [TechnicalData]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun technicalData(technicalData: JsonField<TechnicalData>) = apply {
                this.technicalData = technicalData
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .workspaceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("workspaceId", workspaceId),
                    person,
                    sourceId,
                    technicalData,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            workspaceId()
            person()?.validate()
            sourceId()
            technicalData()?.validate()
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
            (if (workspaceId.asKnown() == null) 0 else 1) +
                (person.asKnown()?.validity() ?: 0) +
                (if (sourceId.asKnown() == null) 0 else 1) +
                (technicalData.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                workspaceId == other.workspaceId &&
                person == other.person &&
                sourceId == other.sourceId &&
                technicalData == other.technicalData &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(workspaceId, person, sourceId, technicalData, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{workspaceId=$workspaceId, person=$person, sourceId=$sourceId, technicalData=$technicalData, additionalProperties=$additionalProperties}"
    }

    /** Personal information about the individual. */
    class Person
    private constructor(
        private val birthday: JsonField<String>,
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val gender: JsonField<Gender>,
        private val lastName: JsonField<String>,
        private val maidenName: JsonField<String>,
        private val nationality: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("birthday")
            @ExcludeMissing
            birthday: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gender") @ExcludeMissing gender: JsonField<Gender> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maiden_name")
            @ExcludeMissing
            maidenName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nationality")
            @ExcludeMissing
            nationality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            birthday,
            email,
            firstName,
            gender,
            lastName,
            maidenName,
            nationality,
            phoneNumber,
            mutableMapOf(),
        )

        /**
         * Date of birth in DD/MM/YYYY format.
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
         * First name of the individual.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun firstName(): String? = firstName.getNullable("first_name")

        /**
         * Gender of the individual (M for male, F for female).
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun gender(): Gender? = gender.getNullable("gender")

        /**
         * Last name (family name) of the individual.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lastName(): String? = lastName.getNullable("last_name")

        /**
         * Maiden name, if applicable.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maidenName(): String? = maidenName.getNullable("maiden_name")

        /**
         * Nationality of the individual (ISO 3166-1 alpha-3 country code).
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun nationality(): String? = nationality.getNullable("nationality")

        /**
         * Phone number of the individual.
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
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [gender].
         *
         * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<Gender> = gender

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
         * Returns the raw JSON value of [nationality].
         *
         * Unlike [nationality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nationality")
        @ExcludeMissing
        fun _nationality(): JsonField<String> = nationality

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
            private var firstName: JsonField<String> = JsonMissing.of()
            private var gender: JsonField<Gender> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var maidenName: JsonField<String> = JsonMissing.of()
            private var nationality: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(person: Person) = apply {
                birthday = person.birthday
                email = person.email
                firstName = person.firstName
                gender = person.gender
                lastName = person.lastName
                maidenName = person.maidenName
                nationality = person.nationality
                phoneNumber = person.phoneNumber
                additionalProperties = person.additionalProperties.toMutableMap()
            }

            /** Date of birth in DD/MM/YYYY format. */
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

            /** First name of the individual. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** Gender of the individual (M for male, F for female). */
            fun gender(gender: Gender) = gender(JsonField.of(gender))

            /**
             * Sets [Builder.gender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gender] with a well-typed [Gender] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gender(gender: JsonField<Gender>) = apply { this.gender = gender }

            /** Last name (family name) of the individual. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** Maiden name, if applicable. */
            fun maidenName(maidenName: String) = maidenName(JsonField.of(maidenName))

            /**
             * Sets [Builder.maidenName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maidenName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maidenName(maidenName: JsonField<String>) = apply { this.maidenName = maidenName }

            /** Nationality of the individual (ISO 3166-1 alpha-3 country code). */
            fun nationality(nationality: String) = nationality(JsonField.of(nationality))

            /**
             * Sets [Builder.nationality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nationality] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nationality(nationality: JsonField<String>) = apply {
                this.nationality = nationality
            }

            /** Phone number of the individual. */
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
                    firstName,
                    gender,
                    lastName,
                    maidenName,
                    nationality,
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
            firstName()
            gender()?.validate()
            lastName()
            maidenName()
            nationality()
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
                (if (firstName.asKnown() == null) 0 else 1) +
                (gender.asKnown()?.validity() ?: 0) +
                (if (lastName.asKnown() == null) 0 else 1) +
                (if (maidenName.asKnown() == null) 0 else 1) +
                (if (nationality.asKnown() == null) 0 else 1) +
                (if (phoneNumber.asKnown() == null) 0 else 1)

        /** Gender of the individual (M for male, F for female). */
        class Gender @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val M = of("M")

                val F = of("F")

                fun of(value: String) = Gender(JsonField.of(value))
            }

            /** An enum containing [Gender]'s known values. */
            enum class Known {
                M,
                F,
            }

            /**
             * An enum containing [Gender]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Gender] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                M,
                F,
                /**
                 * An enum member indicating that [Gender] was instantiated with an unknown value.
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
                    M -> Value.M
                    F -> Value.F
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
                    M -> Known.M
                    F -> Known.F
                    else -> throw DataleonlabsInvalidDataException("Unknown Gender: $value")
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

            fun validate(): Gender = apply {
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

                return other is Gender && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Person &&
                birthday == other.birthday &&
                email == other.email &&
                firstName == other.firstName &&
                gender == other.gender &&
                lastName == other.lastName &&
                maidenName == other.maidenName &&
                nationality == other.nationality &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                birthday,
                email,
                firstName,
                gender,
                lastName,
                maidenName,
                nationality,
                phoneNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Person{birthday=$birthday, email=$email, firstName=$firstName, gender=$gender, lastName=$lastName, maidenName=$maidenName, nationality=$nationality, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    /** Technical metadata related to the request or processing. */
    class TechnicalData
    private constructor(
        private val activeAmlSuspicions: JsonField<Boolean>,
        private val callbackUrl: JsonField<String>,
        private val callbackUrlNotification: JsonField<String>,
        private val filteringScoreAmlSuspicions: JsonField<Float>,
        private val language: JsonField<String>,
        private val rawData: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("active_aml_suspicions")
            @ExcludeMissing
            activeAmlSuspicions: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("callback_url")
            @ExcludeMissing
            callbackUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("callback_url_notification")
            @ExcludeMissing
            callbackUrlNotification: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filtering_score_aml_suspicions")
            @ExcludeMissing
            filteringScoreAmlSuspicions: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("raw_data") @ExcludeMissing rawData: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            activeAmlSuspicions,
            callbackUrl,
            callbackUrlNotification,
            filteringScoreAmlSuspicions,
            language,
            rawData,
            mutableMapOf(),
        )

        /**
         * Flag indicating whether there are active research AML (Anti-Money Laundering) suspicions
         * for the individual when you apply for a new entry or get an existing one.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun activeAmlSuspicions(): Boolean? =
            activeAmlSuspicions.getNullable("active_aml_suspicions")

        /**
         * URL to call back upon completion of processing.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun callbackUrl(): String? = callbackUrl.getNullable("callback_url")

        /**
         * URL for receive notifications about the processing state or status.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun callbackUrlNotification(): String? =
            callbackUrlNotification.getNullable("callback_url_notification")

        /**
         * Minimum filtering score (between 0 and 1) for AML suspicions to be considered.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun filteringScoreAmlSuspicions(): Float? =
            filteringScoreAmlSuspicions.getNullable("filtering_score_aml_suspicions")

        /**
         * Preferred language for communication (e.g., "eng", "fra").
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun language(): String? = language.getNullable("language")

        /**
         * Flag indicating whether to include raw data in the response.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rawData(): Boolean? = rawData.getNullable("raw_data")

        /**
         * Returns the raw JSON value of [activeAmlSuspicions].
         *
         * Unlike [activeAmlSuspicions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("active_aml_suspicions")
        @ExcludeMissing
        fun _activeAmlSuspicions(): JsonField<Boolean> = activeAmlSuspicions

        /**
         * Returns the raw JSON value of [callbackUrl].
         *
         * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callback_url")
        @ExcludeMissing
        fun _callbackUrl(): JsonField<String> = callbackUrl

        /**
         * Returns the raw JSON value of [callbackUrlNotification].
         *
         * Unlike [callbackUrlNotification], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("callback_url_notification")
        @ExcludeMissing
        fun _callbackUrlNotification(): JsonField<String> = callbackUrlNotification

        /**
         * Returns the raw JSON value of [filteringScoreAmlSuspicions].
         *
         * Unlike [filteringScoreAmlSuspicions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("filtering_score_aml_suspicions")
        @ExcludeMissing
        fun _filteringScoreAmlSuspicions(): JsonField<Float> = filteringScoreAmlSuspicions

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [rawData].
         *
         * Unlike [rawData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("raw_data") @ExcludeMissing fun _rawData(): JsonField<Boolean> = rawData

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

            /** Returns a mutable builder for constructing an instance of [TechnicalData]. */
            fun builder() = Builder()
        }

        /** A builder for [TechnicalData]. */
        class Builder internal constructor() {

            private var activeAmlSuspicions: JsonField<Boolean> = JsonMissing.of()
            private var callbackUrl: JsonField<String> = JsonMissing.of()
            private var callbackUrlNotification: JsonField<String> = JsonMissing.of()
            private var filteringScoreAmlSuspicions: JsonField<Float> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var rawData: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(technicalData: TechnicalData) = apply {
                activeAmlSuspicions = technicalData.activeAmlSuspicions
                callbackUrl = technicalData.callbackUrl
                callbackUrlNotification = technicalData.callbackUrlNotification
                filteringScoreAmlSuspicions = technicalData.filteringScoreAmlSuspicions
                language = technicalData.language
                rawData = technicalData.rawData
                additionalProperties = technicalData.additionalProperties.toMutableMap()
            }

            /**
             * Flag indicating whether there are active research AML (Anti-Money Laundering)
             * suspicions for the individual when you apply for a new entry or get an existing one.
             */
            fun activeAmlSuspicions(activeAmlSuspicions: Boolean) =
                activeAmlSuspicions(JsonField.of(activeAmlSuspicions))

            /**
             * Sets [Builder.activeAmlSuspicions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activeAmlSuspicions] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun activeAmlSuspicions(activeAmlSuspicions: JsonField<Boolean>) = apply {
                this.activeAmlSuspicions = activeAmlSuspicions
            }

            /** URL to call back upon completion of processing. */
            fun callbackUrl(callbackUrl: String) = callbackUrl(JsonField.of(callbackUrl))

            /**
             * Sets [Builder.callbackUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callbackUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callbackUrl(callbackUrl: JsonField<String>) = apply {
                this.callbackUrl = callbackUrl
            }

            /** URL for receive notifications about the processing state or status. */
            fun callbackUrlNotification(callbackUrlNotification: String) =
                callbackUrlNotification(JsonField.of(callbackUrlNotification))

            /**
             * Sets [Builder.callbackUrlNotification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callbackUrlNotification] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callbackUrlNotification(callbackUrlNotification: JsonField<String>) = apply {
                this.callbackUrlNotification = callbackUrlNotification
            }

            /** Minimum filtering score (between 0 and 1) for AML suspicions to be considered. */
            fun filteringScoreAmlSuspicions(filteringScoreAmlSuspicions: Float) =
                filteringScoreAmlSuspicions(JsonField.of(filteringScoreAmlSuspicions))

            /**
             * Sets [Builder.filteringScoreAmlSuspicions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filteringScoreAmlSuspicions] with a well-typed
             * [Float] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun filteringScoreAmlSuspicions(filteringScoreAmlSuspicions: JsonField<Float>) = apply {
                this.filteringScoreAmlSuspicions = filteringScoreAmlSuspicions
            }

            /** Preferred language for communication (e.g., "eng", "fra"). */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /** Flag indicating whether to include raw data in the response. */
            fun rawData(rawData: Boolean) = rawData(JsonField.of(rawData))

            /**
             * Sets [Builder.rawData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rawData] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rawData(rawData: JsonField<Boolean>) = apply { this.rawData = rawData }

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
             * Returns an immutable instance of [TechnicalData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TechnicalData =
                TechnicalData(
                    activeAmlSuspicions,
                    callbackUrl,
                    callbackUrlNotification,
                    filteringScoreAmlSuspicions,
                    language,
                    rawData,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TechnicalData = apply {
            if (validated) {
                return@apply
            }

            activeAmlSuspicions()
            callbackUrl()
            callbackUrlNotification()
            filteringScoreAmlSuspicions()
            language()
            rawData()
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
            (if (activeAmlSuspicions.asKnown() == null) 0 else 1) +
                (if (callbackUrl.asKnown() == null) 0 else 1) +
                (if (callbackUrlNotification.asKnown() == null) 0 else 1) +
                (if (filteringScoreAmlSuspicions.asKnown() == null) 0 else 1) +
                (if (language.asKnown() == null) 0 else 1) +
                (if (rawData.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TechnicalData &&
                activeAmlSuspicions == other.activeAmlSuspicions &&
                callbackUrl == other.callbackUrl &&
                callbackUrlNotification == other.callbackUrlNotification &&
                filteringScoreAmlSuspicions == other.filteringScoreAmlSuspicions &&
                language == other.language &&
                rawData == other.rawData &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                activeAmlSuspicions,
                callbackUrl,
                callbackUrlNotification,
                filteringScoreAmlSuspicions,
                language,
                rawData,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TechnicalData{activeAmlSuspicions=$activeAmlSuspicions, callbackUrl=$callbackUrl, callbackUrlNotification=$callbackUrlNotification, filteringScoreAmlSuspicions=$filteringScoreAmlSuspicions, language=$language, rawData=$rawData, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IndividualUpdateParams &&
            individualId == other.individualId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(individualId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "IndividualUpdateParams{individualId=$individualId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
