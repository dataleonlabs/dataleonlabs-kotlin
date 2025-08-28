// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies.documents

import com.dataleonlabs.api.core.ExcludeMissing
import com.dataleonlabs.api.core.JsonField
import com.dataleonlabs.api.core.JsonMissing
import com.dataleonlabs.api.core.JsonValue
import com.dataleonlabs.api.core.checkKnown
import com.dataleonlabs.api.core.toImmutable
import com.dataleonlabs.api.errors.DataleonlabsInvalidDataException
import com.dataleonlabs.api.models.companies.Check
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Represents a general document with metadata, verification checks, and extracted data. */
class GenericDocument
private constructor(
    private val id: JsonField<String>,
    private val checks: JsonField<List<Check>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val documentType: JsonField<String>,
    private val name: JsonField<String>,
    private val signedUrl: JsonField<String>,
    private val state: JsonField<String>,
    private val status: JsonField<String>,
    private val tables: JsonField<List<Table>>,
    private val values: JsonField<List<Value>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("checks") @ExcludeMissing checks: JsonField<List<Check>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("document_type")
        @ExcludeMissing
        documentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signed_url") @ExcludeMissing signedUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tables") @ExcludeMissing tables: JsonField<List<Table>> = JsonMissing.of(),
        @JsonProperty("values") @ExcludeMissing values: JsonField<List<Value>> = JsonMissing.of(),
    ) : this(
        id,
        checks,
        createdAt,
        documentType,
        name,
        signedUrl,
        state,
        status,
        tables,
        values,
        mutableMapOf(),
    )

    /**
     * Unique identifier of the document.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * List of verification checks performed on the document.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun checks(): List<Check>? = checks.getNullable("checks")

    /**
     * Timestamp when the document was created or uploaded.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

    /**
     * Type/category of the document.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documentType(): String? = documentType.getNullable("document_type")

    /**
     * Name or label for the document.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * Signed URL for accessing the document file.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signedUrl(): String? = signedUrl.getNullable("signed_url")

    /**
     * Current processing state of the document (e.g., WAITING, PROCESSED).
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun state(): String? = state.getNullable("state")

    /**
     * Status of the document reception or approval.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): String? = status.getNullable("status")

    /**
     * List of tables extracted from the document, each containing operations.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tables(): List<Table>? = tables.getNullable("tables")

    /**
     * Extracted key-value pairs from the document, including confidence scores.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun values(): List<Value>? = values.getNullable("values")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Returns the raw JSON value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_type")
    @ExcludeMissing
    fun _documentType(): JsonField<String> = documentType

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [signedUrl].
     *
     * Unlike [signedUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signed_url") @ExcludeMissing fun _signedUrl(): JsonField<String> = signedUrl

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
     * Returns the raw JSON value of [tables].
     *
     * Unlike [tables], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tables") @ExcludeMissing fun _tables(): JsonField<List<Table>> = tables

    /**
     * Returns the raw JSON value of [values].
     *
     * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<Value>> = values

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

        /** Returns a mutable builder for constructing an instance of [GenericDocument]. */
        fun builder() = Builder()
    }

    /** A builder for [GenericDocument]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var checks: JsonField<MutableList<Check>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var documentType: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var signedUrl: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var tables: JsonField<MutableList<Table>>? = null
        private var values: JsonField<MutableList<Value>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(genericDocument: GenericDocument) = apply {
            id = genericDocument.id
            checks = genericDocument.checks.map { it.toMutableList() }
            createdAt = genericDocument.createdAt
            documentType = genericDocument.documentType
            name = genericDocument.name
            signedUrl = genericDocument.signedUrl
            state = genericDocument.state
            status = genericDocument.status
            tables = genericDocument.tables.map { it.toMutableList() }
            values = genericDocument.values.map { it.toMutableList() }
            additionalProperties = genericDocument.additionalProperties.toMutableMap()
        }

        /** Unique identifier of the document. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** List of verification checks performed on the document. */
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

        /** Timestamp when the document was created or uploaded. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Type/category of the document. */
        fun documentType(documentType: String) = documentType(JsonField.of(documentType))

        /**
         * Sets [Builder.documentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentType(documentType: JsonField<String>) = apply {
            this.documentType = documentType
        }

        /** Name or label for the document. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Signed URL for accessing the document file. */
        fun signedUrl(signedUrl: String) = signedUrl(JsonField.of(signedUrl))

        /**
         * Sets [Builder.signedUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signedUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signedUrl(signedUrl: JsonField<String>) = apply { this.signedUrl = signedUrl }

        /** Current processing state of the document (e.g., WAITING, PROCESSED). */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** Status of the document reception or approval. */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** List of tables extracted from the document, each containing operations. */
        fun tables(tables: List<Table>) = tables(JsonField.of(tables))

        /**
         * Sets [Builder.tables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tables] with a well-typed `List<Table>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tables(tables: JsonField<List<Table>>) = apply {
            this.tables = tables.map { it.toMutableList() }
        }

        /**
         * Adds a single [Table] to [tables].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTable(table: Table) = apply {
            tables =
                (tables ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tables", it).add(table)
                }
        }

        /** Extracted key-value pairs from the document, including confidence scores. */
        fun values(values: List<Value>) = values(JsonField.of(values))

        /**
         * Sets [Builder.values] to an arbitrary JSON value.
         *
         * You should usually call [Builder.values] with a well-typed `List<Value>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun values(values: JsonField<List<Value>>) = apply {
            this.values = values.map { it.toMutableList() }
        }

        /**
         * Adds a single [Value] to [values].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addValue(value: Value) = apply {
            values =
                (values ?: JsonField.of(mutableListOf())).also {
                    checkKnown("values", it).add(value)
                }
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
         * Returns an immutable instance of [GenericDocument].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GenericDocument =
            GenericDocument(
                id,
                (checks ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                documentType,
                name,
                signedUrl,
                state,
                status,
                (tables ?: JsonMissing.of()).map { it.toImmutable() },
                (values ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GenericDocument = apply {
        if (validated) {
            return@apply
        }

        id()
        checks()?.forEach { it.validate() }
        createdAt()
        documentType()
        name()
        signedUrl()
        state()
        status()
        tables()?.forEach { it.validate() }
        values()?.forEach { it.validate() }
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
            (checks.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (documentType.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (signedUrl.asKnown() == null) 0 else 1) +
            (if (state.asKnown() == null) 0 else 1) +
            (if (status.asKnown() == null) 0 else 1) +
            (tables.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (values.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class Table
    private constructor(
        private val operation: JsonField<List<JsonValue>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("operation")
            @ExcludeMissing
            operation: JsonField<List<JsonValue>> = JsonMissing.of()
        ) : this(operation, mutableMapOf())

        /**
         * List of operations or actions associated with the table.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun operation(): List<JsonValue>? = operation.getNullable("operation")

        /**
         * Returns the raw JSON value of [operation].
         *
         * Unlike [operation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operation")
        @ExcludeMissing
        fun _operation(): JsonField<List<JsonValue>> = operation

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

            /** Returns a mutable builder for constructing an instance of [Table]. */
            fun builder() = Builder()
        }

        /** A builder for [Table]. */
        class Builder internal constructor() {

            private var operation: JsonField<MutableList<JsonValue>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(table: Table) = apply {
                operation = table.operation.map { it.toMutableList() }
                additionalProperties = table.additionalProperties.toMutableMap()
            }

            /** List of operations or actions associated with the table. */
            fun operation(operation: List<JsonValue>) = operation(JsonField.of(operation))

            /**
             * Sets [Builder.operation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operation] with a well-typed `List<JsonValue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operation(operation: JsonField<List<JsonValue>>) = apply {
                this.operation = operation.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [Builder.operation].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOperation(operation: JsonValue) = apply {
                this.operation =
                    (this.operation ?: JsonField.of(mutableListOf())).also {
                        checkKnown("operation", it).add(operation)
                    }
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
             * Returns an immutable instance of [Table].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Table =
                Table(
                    (operation ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Table = apply {
            if (validated) {
                return@apply
            }

            operation()
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
        internal fun validity(): Int = (operation.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Table &&
                operation == other.operation &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(operation, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Table{operation=$operation, additionalProperties=$additionalProperties}"
    }

    class Value
    private constructor(
        private val confidence: JsonField<Double>,
        private val name: JsonField<String>,
        private val value: JsonField<List<Long>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("confidence")
            @ExcludeMissing
            confidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<List<Long>> = JsonMissing.of(),
        ) : this(confidence, name, value, mutableMapOf())

        /**
         * Confidence score (between 0 and 1) for the extracted value.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun confidence(): Double? = confidence.getNullable("confidence")

        /**
         * Name or label of the extracted field.
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * List of integer values related to the field (e.g., bounding box coordinates).
         *
         * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun value(): List<Long>? = value.getNullable("value")

        /**
         * Returns the raw JSON value of [confidence].
         *
         * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confidence")
        @ExcludeMissing
        fun _confidence(): JsonField<Double> = confidence

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<List<Long>> = value

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

            /** Returns a mutable builder for constructing an instance of [Value]. */
            fun builder() = Builder()
        }

        /** A builder for [Value]. */
        class Builder internal constructor() {

            private var confidence: JsonField<Double> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var value: JsonField<MutableList<Long>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(value: Value) = apply {
                confidence = value.confidence
                name = value.name
                this.value = value.value.map { it.toMutableList() }
                additionalProperties = value.additionalProperties.toMutableMap()
            }

            /** Confidence score (between 0 and 1) for the extracted value. */
            fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

            /**
             * Sets [Builder.confidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

            /** Name or label of the extracted field. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** List of integer values related to the field (e.g., bounding box coordinates). */
            fun value(value: List<Long>) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed `List<Long>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<List<Long>>) = apply {
                this.value = value.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [Builder.value].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addValue(value: Long) = apply {
                this.value =
                    (this.value ?: JsonField.of(mutableListOf())).also {
                        checkKnown("value", it).add(value)
                    }
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
             * Returns an immutable instance of [Value].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Value =
                Value(
                    confidence,
                    name,
                    (value ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Value = apply {
            if (validated) {
                return@apply
            }

            confidence()
            name()
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
            (if (confidence.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (value.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Value &&
                confidence == other.confidence &&
                name == other.name &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(confidence, name, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Value{confidence=$confidence, name=$name, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GenericDocument &&
            id == other.id &&
            checks == other.checks &&
            createdAt == other.createdAt &&
            documentType == other.documentType &&
            name == other.name &&
            signedUrl == other.signedUrl &&
            state == other.state &&
            status == other.status &&
            tables == other.tables &&
            values == other.values &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            checks,
            createdAt,
            documentType,
            name,
            signedUrl,
            state,
            status,
            tables,
            values,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GenericDocument{id=$id, checks=$checks, createdAt=$createdAt, documentType=$documentType, name=$name, signedUrl=$signedUrl, state=$state, status=$status, tables=$tables, values=$values, additionalProperties=$additionalProperties}"
}
