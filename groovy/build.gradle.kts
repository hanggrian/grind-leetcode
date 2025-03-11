val jdkVersion = JavaLanguageVersion.of(libs.versions.jdk.get())
val jreVersion = JavaLanguageVersion.of(libs.versions.jre.get())

plugins {
    groovy
    codenarc
    jacoco
}

java.toolchain.languageVersion.set(jdkVersion)

codenarc.toolVersion = libs.versions.codenarc.get()

dependencies {
    codenarc(libs.rulebook.codenarc)

    implementation(libs.groovy)

    testImplementation(project(":testing:jvm"))
}

tasks {
    compileJava {
        options.release = jreVersion.asInt()
    }
    compileGroovy {
        options.release = jreVersion.asInt()
    }
    jacocoTestReport {
        reports.xml.required = true
    }
}
