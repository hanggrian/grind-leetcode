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
        .files("list-node.md", "tree-node.md")
        .forEach { content("concept-${it.nameWithoutExtension}.html", it) }
    docs
        .asFile
        .listFiles()
        .filter { it.name != "concepts" }
        .flatMap { it.listFiles()?.toList() ?: emptyList() }
        .filter { it.extension == "md" }
        .forEach { content("${it.nameWithoutExtension}.html", it) }

    cayman {
        authorName = developerName
        authorUrl = developerUrl
        projectName = releaseArtifact
        projectDescription = releaseDescription
        projectUrl = releaseUrl

        darkMode = true
        colorPrimary = "#ffa116"
        colorSecondary = "#1890ff"
        colorSecondaryContainer = "#1890ff"
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
