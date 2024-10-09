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
    api(project(":domain-model:orders:contracts"))
}

tasks.named<Jar>("jar") {
    archiveBaseName.set("orders.command-model")
}
