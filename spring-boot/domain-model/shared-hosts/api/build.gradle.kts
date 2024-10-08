plugins {
    java
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
    implementation(project(":domain-model:inventory:model"))
    implementation(project(":domain-model:inventory:adapters"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}
