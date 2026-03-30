pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Adding the repository to fetch our custom Android SDK to use it in this project.
        maven {
            url = uri("https://jitpack.io")
        }
    }
}

rootProject.name = "TimeTrackerSDK"
include(":app")
include(":timetracker")
