import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    `java-library`
    id("org.springframework.boot") version "3.3.4"
    id("io.spring.dependency-management") version "1.1.6"
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
    api(project(":domain-model:identity:model"))
    api("org.springframework.boot:spring-boot-starter-data-jpa")
}

tasks.named<BootJar>("bootJar") {
    enabled = false
}
