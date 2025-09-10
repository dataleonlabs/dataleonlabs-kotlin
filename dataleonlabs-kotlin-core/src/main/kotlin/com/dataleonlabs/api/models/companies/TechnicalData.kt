// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.models.companies

import com.dataleonlabs.api.core.ExcludeMissing
import com.dataleonlabs.api.core.JsonField
import com.dataleonlabs.api.core.JsonMissing
import com.dataleonlabs.api.core.JsonValue
import com.dataleonlabs.api.errors.DataleonlabsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Contains technical metadata related to processing and communication of an entity. */
class TechnicalData
private constructor(
    private val activeAmlSuspicions: JsonField<Boolean>,
    private val apiVersion: JsonField<Long>,
    private val approvedAt: JsonField<OffsetDateTime>,
    private val callbackUrl: JsonField<String>,
    private val callbackUrlNotification: JsonField<String>,
    private val disableNotification: JsonField<Boolean>,
    private val disableNotificationDate: JsonField<OffsetDateTime>,
    private val exportType: JsonField<String>,
    private val filteringScoreAmlSuspicions: JsonField<Float>,
    private val finishedAt: JsonField<OffsetDateTime>,
    private val ip: JsonField<String>,
    private val language: JsonField<String>,
    private val locationIp: JsonField<String>,
    private val needReviewAt: JsonField<OffsetDateTime>,
    private val notificationConfirmation: JsonField<Boolean>,
    private val qrCode: JsonField<String>,
    private val rawData: JsonField<Boolean>,
    private val rejectedAt: JsonField<OffsetDateTime>,
    private val sessionDuration: JsonField<Long>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val transferAt: JsonField<OffsetDateTime>,
    private val transferMode: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("active_aml_suspicions")
        @ExcludeMissing
        activeAmlSuspicions: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("api_version") @ExcludeMissing apiVersion: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("approved_at")
        @ExcludeMissing
        approvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("callback_url")
        @ExcludeMissing
        callbackUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("callback_url_notification")
        @ExcludeMissing
        callbackUrlNotification: JsonField<String> = JsonMissing.of(),
        @JsonProperty("disable_notification")
        @ExcludeMissing
        disableNotification: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("disable_notification_date")
        @ExcludeMissing
        disableNotificationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("export_type")
        @ExcludeMissing
        exportType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filtering_score_aml_suspicions")
        @ExcludeMissing
        filteringScoreAmlSuspicions: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("finished_at")
        @ExcludeMissing
        finishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ip") @ExcludeMissing ip: JsonField<String> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location_ip")
        @ExcludeMissing
        locationIp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("need_review_at")
        @ExcludeMissing
        needReviewAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("notification_confirmation")
        @ExcludeMissing
        notificationConfirmation: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("qr_code") @ExcludeMissing qrCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("raw_data") @ExcludeMissing rawData: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rejected_at")
        @ExcludeMissing
        rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("session_duration")
        @ExcludeMissing
        sessionDuration: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("started_at")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transfer_at")
        @ExcludeMissing
        transferAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transfer_mode")
        @ExcludeMissing
        transferMode: JsonField<String> = JsonMissing.of(),
    ) : this(
        activeAmlSuspicions,
        apiVersion,
        approvedAt,
        callbackUrl,
        callbackUrlNotification,
        disableNotification,
        disableNotificationDate,
        exportType,
        filteringScoreAmlSuspicions,
        finishedAt,
        ip,
        language,
        locationIp,
        needReviewAt,
        notificationConfirmation,
        qrCode,
        rawData,
        rejectedAt,
        sessionDuration,
        startedAt,
        transferAt,
        transferMode,
        mutableMapOf(),
    )

    /**
     * Flag indicating whether there are active research AML (Anti-Money Laundering) suspicions for
     * the object when you apply for a new entry or get an existing one.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun activeAmlSuspicions(): Boolean? = activeAmlSuspicions.getNullable("active_aml_suspicions")

    /**
     * Version number of the API used.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun apiVersion(): Long? = apiVersion.getNullable("api_version")

    /**
     * Timestamp when the request or process was approved.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun approvedAt(): OffsetDateTime? = approvedAt.getNullable("approved_at")

    /**
     * URL to receive callback data from the AML system.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun callbackUrl(): String? = callbackUrl.getNullable("callback_url")

    /**
     * URL to receive notification updates about the processing status.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun callbackUrlNotification(): String? =
        callbackUrlNotification.getNullable("callback_url_notification")

    /**
     * Flag to indicate if notifications are disabled.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun disableNotification(): Boolean? = disableNotification.getNullable("disable_notification")

    /**
     * Timestamp when notifications were disabled; null if never disabled.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun disableNotificationDate(): OffsetDateTime? =
        disableNotificationDate.getNullable("disable_notification_date")

    /**
     * Export format defined by the API (e.g., "json", "xml").
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun exportType(): String? = exportType.getNullable("export_type")

    /**
     * Minimum filtering score (between 0 and 1) for AML suspicions to be considered.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun filteringScoreAmlSuspicions(): Float? =
        filteringScoreAmlSuspicions.getNullable("filtering_score_aml_suspicions")

    /**
     * Timestamp when the process finished.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun finishedAt(): OffsetDateTime? = finishedAt.getNullable("finished_at")

    /**
     * IP address of the our system handling the request.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ip(): String? = ip.getNullable("ip")

    /**
     * Language preference used in the client workspace (e.g., "fra").
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun language(): String? = language.getNullable("language")

    /**
     * IP address of the end client (final user) captured.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun locationIp(): String? = locationIp.getNullable("location_ip")

    /**
     * Timestamp indicating when the request or process needs review; null if none.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun needReviewAt(): OffsetDateTime? = needReviewAt.getNullable("need_review_at")

    /**
     * Flag indicating if notification confirmation is required or received.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun notificationConfirmation(): Boolean? =
        notificationConfirmation.getNullable("notification_confirmation")

    /**
     * Indicates whether QR code is enabled ("true" or "false").
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun qrCode(): String? = qrCode.getNullable("qr_code")

    /**
     * Flag indicating whether to include raw data in the response.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rawData(): Boolean? = rawData.getNullable("raw_data")

    /**
     * Timestamp when the request or process was rejected; null if not rejected.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rejectedAt(): OffsetDateTime? = rejectedAt.getNullable("rejected_at")

    /**
     * Duration of the user session in seconds.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sessionDuration(): Long? = sessionDuration.getNullable("session_duration")

    /**
     * Timestamp when the process started.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    /**
     * Date/time of data transfer.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transferAt(): OffsetDateTime? = transferAt.getNullable("transfer_at")

    /**
     * Mode of data transfer.
     *
     * @throws DataleonlabsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transferMode(): String? = transferMode.getNullable("transfer_mode")

    /**
     * Returns the raw JSON value of [activeAmlSuspicions].
     *
     * Unlike [activeAmlSuspicions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("active_aml_suspicions")
    @ExcludeMissing
    fun _activeAmlSuspicions(): JsonField<Boolean> = activeAmlSuspicions

    /**
     * Returns the raw JSON value of [apiVersion].
     *
     * Unlike [apiVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_version") @ExcludeMissing fun _apiVersion(): JsonField<Long> = apiVersion

    /**
     * Returns the raw JSON value of [approvedAt].
     *
     * Unlike [approvedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approved_at")
    @ExcludeMissing
    fun _approvedAt(): JsonField<OffsetDateTime> = approvedAt

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
     * Returns the raw JSON value of [disableNotification].
     *
     * Unlike [disableNotification], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("disable_notification")
    @ExcludeMissing
    fun _disableNotification(): JsonField<Boolean> = disableNotification

    /**
     * Returns the raw JSON value of [disableNotificationDate].
     *
     * Unlike [disableNotificationDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("disable_notification_date")
    @ExcludeMissing
    fun _disableNotificationDate(): JsonField<OffsetDateTime> = disableNotificationDate

    /**
     * Returns the raw JSON value of [exportType].
     *
     * Unlike [exportType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("export_type") @ExcludeMissing fun _exportType(): JsonField<String> = exportType

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
     * Returns the raw JSON value of [finishedAt].
     *
     * Unlike [finishedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("finished_at")
    @ExcludeMissing
    fun _finishedAt(): JsonField<OffsetDateTime> = finishedAt

    /**
     * Returns the raw JSON value of [ip].
     *
     * Unlike [ip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

    /**
     * Returns the raw JSON value of [locationIp].
     *
     * Unlike [locationIp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location_ip") @ExcludeMissing fun _locationIp(): JsonField<String> = locationIp

    /**
     * Returns the raw JSON value of [needReviewAt].
     *
     * Unlike [needReviewAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("need_review_at")
    @ExcludeMissing
    fun _needReviewAt(): JsonField<OffsetDateTime> = needReviewAt

    /**
     * Returns the raw JSON value of [notificationConfirmation].
     *
     * Unlike [notificationConfirmation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("notification_confirmation")
    @ExcludeMissing
    fun _notificationConfirmation(): JsonField<Boolean> = notificationConfirmation

    /**
     * Returns the raw JSON value of [qrCode].
     *
     * Unlike [qrCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("qr_code") @ExcludeMissing fun _qrCode(): JsonField<String> = qrCode

    /**
     * Returns the raw JSON value of [rawData].
     *
     * Unlike [rawData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("raw_data") @ExcludeMissing fun _rawData(): JsonField<Boolean> = rawData

    /**
     * Returns the raw JSON value of [rejectedAt].
     *
     * Unlike [rejectedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rejected_at")
    @ExcludeMissing
    fun _rejectedAt(): JsonField<OffsetDateTime> = rejectedAt

    /**
     * Returns the raw JSON value of [sessionDuration].
     *
     * Unlike [sessionDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_duration")
    @ExcludeMissing
    fun _sessionDuration(): JsonField<Long> = sessionDuration

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    /**
     * Returns the raw JSON value of [transferAt].
     *
     * Unlike [transferAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transfer_at")
    @ExcludeMissing
    fun _transferAt(): JsonField<OffsetDateTime> = transferAt

    /**
     * Returns the raw JSON value of [transferMode].
     *
     * Unlike [transferMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transfer_mode")
    @ExcludeMissing
    fun _transferMode(): JsonField<String> = transferMode

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
        private var apiVersion: JsonField<Long> = JsonMissing.of()
        private var approvedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var callbackUrl: JsonField<String> = JsonMissing.of()
        private var callbackUrlNotification: JsonField<String> = JsonMissing.of()
        private var disableNotification: JsonField<Boolean> = JsonMissing.of()
        private var disableNotificationDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var exportType: JsonField<String> = JsonMissing.of()
        private var filteringScoreAmlSuspicions: JsonField<Float> = JsonMissing.of()
        private var finishedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var ip: JsonField<String> = JsonMissing.of()
        private var language: JsonField<String> = JsonMissing.of()
        private var locationIp: JsonField<String> = JsonMissing.of()
        private var needReviewAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var notificationConfirmation: JsonField<Boolean> = JsonMissing.of()
        private var qrCode: JsonField<String> = JsonMissing.of()
        private var rawData: JsonField<Boolean> = JsonMissing.of()
        private var rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var sessionDuration: JsonField<Long> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var transferAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var transferMode: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(technicalData: TechnicalData) = apply {
            activeAmlSuspicions = technicalData.activeAmlSuspicions
            apiVersion = technicalData.apiVersion
            approvedAt = technicalData.approvedAt
            callbackUrl = technicalData.callbackUrl
            callbackUrlNotification = technicalData.callbackUrlNotification
            disableNotification = technicalData.disableNotification
            disableNotificationDate = technicalData.disableNotificationDate
            exportType = technicalData.exportType
            filteringScoreAmlSuspicions = technicalData.filteringScoreAmlSuspicions
            finishedAt = technicalData.finishedAt
            ip = technicalData.ip
            language = technicalData.language
            locationIp = technicalData.locationIp
            needReviewAt = technicalData.needReviewAt
            notificationConfirmation = technicalData.notificationConfirmation
            qrCode = technicalData.qrCode
            rawData = technicalData.rawData
            rejectedAt = technicalData.rejectedAt
            sessionDuration = technicalData.sessionDuration
            startedAt = technicalData.startedAt
            transferAt = technicalData.transferAt
            transferMode = technicalData.transferMode
            additionalProperties = technicalData.additionalProperties.toMutableMap()
        }

        /**
         * Flag indicating whether there are active research AML (Anti-Money Laundering) suspicions
         * for the object when you apply for a new entry or get an existing one.
         */
        fun activeAmlSuspicions(activeAmlSuspicions: Boolean) =
            activeAmlSuspicions(JsonField.of(activeAmlSuspicions))

        /**
         * Sets [Builder.activeAmlSuspicions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activeAmlSuspicions] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activeAmlSuspicions(activeAmlSuspicions: JsonField<Boolean>) = apply {
            this.activeAmlSuspicions = activeAmlSuspicions
        }

        /** Version number of the API used. */
        fun apiVersion(apiVersion: Long) = apiVersion(JsonField.of(apiVersion))

        /**
         * Sets [Builder.apiVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiVersion] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiVersion(apiVersion: JsonField<Long>) = apply { this.apiVersion = apiVersion }

        /** Timestamp when the request or process was approved. */
        fun approvedAt(approvedAt: OffsetDateTime) = approvedAt(JsonField.of(approvedAt))

        /**
         * Sets [Builder.approvedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
            this.approvedAt = approvedAt
        }

        /** URL to receive callback data from the AML system. */
        fun callbackUrl(callbackUrl: String) = callbackUrl(JsonField.of(callbackUrl))

        /**
         * Sets [Builder.callbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbackUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callbackUrl(callbackUrl: JsonField<String>) = apply { this.callbackUrl = callbackUrl }

        /** URL to receive notification updates about the processing status. */
        fun callbackUrlNotification(callbackUrlNotification: String) =
            callbackUrlNotification(JsonField.of(callbackUrlNotification))

        /**
         * Sets [Builder.callbackUrlNotification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbackUrlNotification] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun callbackUrlNotification(callbackUrlNotification: JsonField<String>) = apply {
            this.callbackUrlNotification = callbackUrlNotification
        }

        /** Flag to indicate if notifications are disabled. */
        fun disableNotification(disableNotification: Boolean) =
            disableNotification(JsonField.of(disableNotification))

        /**
         * Sets [Builder.disableNotification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disableNotification] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun disableNotification(disableNotification: JsonField<Boolean>) = apply {
            this.disableNotification = disableNotification
        }

        /** Timestamp when notifications were disabled; null if never disabled. */
        fun disableNotificationDate(disableNotificationDate: OffsetDateTime?) =
            disableNotificationDate(JsonField.ofNullable(disableNotificationDate))

        /**
         * Sets [Builder.disableNotificationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disableNotificationDate] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun disableNotificationDate(disableNotificationDate: JsonField<OffsetDateTime>) = apply {
            this.disableNotificationDate = disableNotificationDate
        }

        /** Export format defined by the API (e.g., "json", "xml"). */
        fun exportType(exportType: String) = exportType(JsonField.of(exportType))

        /**
         * Sets [Builder.exportType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exportType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun exportType(exportType: JsonField<String>) = apply { this.exportType = exportType }

        /** Minimum filtering score (between 0 and 1) for AML suspicions to be considered. */
        fun filteringScoreAmlSuspicions(filteringScoreAmlSuspicions: Float) =
            filteringScoreAmlSuspicions(JsonField.of(filteringScoreAmlSuspicions))

        /**
         * Sets [Builder.filteringScoreAmlSuspicions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filteringScoreAmlSuspicions] with a well-typed [Float]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun filteringScoreAmlSuspicions(filteringScoreAmlSuspicions: JsonField<Float>) = apply {
            this.filteringScoreAmlSuspicions = filteringScoreAmlSuspicions
        }

        /** Timestamp when the process finished. */
        fun finishedAt(finishedAt: OffsetDateTime) = finishedAt(JsonField.of(finishedAt))

        /**
         * Sets [Builder.finishedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.finishedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun finishedAt(finishedAt: JsonField<OffsetDateTime>) = apply {
            this.finishedAt = finishedAt
        }

        /** IP address of the our system handling the request. */
        fun ip(ip: String) = ip(JsonField.of(ip))

        /**
         * Sets [Builder.ip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ip] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ip(ip: JsonField<String>) = apply { this.ip = ip }

        /** Language preference used in the client workspace (e.g., "fra"). */
        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        /** IP address of the end client (final user) captured. */
        fun locationIp(locationIp: String) = locationIp(JsonField.of(locationIp))

        /**
         * Sets [Builder.locationIp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locationIp] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun locationIp(locationIp: JsonField<String>) = apply { this.locationIp = locationIp }

        /** Timestamp indicating when the request or process needs review; null if none. */
        fun needReviewAt(needReviewAt: OffsetDateTime?) =
            needReviewAt(JsonField.ofNullable(needReviewAt))

        /**
         * Sets [Builder.needReviewAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.needReviewAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun needReviewAt(needReviewAt: JsonField<OffsetDateTime>) = apply {
            this.needReviewAt = needReviewAt
        }

        /** Flag indicating if notification confirmation is required or received. */
        fun notificationConfirmation(notificationConfirmation: Boolean) =
            notificationConfirmation(JsonField.of(notificationConfirmation))

        /**
         * Sets [Builder.notificationConfirmation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notificationConfirmation] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun notificationConfirmation(notificationConfirmation: JsonField<Boolean>) = apply {
            this.notificationConfirmation = notificationConfirmation
        }

        /** Indicates whether QR code is enabled ("true" or "false"). */
        fun qrCode(qrCode: String) = qrCode(JsonField.of(qrCode))

        /**
         * Sets [Builder.qrCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.qrCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun qrCode(qrCode: JsonField<String>) = apply { this.qrCode = qrCode }

        /** Flag indicating whether to include raw data in the response. */
        fun rawData(rawData: Boolean) = rawData(JsonField.of(rawData))

        /**
         * Sets [Builder.rawData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rawData] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rawData(rawData: JsonField<Boolean>) = apply { this.rawData = rawData }

        /** Timestamp when the request or process was rejected; null if not rejected. */
        fun rejectedAt(rejectedAt: OffsetDateTime?) = rejectedAt(JsonField.ofNullable(rejectedAt))

        /**
         * Sets [Builder.rejectedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rejectedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
            this.rejectedAt = rejectedAt
        }

        /** Duration of the user session in seconds. */
        fun sessionDuration(sessionDuration: Long) = sessionDuration(JsonField.of(sessionDuration))

        /**
         * Sets [Builder.sessionDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionDuration] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionDuration(sessionDuration: JsonField<Long>) = apply {
            this.sessionDuration = sessionDuration
        }

        /** Timestamp when the process started. */
        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        /** Date/time of data transfer. */
        fun transferAt(transferAt: OffsetDateTime) = transferAt(JsonField.of(transferAt))

        /**
         * Sets [Builder.transferAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transferAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transferAt(transferAt: JsonField<OffsetDateTime>) = apply {
            this.transferAt = transferAt
        }

        /** Mode of data transfer. */
        fun transferMode(transferMode: String) = transferMode(JsonField.of(transferMode))

        /**
         * Sets [Builder.transferMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transferMode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transferMode(transferMode: JsonField<String>) = apply {
            this.transferMode = transferMode
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
         * Returns an immutable instance of [TechnicalData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TechnicalData =
            TechnicalData(
                activeAmlSuspicions,
                apiVersion,
                approvedAt,
                callbackUrl,
                callbackUrlNotification,
                disableNotification,
                disableNotificationDate,
                exportType,
                filteringScoreAmlSuspicions,
                finishedAt,
                ip,
                language,
                locationIp,
                needReviewAt,
                notificationConfirmation,
                qrCode,
                rawData,
                rejectedAt,
                sessionDuration,
                startedAt,
                transferAt,
                transferMode,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TechnicalData = apply {
        if (validated) {
            return@apply
        }

        activeAmlSuspicions()
        apiVersion()
        approvedAt()
        callbackUrl()
        callbackUrlNotification()
        disableNotification()
        disableNotificationDate()
        exportType()
        filteringScoreAmlSuspicions()
        finishedAt()
        ip()
        language()
        locationIp()
        needReviewAt()
        notificationConfirmation()
        qrCode()
        rawData()
        rejectedAt()
        sessionDuration()
        startedAt()
        transferAt()
        transferMode()
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
        (if (activeAmlSuspicions.asKnown() == null) 0 else 1) +
            (if (apiVersion.asKnown() == null) 0 else 1) +
            (if (approvedAt.asKnown() == null) 0 else 1) +
            (if (callbackUrl.asKnown() == null) 0 else 1) +
            (if (callbackUrlNotification.asKnown() == null) 0 else 1) +
            (if (disableNotification.asKnown() == null) 0 else 1) +
            (if (disableNotificationDate.asKnown() == null) 0 else 1) +
            (if (exportType.asKnown() == null) 0 else 1) +
            (if (filteringScoreAmlSuspicions.asKnown() == null) 0 else 1) +
            (if (finishedAt.asKnown() == null) 0 else 1) +
            (if (ip.asKnown() == null) 0 else 1) +
            (if (language.asKnown() == null) 0 else 1) +
            (if (locationIp.asKnown() == null) 0 else 1) +
            (if (needReviewAt.asKnown() == null) 0 else 1) +
            (if (notificationConfirmation.asKnown() == null) 0 else 1) +
            (if (qrCode.asKnown() == null) 0 else 1) +
            (if (rawData.asKnown() == null) 0 else 1) +
            (if (rejectedAt.asKnown() == null) 0 else 1) +
            (if (sessionDuration.asKnown() == null) 0 else 1) +
            (if (startedAt.asKnown() == null) 0 else 1) +
            (if (transferAt.asKnown() == null) 0 else 1) +
            (if (transferMode.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TechnicalData &&
            activeAmlSuspicions == other.activeAmlSuspicions &&
            apiVersion == other.apiVersion &&
            approvedAt == other.approvedAt &&
            callbackUrl == other.callbackUrl &&
            callbackUrlNotification == other.callbackUrlNotification &&
            disableNotification == other.disableNotification &&
            disableNotificationDate == other.disableNotificationDate &&
            exportType == other.exportType &&
            filteringScoreAmlSuspicions == other.filteringScoreAmlSuspicions &&
            finishedAt == other.finishedAt &&
            ip == other.ip &&
            language == other.language &&
            locationIp == other.locationIp &&
            needReviewAt == other.needReviewAt &&
            notificationConfirmation == other.notificationConfirmation &&
            qrCode == other.qrCode &&
            rawData == other.rawData &&
            rejectedAt == other.rejectedAt &&
            sessionDuration == other.sessionDuration &&
            startedAt == other.startedAt &&
            transferAt == other.transferAt &&
            transferMode == other.transferMode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            activeAmlSuspicions,
            apiVersion,
            approvedAt,
            callbackUrl,
            callbackUrlNotification,
            disableNotification,
            disableNotificationDate,
            exportType,
            filteringScoreAmlSuspicions,
            finishedAt,
            ip,
            language,
            locationIp,
            needReviewAt,
            notificationConfirmation,
            qrCode,
            rawData,
            rejectedAt,
            sessionDuration,
            startedAt,
            transferAt,
            transferMode,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TechnicalData{activeAmlSuspicions=$activeAmlSuspicions, apiVersion=$apiVersion, approvedAt=$approvedAt, callbackUrl=$callbackUrl, callbackUrlNotification=$callbackUrlNotification, disableNotification=$disableNotification, disableNotificationDate=$disableNotificationDate, exportType=$exportType, filteringScoreAmlSuspicions=$filteringScoreAmlSuspicions, finishedAt=$finishedAt, ip=$ip, language=$language, locationIp=$locationIp, needReviewAt=$needReviewAt, notificationConfirmation=$notificationConfirmation, qrCode=$qrCode, rawData=$rawData, rejectedAt=$rejectedAt, sessionDuration=$sessionDuration, startedAt=$startedAt, transferAt=$transferAt, transferMode=$transferMode, additionalProperties=$additionalProperties}"
}
