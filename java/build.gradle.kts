val jdkVersion = JavaLanguageVersion.of(libs.versions.jdk.get())
val jreVersion = JavaLanguageVersion.of(libs.versions.jre.get())

plugins {
    java
    checkstyle
    jacoco
}

java.toolchain.languageVersion.set(jdkVersion)

checkstyle.toolVersion = libs.versions.checkstyle.get()

dependencies {
    checkstyle(libs.rulebook.checkstyle)

    testImplementation(project(":samples"))
}

tasks {
    compileJava {
        options.release = jreVersion.asInt()
    }
    jacocoTestReport {
        reports.xml.required = true
    }
}
