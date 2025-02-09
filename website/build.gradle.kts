val developerId: String by project
val developerName: String by project
val developerUrl: String by project
val releaseArtifact: String by project
val releaseDescription: String by project
val releaseUrl: String by project

plugins {
    alias(libs.plugins.pages)
    alias(libs.plugins.git.publish)
}

pages {
    val docs = rootProject.layout.projectDirectory.dir("docs")
    docs
        .dir("concepts")
        .files("list_node.md", "tree_node.md")
        .forEach { content("concept_${it.nameWithoutExtension}.html", it) }
    docs
        .files("problems1", "problems101")
        .flatMap { it.listFiles()?.toList() ?: emptyList() }
        .filter { it.extension == "md" }
        .forEach { content("${it.nameWithoutExtension}.html", it) }

    minimal {
        authorName = developerName
        authorUrl = developerUrl
        projectName = releaseArtifact
        projectDescription = releaseDescription
        projectUrl = releaseUrl
    }
}

gitPublish {
    repoUri.set("git@github.com:$developerId/$releaseArtifact.git")
    branch.set("gh-pages")
    contents.from(pages.outputDirectory)
}

tasks.register(LifecycleBasePlugin.CLEAN_TASK_NAME) {
    delete(layout.buildDirectory)
}
