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

    testImplementation(project(":samples"))
}

tasks {
    compileJava {
        options.release = jreVersion.asInt()
    }
    compileGroovy {
        options.release = jreVersion.asInt()
    }
    codenarcTest {
        // `:` in loop conditions cannot be broken to multiline
        exclude(
            "problems1_100/ContainerWithMostWaterTest.groovy",
            "problems1_100/FindTheIndexOfTheFirstOccurrenceInAStringTest.groovy",
            "problems1_100/LongestPalindromicSubstringTest.groovy",
            "problems1_100/LongestSubstringWithoutRepeatingCharactersTest.groovy",
            "problems1_100/MedianOfTwoSortedArraysTest.groovy",
            "problems1_100/RemoveDuplicatesFromSortedArrayTest.groovy",
            "problems1_100/RemoveNthNodeFromEndOfListTest.groovy",
            "problems1_100/SearchInsertPositionTest.groovy",
        )
    }
    jacocoTestReport {
        reports.xml.required = true
    }
}
