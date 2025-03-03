plugins {
    `java-library`
}

dependencies {
    api(project(":testing:res"))
    api(libs.gson)
    api(libs.truth)
}
