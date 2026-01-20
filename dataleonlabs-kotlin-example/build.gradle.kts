plugins {
    id("dataleonlabs.kotlin")
    application
}

dependencies {
    implementation(project(":dataleonlabs-kotlin-core"))
    implementation(project(":dataleonlabs-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :dataleonlabs-kotlin-example:run` to run `Main`
    // Use `./gradlew :dataleonlabs-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.dataleonlabs.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
