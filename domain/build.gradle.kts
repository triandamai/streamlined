import io.github.reactivecircus.streamlined.libraries

plugins {
    `streamlined-plugin`
    id("kotlin")
    id("kotlin-kapt")
}

dependencies {
    // Kotlin stdlib
    implementation(libraries.kotlinStdlib)

    // Blueprint
    implementation(libraries.blueprint.interactorCoroutines)
    implementation(libraries.blueprint.asyncCoroutines)

    // Coroutines
    implementation(libraries.kotlinx.coroutines.core)

    // Dagger
    implementation(libraries.dagger.runtime)
    kapt(libraries.dagger.compiler)

    // Unit tests
    testImplementation(libraries.junit)
    testImplementation(libraries.mockk)
    testImplementation(libraries.truth)
    testImplementation(project(":coroutines-test-ext"))
}
