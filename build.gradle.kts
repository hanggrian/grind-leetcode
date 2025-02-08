subprojects {
    tasks.withType<JacocoReport>().configureEach {
        reports.xml.required = true
    }
}
