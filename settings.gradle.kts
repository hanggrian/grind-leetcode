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
    "testing:res",
    "testing:js",
    "testing:jvm",
)
include("website")
