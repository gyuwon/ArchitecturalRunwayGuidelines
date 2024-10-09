plugins {
    java
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
}

tasks.named<Jar>("jar") {
    archiveBaseName.set("orders.contracts")
}
