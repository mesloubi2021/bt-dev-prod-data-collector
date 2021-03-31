plugins {
    `java-platform`
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:2.4.4"))

    constraints {
        api("org.flywaydb:flyway-core:7.7.1")
    }
}