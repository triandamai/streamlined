import io.github.reactivecircus.streamlined.Libraries

plugins {
    `streamlined-plugin`
    kotlin("jvm")
    kotlin("kapt")
    id("com.android.lint")
}

dependencies {
    api(project(":domain-api"))

    // Blueprint
    api(Libraries.blueprint.interactorCoroutines)
    api(Libraries.blueprint.asyncCoroutines)

    // Dagger
    implementation(Libraries.dagger.runtime)
    kapt(Libraries.dagger.compiler)

    // Unit tests
    testImplementation(Libraries.junit)
    testImplementation(Libraries.truth)
    testImplementation(project(":domain-testing"))
    testImplementation(project(":coroutines-test-ext"))
}
