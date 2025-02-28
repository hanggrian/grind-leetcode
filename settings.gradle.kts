pluginManagement.repositories {
    gradlePluginPortal()
    mavenCentral()
}
dependencyResolutionManagement.repositories.mavenCentral()

rootProject.name = "grind-leetcode"

include(
    "groovy",
    "java",
    "kotlin",
)
include(
    "samples",
    "website",
)
