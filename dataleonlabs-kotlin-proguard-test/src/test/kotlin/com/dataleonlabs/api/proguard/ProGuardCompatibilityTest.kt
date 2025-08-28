// File generated from our OpenAPI spec by Stainless.

package com.dataleonlabs.api.proguard

import com.dataleonlabs.api.client.okhttp.DataleonlabsOkHttpClient
import com.dataleonlabs.api.core.jsonMapper
import com.dataleonlabs.api.models.companies.AmlSuspicion
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/dataleonlabs-kotlin-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = DataleonlabsOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.companies()).isNotNull()
        assertThat(client.individuals()).isNotNull()
    }

    @Test
    fun amlSuspicionRoundtrip() {
        val jsonMapper = jsonMapper()
        val amlSuspicion =
            AmlSuspicion.builder()
                .caption("Suspicious activity")
                .country("FR")
                .gender("M")
                .relation("linked")
                .schema("v1")
                .score(0.85f)
                .source("https://aml-checker.example.com/api/v1/suspicion/12345")
                .status(AmlSuspicion.Status.PENDING)
                .type(AmlSuspicion.Type.PEP)
                .build()

        val roundtrippedAmlSuspicion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(amlSuspicion),
                jacksonTypeRef<AmlSuspicion>(),
            )

        assertThat(roundtrippedAmlSuspicion).isEqualTo(amlSuspicion)
    }
}
