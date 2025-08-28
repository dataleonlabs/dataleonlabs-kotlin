plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Dataleon - API Reference")
                description.set("The Dataleon KYC & KYB API enables automated identity (KYC) and business (KYB)\ndocument verification.\n\n### KYC API (Know Your Customer)\n\nUpload documents to verify an individual's identity:\n\n- Passport\n- National ID card\n- Driver's license\n- Proof of address\n- Selfie (optional, for biometric match)\n\n**Use case example:**\n\n> A user registers on your platform and must provide an identity document. Send\n> it via the KYC API and receive a structured response or notification via\n> `callback_url`.\n\n### KYB API (Know Your Business)\n\nUpload documents to verify a business entity:\n\n- Company registration certificate (e.g., Kbis)\n- Company statutes\n- Bank account certificate (RIB)\n- Tax declaration\n- Financial statements\n- Bank statements\n\n**Use case example:**\n\n> A business partner registers. Collect required corporate documents\n> automatically using the KYB API.\n\n### Authentication\n\nAll requests must include an API key:\n\n```http\nApi-Key: your_api_key_here\n```\n\n### Supported formats\n\n- File types: PDF, JPEG, PNG\n- Max size: 100 MB\n- You may provide a public `url` instead of directly uploading the file.\n\n### Response\n\nEvery request returns a structured document object containing the processing\nstatus, document ID, and access URL.")
                url.set("https://www.github.com/dataleonlabs/dataleonlabs-kotlin")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Dataleonlabs")
                        email.set("support@dataleon.ai")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/dataleonlabs/dataleonlabs-kotlin.git")
                    developerConnection.set("scm:git:git://github.com/dataleonlabs/dataleonlabs-kotlin.git")
                    url.set("https://github.com/dataleonlabs/dataleonlabs-kotlin")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
