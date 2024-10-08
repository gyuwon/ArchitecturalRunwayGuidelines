plugins {
    `java-library`
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(":domain-model:inventory:contracts"))
}

tasks.named<Jar>("jar") {
    archiveBaseName.set("inventory.model")
}
