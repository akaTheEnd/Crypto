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
include(":feature-coin-api")
include(":feature-coin-impl")
