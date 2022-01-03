dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Crypto"
include(":app")
include(":core")
include(":core-ui")
include(":coin-feature-api")
include(":coin-feature-impl")
